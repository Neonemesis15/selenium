package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {

	WebDriver driver;
	private String mensajeDeEntrada;
	private String xPathMensajeDeEntrada;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getMensajeDeEntrada() {
		return mensajeDeEntrada;
	}

	public String getMensajeInicialMostrado(){
		return getTextoByXPath(xPathMensajeDeEntrada);
	}
	
	public void setMensajeDeEntrada(String value) {
		mensajeDeEntrada = value;
	}

	public String getxPathMensajeDeEntrada() {
		return xPathMensajeDeEntrada;
	}

	public void setxPathMensajeDeEntrada(String xPathMensajeDeEntrada) {
		this.xPathMensajeDeEntrada = xPathMensajeDeEntrada;
	}

	public boolean getElementoEstaHabilitado(WebElement elemento){
		return (elemento.getAttribute("disabled")== null);
	}

	public boolean getElementoEstaSeleccionado(WebElement elemento){
		return (elemento.getAttribute("checked")!= null);
	}
	
	public String getTextoById(String id){
		return driver.findElement(By.id(id)).getText();
	}
	
	public String getTextoByXPath(String xPath){
		return driver.findElement(By.xpath(xPath)).getText();
	}

	public String getTextoBySelector(String selector){
		return driver.findElement(By.cssSelector(selector)).getText();
	}
	
	public void tipearTextoById(String id, String texto){
		driver.findElement(By.id(id)).sendKeys(texto);
	}
}
