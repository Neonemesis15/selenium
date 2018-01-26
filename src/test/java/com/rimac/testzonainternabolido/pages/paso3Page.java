package com.rimac.testzonainternabolido.pages;

import org.openqa.selenium.WebDriver;

public class paso3Page extends basePasoPage{

	//Ids opciones...
	public final String opcionDeporte = "1"; // "deporte";
	public final String opcionBelleza = "2"; // "belleza";
	public final String opcionFullCarros = "3"; // "fullcarros";
	public final String opcionHotel = "4"; // "hotel";
	public final String opcionComida = "5"; // "comida";
	public final String opcionEntretenimiento = "6"; // "entretenimiento";
	
	public paso3Page(WebDriver driver) {
		super(driver);

		setIdDelPaso("step3");
		setMensajeDeEntrada("Tenemos beneficios para ti, pero queremos saber qué es lo que más te interesa");
		
		getOpcionesDelPaso().put(opcionDeporte, "Deporte");
		getOpcionesDelPaso().put(opcionBelleza, "Belleza");
		getOpcionesDelPaso().put(opcionFullCarros, "Full Carros");
		getOpcionesDelPaso().put(opcionHotel, "Hoteles");
		getOpcionesDelPaso().put(opcionComida, "!Comida¡");
		getOpcionesDelPaso().put(opcionEntretenimiento, "Entretenimiento");
		
		setIdBotonContinuar("btnContinue3");
	}
}
