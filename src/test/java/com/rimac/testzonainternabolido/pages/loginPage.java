package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage extends BasePage{
	private String url;
	
	public loginPage(WebDriver driver, String url) {
		super(driver);
		this.url = url;
	}
	
	public void navegar() {
		driver.get(url);
	}
	
	public void tipearUsuario(String usuario) {
		driver.findElement(By.id("username")).sendKeys(usuario);
	}

	public void tipearClave(String clave) {
		driver.findElement(By.id("password")).sendKeys(clave);
	}
	
	public void ingresar() {
		driver.findElement(By.id("btnlogin")).click();
	}

	public void registrarNuevoUsuario() {
		driver.findElement(By.id("registro")).click();
	}
	
	public boolean getBotonLoginEstaHabilitado() {
		WebElement boton = driver.findElement(By.id("btnlogin"));
		boolean habilitado = (boton.getAttribute("disabled")== null);
		return habilitado;
	}
}