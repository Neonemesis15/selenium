package com.rimac.testzonainternabolido.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basePasoPage extends BasePage{

	//Valores esperados...
	private String idDelPaso;
	private String idBotonContinuar;
	private Map<String, String> opcionesDelPaso = new HashMap<String, String>();
	private String xPathMensajeDelPaso;

	public basePasoPage(WebDriver driver) {
		super(driver);
	}
	
	public String getIdDelPaso() {
		return idDelPaso;
	}

	public void setIdDelPaso(String value) {
		idDelPaso = value;
		xPathMensajeDelPaso = "//*[@id='" + idDelPaso + "']/div/div/div/div/h4";
	}
	
	public String getIdBotonContinuar(){
		return idBotonContinuar;
	}

	public void setIdBotonContinuar(String value) {
		idBotonContinuar = value;
	}

	public Map<String, String> getOpcionesDelPaso() {
		return opcionesDelPaso;
	}

	public void setOpcionesDelPaso(Map<String, String> object) {
		opcionesDelPaso = object;
	}

	public String getxPathMensajeDelPaso() {
		return xPathMensajeDelPaso;
	}
	
	@Override
	public String getMensajeInicialMostrado() {
		return getTextoByXPath(xPathMensajeDelPaso);
	}

	public void seleccionarOpcion(String idOpcion) {
		driver.findElement(By.cssSelector("label[for='" + idOpcion + "']")).click();
	}
	
	public boolean getOpcionEstaSeleccionada(String idOpcion){
		WebElement radio = driver.findElement(By.id(idOpcion));
		return getElementoEstaSeleccionado(radio);
	}

	public boolean getBotonContinuarEstaHabilitado(){
		WebElement boton = driver.findElement(By.id(idBotonContinuar));
		return getElementoEstaHabilitado(boton);
	}

	public void continuar() {
		driver.findElement(By.id(idBotonContinuar)).click();;
	}
}
