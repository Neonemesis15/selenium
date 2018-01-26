package com.rimac.testzonainternabolido;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.rimac.testzonainternabolido.pages.basePasoPage;
import com.rimac.testzonainternabolido.pages.listoPage;
import com.rimac.testzonainternabolido.pages.loginPage;
import com.rimac.testzonainternabolido.pages.paso1Page;
import com.rimac.testzonainternabolido.pages.paso2Page;
import com.rimac.testzonainternabolido.pages.paso3Page;
import com.rimac.testzonainternabolido.pages.welcomePage;


public class zonaInternaHappyPathTest extends baseTest{
/*
	@Test
	public void test_IngresoAPaso1_correcto() {
		try {
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			
			String message = welcome.getMensajeInicialMostrado();
			LOG.info("Mensaje post-login: " + message);
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
			
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			assertEquals(paso1.getMensajeDeEntrada(), message);
			assertFalse(paso1.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}
	
	@Test 
	public void test_Paso1SeleccionOpciontrabajo_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			LOG.info("Mensaje post-login: " + message);
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
			
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoTrabajo);
			verificarOpcionUnicaSeleccionada(paso1, paso1.opcionUsoTrabajo);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_Paso1AlternarOpcion_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoTrabajo);
			verificarOpcionUnicaSeleccionada(paso1, paso1.opcionUsoTrabajo);
			
			paso1.seleccionarOpcion(paso1.opcionUsoFamilia);
			verificarOpcionUnicaSeleccionada(paso1, paso1.opcionUsoFamilia);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}
	
	@Test 
	public void test_IngresoAPaso2Opciontrabajo_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoTrabajo);
			paso1.continuar();
			
			assertEquals(paso2.getMensajeDeEntrada(),paso2.getMensajeInicialMostrado());
			assertFalse(paso2.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_IngresoAPaso2Opcionfamilia_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoFamilia);
			paso1.continuar();
			
			assertEquals(paso2.getMensajeDeEntrada(),paso2.getMensajeInicialMostrado());
			assertFalse(paso2.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_IngresoAPaso2Opciondiversion_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			assertEquals(paso2.getMensajeDeEntrada(), paso2.getMensajeInicialMostrado());
			assertFalse(paso2.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_Paso2SeleccionOpcionViajaTodaFamilia_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaTodaFamilia);
			verificarOpcionUnicaSeleccionada(paso2, paso2.opcionViajaTodaFamilia);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_Paso2SeleccionOpcionViajaSolo_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaSolo);
			verificarOpcionUnicaSeleccionada(paso2, paso2.opcionViajaSolo);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_Paso2SeleccionOpcionViajaConHijos_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaConHijos);
			verificarOpcionUnicaSeleccionada(paso2, paso2.opcionViajaConHijos);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_Paso2SeleccionOpcionViajaConPareja_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaConPareja);
			verificarOpcionUnicaSeleccionada(paso2, paso2.opcionViajaConPareja);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_IngresoAPaso3_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			paso3Page paso3 = new paso3Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaTodaFamilia);
			paso2.continuar();
			
			message = paso3.getMensajeInicialMostrado();
			LOG.info("Mensaje paso3: " + message);
			assertEquals(paso3.getMensajeDeEntrada(), message);
			assertFalse(paso3.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_Paso3SeleccionarOpcionDeporte_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			paso3Page paso3 = new paso3Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			List<String> opcionesSeleccionadas = new ArrayList<String>();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaTodaFamilia);
			paso2.continuar();
			
			message = paso3.getMensajeInicialMostrado();
			LOG.info("Mensaje paso3: " + message);

			if (!message.contains(paso3.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 3"); 
			}
			
			paso3.seleccionarOpcion(paso3.opcionDeporte);
			opcionesSeleccionadas.add(paso3.opcionDeporte);
			
			verificarOpcionesMultiplesSeleccionadas(paso3, opcionesSeleccionadas);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_Paso3SeleccionarOpcionDeporteMasBelleza_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			paso3Page paso3 = new paso3Page(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			String message = welcome.getMensajeInicialMostrado();
			List<String> opcionesSeleccionadas = new ArrayList<String>();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaTodaFamilia);
			paso2.continuar();
			
			message = paso3.getMensajeInicialMostrado();
			LOG.info("Mensaje paso3: " + message);

			if (!message.contains(paso3.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 3"); 
			}
			
			paso3.seleccionarOpcion(paso3.opcionDeporte);
			opcionesSeleccionadas.add(paso3.opcionDeporte);
			
			paso3.seleccionarOpcion(paso3.opcionBelleza);
			opcionesSeleccionadas.add(paso3.opcionBelleza);
			
			verificarOpcionesMultiplesSeleccionadas(paso3,opcionesSeleccionadas);
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Test 
	public void test_IngresoAPaginaListo_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			paso3Page paso3 = new paso3Page(driver);
			listoPage listo = new listoPage(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			List<String> opcionesSeleccionadas = new ArrayList<String>();
			
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaTodaFamilia);
			paso2.continuar();
			
			message = paso3.getMensajeInicialMostrado();
			LOG.info("Mensaje paso3: " + message);

			if (!message.contains(paso3.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 3"); 
			}
			
			paso3.seleccionarOpcion(paso3.opcionFullCarros);
			opcionesSeleccionadas.add(paso3.opcionFullCarros);
			
			paso3.seleccionarOpcion(paso3.opcionDeporte);
			opcionesSeleccionadas.add(paso3.opcionDeporte);
			
			paso3.seleccionarOpcion(paso3.opcionComida);
			opcionesSeleccionadas.add(paso3.opcionComida);
			
			paso3.continuar();
			
			message = listo.getMensajeInicialMostrado();
			LOG.info("Mensaje paso3: " + message);
			
			assertEquals(listo.getMensajeDeEntrada(), message);
			assertTrue(listo.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}
*/
	@Test 
	public void test_IngresoAZonaInterna_ok(){
		try{
			loginPage login = new loginPage(driver, urlLogin);
			welcomePage welcome = new welcomePage(driver);
			paso1Page paso1 = new paso1Page(driver);
			paso2Page paso2 = new paso2Page(driver);
			paso3Page paso3 = new paso3Page(driver);
			listoPage listo = new listoPage(driver);
			
			login.navegar();
			login.tipearUsuario(usuario);
			login.tipearClave(clave);
			login.ingresar();
			List<String> opcionesSeleccionadas = new ArrayList<String>();
			
			String message = welcome.getMensajeInicialMostrado();
			
			if (!message.contains(welcome.getMensajeDeEntrada())){
				throw new Exception("Login fallido"); 
			}
				
			welcome.continuar();
			message = paso1.getMensajeInicialMostrado();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
			LOG.info("Mensaje paso1: " + message);
			
			if(!message.contains(paso1.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 1"); 
			}
			
			paso1.seleccionarOpcion(paso1.opcionUsoDiversion);
			paso1.continuar();
			
			message = paso2.getMensajeInicialMostrado();
			LOG.info("Mensaje paso2: " + message);
			
			if (!message.contains(paso2.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 2"); 
			}
			
			paso2.seleccionarOpcion(paso2.opcionViajaTodaFamilia);
			paso2.continuar();
			
			message = paso3.getMensajeInicialMostrado();
			LOG.info("Mensaje paso3: " + message);

			if (!message.contains(paso3.getMensajeDeEntrada())){
				throw new Exception("No llegó al paso 3"); 
			}
			
			paso3.seleccionarOpcion(paso3.opcionFullCarros);
			opcionesSeleccionadas.add(paso3.opcionFullCarros);
			
			paso3.seleccionarOpcion(paso3.opcionDeporte);
			opcionesSeleccionadas.add(paso3.opcionDeporte);
			
			paso3.seleccionarOpcion(paso3.opcionComida);
			opcionesSeleccionadas.add(paso3.opcionComida);
			
			paso3.continuar();
			
			message = listo.getMensajeInicialMostrado();
			LOG.info("Mensaje paso3: " + message);
			
			assertEquals(listo.getMensajeDeEntrada(),message);
			assertTrue(listo.getBotonContinuarEstaHabilitado());
		} 
		catch (Exception e) {
			e.printStackTrace();
			LOG.error("Error: " + e.getMessage());
			assertTrue("Falló: " + e.getMessage(), false);
		}
	}

	@Override
	public void verificarOpcionUnicaSeleccionada(basePasoPage paso, String opcionSeleccionada) throws Exception{
		super.verificarOpcionUnicaSeleccionada(paso, opcionSeleccionada);

		assertTrue(paso.getBotonContinuarEstaHabilitado());
	}

	@Override
	public void verificarOpcionesMultiplesSeleccionadas(basePasoPage paso, List<String> opcionesSeleccionadas) throws Exception{
		super.verificarOpcionesMultiplesSeleccionadas(paso, opcionesSeleccionadas);

		assertTrue(paso.getBotonContinuarEstaHabilitado());
	}
}
