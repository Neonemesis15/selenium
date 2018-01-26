package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class listoPage extends BasePage{
	
	private final String xPathMensajeDeEntrada = "//*[@id='ready']/div/div/div/div[1]/h4";
	private final String mensajeDeEntrada = "¡Listo!\nBienvenido a tu ¿web/zona? Carro x Carro";
	
	private final String idBotonContinuar = "btnEmpezar";

	public listoPage(WebDriver driver) {
		super(driver);
		
		setMensajeDeEntrada(mensajeDeEntrada);
		setxPathMensajeDeEntrada(xPathMensajeDeEntrada);
	}

	public boolean getBotonContinuarEstaHabilitado() {
		WebElement boton = driver.findElement(By.id(idBotonContinuar));
		return getElementoEstaHabilitado(boton);
	}
	
	public void continuar() {
		driver.findElement(By.id(idBotonContinuar)).click();
	}
}
