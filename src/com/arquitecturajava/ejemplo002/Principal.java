package com.arquitecturajava.ejemplo002;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		//ejemplo manejando multiples excepciones, se pueden poner varios catch
		//o en una misma clausula catch se separan con pipe las distintas excepciones
		try {
			//el programa funciona
			File f = new File("hola.txt");
			f.createNewFile();
			DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
			Date miFecha = df.parse("03/03-2017");
			System.out.println("El fichero se ha creado correctamente");
			System.out.println(miFecha);
		} catch(IOException | ParseException e) {
			//si se genera un error saltamos a esta linea e imprimimos el mensaje
			System.out.println(e.getMessage());
		} /*catch (ParseException e) {
			System.out.println("Hay un error en la fecha: " + e.getMessage());
		}*/

	}

}
