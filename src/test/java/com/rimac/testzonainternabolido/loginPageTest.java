package com.rimac.testzonainternabolido;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rimac.testzonainternabolido.pages.loginPage;
import com.rimac.testzonainternabolido.pages.welcomePage;

public class loginPageTest extends baseTest {
	private String mensajeUsuarioErrado = "Your username is invalid!";
	private String mensajeClaveErrada = "Your password is invalid!";
	
	@Test
	public void test_IngresoLoginCorrecto_ok() {
		loginPage login = new loginPage(driver, urlLogin);
		
		login.navegar();
		
		assertFalse(login.getBotonLoginEstaHabilitado());
	}

	@Test
	public void test_PaginaLoginCorrecta_ok() {
		loginPage login = new loginPage(driver, urlLogin);
		
		login.navegar();
		login.tipearUsuario(usuario);
		login.tipearClave(clave);

		assertTrue(login.getBotonLoginEstaHabilitado());
	}
	
	@Test
	public void test_LogueoCorrecto_ok() {
		loginPage login = new loginPage(driver, urlLogin);
		welcomePage welcome = new welcomePage(driver);
		
		login.navegar();
		login.tipearUsuario(usuario);
		login.tipearClave(clave);
		login.ingresar();
		String message = welcome.getMensajeInicialMostrado();
		LOG.info("Mensaje post-login: " + message);

		assertEquals(welcome.getMensajeDeEntrada(),message);
	}

	@Test
	public void test_LoginSinDNI_NoOk() {
		loginPage login = new loginPage(driver, urlLogin);
		
		login.navegar();
		login.tipearUsuario("1234");
		login.tipearClave(clave);
		
		assertFalse(login.getBotonLoginEstaHabilitado());
	}
	
	@Test
	public void test_login_usuarioincorrecto() {
		
		loginPage login = new loginPage(driver, urlLogin);
		welcomePage welcome = new welcomePage(driver);
		
		login.navegar();
		login.tipearUsuario(usuario+".mx");
		login.tipearClave(clave);
		login.ingresar();
		String message = welcome.getMensajeDeEntrada().trim();
		LOG.info("Mensaje post-login: " + message);
		assertEquals(mensajeUsuarioErrado,message);
	}

	@Test
	public void test_login_claveincorrecta() {
		loginPage login = new loginPage(driver, urlLogin);
		welcomePage welcome = new welcomePage(driver);
		
		login.navegar();
		login.tipearUsuario(usuario);
		login.tipearClave(clave + "123");
		login.ingresar();
		String message = welcome.getMensajeDeEntrada();
		LOG.info("Mensaje post-login: " + message);
		
		assertEquals(mensajeClaveErrada,message);
	}
	
}