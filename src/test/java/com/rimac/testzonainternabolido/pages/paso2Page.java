package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.WebDriver;

public class paso2Page extends basePasoPage{
	
	//Ids opciones...
	public final String opcionViajaSolo = "opcion1";
	public final String opcionViajaConPareja = "opcion2";
	public final String opcionViajaConHijos = "opcion3";
	public final String opcionViajaTodaFamilia = "opcion4";
	
	public paso2Page(WebDriver driver) {
		super(driver);
		
		setIdDelPaso("step2");
		setMensajeDeEntrada("¿Quiénes viajan contigo usualmente?");
		
		getOpcionesDelPaso().put(opcionViajaSolo, "Sólo yo, I’m a lone wolf");
		getOpcionesDelPaso().put(opcionViajaConPareja, "Mi pareja y yo <3");
		getOpcionesDelPaso().put(opcionViajaConHijos, "Mis hijos y yo");
		getOpcionesDelPaso().put(opcionViajaTodaFamilia, "Toda la familia");
		
		setIdBotonContinuar("btnContinue2");
	}
	
}
