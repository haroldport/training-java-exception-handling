package com.arquitecturajava.ejemplo001;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		//la unidad F no existe
		//va a saltar un error
		try {
			//el programa funciona
			File f = new File("F://hola.txt");
			f.createNewFile();
		} catch(IOException e) {
			//si se genera un error saltamos a esta linea e imprimimos el mensaje
			System.out.println(e.getMessage());
		}

	}

}
