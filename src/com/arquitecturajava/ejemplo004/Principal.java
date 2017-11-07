package com.arquitecturajava.ejemplo004;

public class Principal {

	public static void main(String[] args) {
		//el programa principal no tiene ninguna clausula try/catch
		try {
			Servicio.miMetodo();
		} catch (Exception e) {
			System.out.println("Ventana de alerta: " + e.getMessage());
		}
	
	}

}
