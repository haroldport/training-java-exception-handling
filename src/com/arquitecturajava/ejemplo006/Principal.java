package com.arquitecturajava.ejemplo006;

public class Principal {

	public static void main(String[] args) {
		
		//excepcion no chequeada
		//Persona p = null;
		
		Persona p = new Persona();
		p.setNombre("Harold");
		
		if(p != null) {
			System.out.println(p.getNombre());
		}

	}

}
