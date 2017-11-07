package com.arquitecturajava.ejemplo004;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicio {

	static void miMetodo() throws Exception {
		//ejemplo usando clausula finally
		//el codigo de ese bloque se ejecuta siempre asi funcione o falle
		try {
			//el programa funciona
			File f = new File("F://hola.txt");
			f.createNewFile();
			DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
			Date miFecha = df.parse("03/03/2017");
			System.out.println("El fichero se ha creado correctamente");
			System.out.println(miFecha);
		} catch(IOException | ParseException e) {
			//si se genera un error saltamos a esta linea e imprimimos el mensaje
			System.out.println("Log a fichero: El metodo falla por: " + e.getMessage());
			throw e;
		} /*catch (ParseException e) {
			System.out.println("Hay un error en la fecha: " + e.getMessage());
		}*/ finally {
			System.out.println("Cerrando todos los recursos");
		}
	}

}
