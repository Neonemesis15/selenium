package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomePage extends BasePage{

	public welcomePage(WebDriver driver) {
		super(driver);
		
		setMensajeDeEntrada("empecemos tu experiencia CarroxCarro");
		setxPathMensajeDeEntrada("//*[@id='welcome']/div/div/div/p");
	}
	
	public void continuar() {
		driver.findElement(By.id("btnVamos")).click();
	}
}