package com.rimac.testzonainternabolido;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rimac.testzonainternabolido.pages.basePasoPage;

public abstract class baseTest {
	
	//Variables que serán parámetros...
	//public static String urlLogin = "file:///D:/jmontes/Rimac/Bolido/ZonaInterna/zonainternabolido/src/main/webapp/views-bolido/index.html";
	public static String urlLogin = "http://localhost:3000/";
	public static String usuario = "test@prueba.com.pe";
	public static String clave = "912345678";
	//private static String rutaSelenium = "D:\\Compartido\\ASD-2017-II - 20171217\\02_Programas\\chromedriver_win32\\chromedriver.exe"; 
	private static String rutaSelenium = "D:\\Driver\\chromedriver.exe"; 
	
	private static int timeOut = 30;
	public static final Logger LOG = LoggerFactory.getLogger(baseTest.class);
	public static WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", rutaSelenium);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		LOG.info("Driver Creado!!");
	}
	
	@After
	public void tearDown() {
		driver.quit();
		LOG.info("Driver terminado!!");
	}

	public void verificarOpcionUnicaSeleccionada(basePasoPage paso, String opcionSeleccionada) throws Exception{
		Map<String, String> opciones = paso.getOpcionesDelPaso();
		
		if (opciones.containsKey(opcionSeleccionada)){
			assertTrue(paso.getOpcionEstaSeleccionada(opcionSeleccionada));
			
			for(Map.Entry<String, String> opc : opciones.entrySet()) {
				if (opc.getKey()!=opcionSeleccionada){
					assertFalse(paso.getOpcionEstaSeleccionada(opc.getKey()));
				}
			}
		}
		else{
			throw new Exception("Opción no existe");
		}
	}

	public void verificarOpcionesMultiplesSeleccionadas(basePasoPage paso, List<String> opcionesSeleccionadas) throws Exception{
		Map<String, String> opciones = paso.getOpcionesDelPaso();
		
		for(String opcSeleccionada : opcionesSeleccionadas)
		{
			if (!opciones.containsKey(opcSeleccionada)){
				throw new Exception("No existe opción: " + opcSeleccionada);
			}
		}
		
		for(Map.Entry<String, String> opc : opciones.entrySet()) {
			if (opcionesSeleccionadas.contains(opc.getKey())){
				assertTrue(paso.getOpcionEstaSeleccionada(opc.getKey()));
			}
			else{
				assertFalse(paso.getOpcionEstaSeleccionada(opc.getKey()));
			}
		}
	}
}
