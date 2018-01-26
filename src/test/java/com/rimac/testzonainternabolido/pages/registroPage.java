package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registroPage extends basePasoPage{
	
	//Ids opciones...
	public final String opcionDNI = "dniradio";
	public final String opcionCE = "ceradio";
	
	//Ids preguntas...
	public final String idPreguntaNombreAbuelo = "1";
	public final String idPreguntaNombreProfesor = "2";
	public final String idPreguntaNombrePadre = "3";
	public final String idPreguntaNombreColegio = "4";
	public final String idPreguntaCentroTrabajo = "PS_TRABAJO";
	public final String idPreguntaNombreMascota = "PS_MASCOTA";
		
	//Ids, xPaths y cssSelectors...
	public final String idDNI = "dni";
	public final String idCelular = "phone";
	public final String idBotonContinuar = "btnContinue";
	public final String idAceptaTerminos = "checkConditions";
	public final String idRespuesta = "rptaInput";
	public final String idBotonFinalizar = "btnFinalizar";
	
	public final String xPathTerminos = "//*[@id='form-signup']/div[1]/div[2]/p/label/a";
	public final String xPathMensajeEntradaPreguntas = "//*[@id='form-signup']/div[2]/p";
	public final String xPathSelectPreguntas = "//*[@id='form-signup']/div[2]/div[1]/select";
	
	//Valores esperados...
	private final String mensajeDeEntrada = "Regístrate";
	private final String mensajeEntradaPreguntas = "La siguiente pregunta y respuesta de seguridad te permitirán recordar tus accesos en caso lo olvides.";
	
	public registroPage(WebDriver driver){
		super(driver);
		
		setMensajeDeEntrada(mensajeDeEntrada); 
		setIdDelPaso("signup");
		setIdBotonContinuar(idBotonContinuar);
		
		getOpcionesDelPaso().put(opcionDNI, "DNI");
		getOpcionesDelPaso().put(opcionCE, "Carnet de Extranjería");
	}

	public boolean getOpcionDNIEstaSeleccionada() {
		WebElement opcion = driver.findElement(By.id(opcionDNI));
		return getElementoEstaSeleccionado(opcion);
	}

	public void tipearDNI(String usuario) {
		tipearTextoById(idDNI,usuario);
	}

	public void tipearCelular(String celular) {
		tipearTextoById(idCelular,celular);
	}

	public void tipearRespuesta(String respuesta){
		tipearTextoById(idRespuesta,respuesta);
	}
	
	public void verTerminos(String clave) {
		driver.findElement(By.xpath(xPathTerminos)).click();
	}

	public void aceptarTerminos() {
		driver.findElement(By.cssSelector("label[for='" + idAceptaTerminos + "']")).click();
	}
	
	public boolean getTerminosFueronAceptados() {
		WebElement checkbox = driver.findElement(By.id(idAceptaTerminos));
		return getElementoEstaSeleccionado(checkbox);
	}
	
	public String getMensajeDeEntradaPreguntas(){
		return mensajeEntradaPreguntas;
	}

	public String getMensajeDeEntradaPreguntasMostrado(){
		return driver.findElement(By.xpath(xPathMensajeEntradaPreguntas)).getText();
	}

	public void seleccionarPregunta(String idPregunta) {
		Select select = new Select(driver.findElement(By.xpath(xPathSelectPreguntas)));
		select.selectByValue(idPregunta);
	}

	public boolean getBotonFinalizarEstaHabilitado() {
		WebElement boton = driver.findElement(By.id(idBotonFinalizar));
		return getElementoEstaHabilitado(boton);
	}
	
	public void finalizar() {
		driver.findElement(By.id(idBotonFinalizar)).click();
	}
}
