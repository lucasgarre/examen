package FinProject;

import java.util.Scanner;

/**
 * @author <Pon aquí tu nombre>
 * Esta clase es la que se debe utilizar para resolver el Ejercicio 2
 */
public class Modelo2 {
	
	Alumno alumno;
	
	/**
	 * Añade los atributos y métodos que necesites
	 */
	public class Alumno {
		public String addAsignatura (String titulo, String nota){
			// Sustituye este return por tu resultado
			Scanner leer = new Scanner (System.in);
			System.out.println("Introduzca la nota");
			
			return "Sin hacer";
		}
	}
	
	/**
	 * Añade los atributos y métodos que necesites
	 */
	public class Asignatura {

	}
	
	/**
	 * No modificar el constructor
	 */
	public Modelo2(){
		alumno = new Alumno();
	}
	
	/**
	 * No modificar este método
	 */
	public String addAsignatura (String titulo, String nota){
		return alumno.addAsignatura(titulo, nota);
	}
}
