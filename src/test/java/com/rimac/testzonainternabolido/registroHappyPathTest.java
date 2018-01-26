package com.rimac.testzonainternabolido;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rimac.testzonainternabolido.pages.loginPage;
import com.rimac.testzonainternabolido.pages.registroPage;
import com.rimac.testzonainternabolido.pages.welcomePage;

public class registroHappyPathTest extends baseTest{

	@Test
	public void test_IngresoARegistroDeUsuario_ok() {
		try {
			loginPage login = new loginPage(driver, urlLogin);
			registroPage registro = new registroPage(driver);
			
			login.navegar();
			login.registrarNuevoUsuario();
			
			String message = registro.getMensajeInicialMostrado();
			LOG.info("Mensaje post-login: " + message);
			
			assertEquals(registro.getMensajeDeEntrada(), message);
			assertFalse(registro.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Falló: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test
	public void test_SeleccionarDNI_ok() {
		try {
			loginPage login = new loginPage(driver, urlLogin);
			registroPage registro = new registroPage(driver);
			
			login.navegar();
			login.registrarNuevoUsuario();
			
			String message = registro.getMensajeInicialMostrado();
			LOG.info("Mensaje de ingreso a: " + message);
			
			if (!message.equals(registro.getMensajeDeEntrada())){
				throw new Exception("No ingresó a registrar");
			}
			
			registro.seleccionarOpcion(registro.opcionDNI);
			this.verificarOpcionUnicaSeleccionada(registro, registro.opcionDNI);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Falló: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test
	public void test_IngresoDatos_ok() {
		try {
			loginPage login = new loginPage(driver, urlLogin);
			registroPage registro = new registroPage(driver);
			
			login.navegar();
			login.registrarNuevoUsuario();
			
			String message = registro.getMensajeInicialMostrado();
			LOG.info("Mensaje de ingreso a: " + message);
			
			if (!message.equals(registro.getMensajeDeEntrada())){
				throw new Exception("No ingresó a registrar");
			}
			
			registro.seleccionarOpcion(registro.opcionDNI);
			if (!registro.getOpcionDNIEstaSeleccionada()){
				throw new Exception("No se seleccionó la opción DNI");
			}
			
			registro.tipearDNI(usuario);
			registro.tipearCelular(clave);
			registro.aceptarTerminos();
			
			assertTrue(registro.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Falló: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test
	public void test_Registro_ok() {
		try {
			loginPage login = new loginPage(driver, urlLogin);
			registroPage registro = new registroPage(driver);
			
			login.navegar();
			login.registrarNuevoUsuario();
			
			String message = registro.getMensajeInicialMostrado();
			LOG.info("Mensaje de ingreso a: " + message);
			
			if (!message.equals(registro.getMensajeDeEntrada())){
				throw new Exception("No ingresó a registrar");
			}
			
			registro.seleccionarOpcion(registro.opcionDNI);
			if (!registro.getOpcionDNIEstaSeleccionada()){
				throw new Exception("No se seleccionó la opción DNI");
			}
			
			registro.tipearDNI(usuario);
			registro.tipearCelular(clave);
			registro.aceptarTerminos();
			
			if (!registro.getBotonContinuarEstaHabilitado()){
				throw new Exception("No se habilitó el boton de continuar");
			}
			
			registro.continuar();
			
			assertEquals(registro.getMensajeDeEntradaPreguntas(), registro.getMensajeDeEntradaPreguntasMostrado());
			assertFalse(registro.getBotonFinalizarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Falló: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}
	

	@Test
	public void test_ResponderPregunta_ok() {
		try {
			loginPage login = new loginPage(driver, urlLogin);
			registroPage registro = new registroPage(driver);
			
			login.navegar();
			login.registrarNuevoUsuario();
			
			String message = registro.getMensajeInicialMostrado();
			LOG.info("Mensaje de ingreso a: " + message);
			
			if (!message.equals(registro.getMensajeDeEntrada())){
				throw new Exception("No ingresó a registrar");
			}
			
			registro.seleccionarOpcion(registro.opcionDNI);
			if (!registro.getOpcionDNIEstaSeleccionada()){
				throw new Exception("No se seleccionó la opción DNI");
			}
			
			registro.tipearDNI(usuario);
			registro.tipearCelular(clave);
			registro.aceptarTerminos();
			
			if (!registro.getBotonContinuarEstaHabilitado()){
				throw new Exception("No se habilitó el boton de continuar");
			}
			
			registro.continuar();
			
			if (!registro.getMensajeDeEntradaPreguntas().equals(registro.getMensajeDeEntradaPreguntasMostrado())){
				throw new Exception("No llegó a la sección de preguntas");
			}
			
			registro.seleccionarPregunta(registro.idPreguntaNombreAbuelo);
			registro.tipearRespuesta("Dr. Chapatín");
			
			assertTrue(registro.getBotonFinalizarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Falló: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test
	public void test_IngresoPrimeraPregunta_ok() {
		try {
			loginPage login = new loginPage(driver, urlLogin);
			registroPage registro = new registroPage(driver);
			welcomePage welcome = new welcomePage(driver);
			
			login.navegar();
			login.registrarNuevoUsuario();
			
			String message = registro.getMensajeInicialMostrado();
			LOG.info("Mensaje de ingreso a: " + message);
			
			if (!message.equals(registro.getMensajeDeEntrada())){
				throw new Exception("No ingresó a registrar");
			}
			
			registro.seleccionarOpcion(registro.opcionDNI);
			if (!registro.getOpcionDNIEstaSeleccionada()){
				throw new Exception("No se seleccionó la opción DNI");
			}
			
			registro.tipearDNI(usuario);
			registro.tipearCelular(clave);
			registro.aceptarTerminos();
			
			if (!registro.getBotonContinuarEstaHabilitado()){
				throw new Exception("No se habilitó el boton de continuar");
			}
			
			registro.continuar();
			
			if (!registro.getMensajeDeEntradaPreguntas().equals(registro.getMensajeDeEntradaPreguntasMostrado())){
				throw new Exception("No llegó a la sección de preguntas");
			}
			
			registro.seleccionarPregunta(registro.idPreguntaNombreAbuelo);
			registro.tipearRespuesta("Dr. Chapatín");
			
			if(!registro.getBotonFinalizarEstaHabilitado()){
				throw new Exception("No se habilitó el botón Finalizar");
			}
			
			registro.finalizar();
			
			message = welcome.getMensajeInicialMostrado();
			LOG.info("Mensaje post-login: " + message);
			
			assertEquals(welcome.getMensajeDeEntrada(),message);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Falló: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

}
