package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.WebDriver;

public class paso1Page extends basePasoPage{
	
	//Ids opciones...
	public final String opcionUsoTrabajo = "uso_trabajo";
	public final String opcionUsoFamilia = "uso_familia";
	public final String opcionUsoDiversion = "uso_diversion";
		
	public paso1Page(WebDriver driver) {
		super(driver);

		setIdDelPaso("step1");
		setMensajeDeEntrada("¿Cuál es el uso principal que le das a tu carro?");
		
		getOpcionesDelPaso().put(opcionUsoTrabajo, "Voy/Regreso del trabajo");
		getOpcionesDelPaso().put(opcionUsoFamilia, "Movilidad de mis hijos");
		getOpcionesDelPaso().put(opcionUsoDiversion, "Salgo los fines de semana");
		
		setIdBotonContinuar("btnContinue");
	}
}
