package FinProject;

import java.util.Scanner;

/**
 * @author <Pon aqu� tu nombre>
 * Esta clase es la que se debe utilizar para resolver el Ejercicio 2
 */
public class Modelo2 {
	
	Alumno alumno;
	
	/**
	 * A�ade los atributos y m�todos que necesites
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
	 * A�ade los atributos y m�todos que necesites
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
	 * No modificar este m�todo
	 */
	public String addAsignatura (String titulo, String nota){
		return alumno.addAsignatura(titulo, nota);
	}
}
