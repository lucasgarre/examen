package FinProject;

/**
 * @author <Pon aquí tu nombre>
 * Esta clase es la que se debe utilizar para resolver el Ejercicio 3
 */
public class Modelo3 {

	/** 
	 * @param billete es el número premiado
	 * @param premio es la cantidad premiada
	 * @return Devuelve "Guardado" si el todo ha ido bien y "Número existente" en caso de que ya existiera en la base de datos
	 * @SQL INSERT INTO premios VALUES(<billete>,<premio>) - para insertar
	 * @SQL SELECT * FROM premios WHERE billete=<billete> - para comprobar
	 */
	public String setPrize (String billete, String premio){
		// Sustituye este return por tu resultado
		return "Sin hacer - Guardar";
	}

	/** 
	 * @param billete es el número que hay que eliminar de la base de datos
	 * @return Devuelve "Borrado" si todo ha ido bien y "Número no encontrado" en caso de que el billete no estuviera guardado.
	 * @SQL DELETE FROM premios WHERE billete=<billete>;
	 */
	public String delPrize (String billete){
		// Sustituye este return por tu resultado
		return "Sin hacer - Borrar";
	}
	
	/**
	 * @param billete es el número que hay que buscar en la base de datos
	 * @return Devuelve el premio asociado al billete o "Sin premio" en caso de que no estuviera en la base de datos.
	 * @SQL SELECT premio FROM premios WHERE billete=<billete>;
	 */
	public String getPrize (String billete){
		// Sustituye este return por tu resultado
		return "Sin hacer - Comprobar";
	}
}
