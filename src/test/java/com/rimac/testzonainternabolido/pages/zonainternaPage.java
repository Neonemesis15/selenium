package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.WebDriver;

public class zonainternaPage extends BasePage{

	private final String xPathMensajeDeEntrada = "//*[@id='private-zone']/div/div/div/nav/div/ul/li[2]/a";
	private final String mensajeDeEntrada = "Hola Jorge";
	
	public zonainternaPage(WebDriver driver) {
		super(driver);
		setxPathMensajeDeEntrada(xPathMensajeDeEntrada);
		setMensajeDeEntrada(mensajeDeEntrada);
	}
	
}