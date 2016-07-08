package FinProject;

import java.sql.*;

/**
 * @author <Pon aquí tu nombre>
 * Esta clase es la que se debe utilizar para resolver el Ejercicio 3
 * 
 */

public class Modelo3 {
	private String surl = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static Connection conexion;
	private Statement stmt;
	private ResultSet rset;
	// Atributos de la clase

	/** 
	 * @param billete es el número premiado
	 * @param premio es la cantidad premiada
	 * @return Devuelve "Guardado" si el todo ha ido bien y "Número existente" en caso de que ya existiera en la base de datos
	 * @SQL INSERT INTO premios VALUES(<billete>,<premio>) - para insertar
	 * @SQL SELECT * FROM premios WHERE billete=<billete> - para comprobar
	 */
	public String setPrize (String billete, String premio){
		String error=""; 
		try {
			stmt= conexion.createStatement();
			int result = stmt.executeUpdate("INSERT INTO examenjava.PREMIOS VALUES ("  +numSocio+  ",'" + Nombre + "','" + Apellido + "','" + DNI + "'," + Telefono +")" );   //  INSERT INTO TABLA VALUES ()
		System.out.println("---->"+result);
		} catch (SQLException e) {
			// TODO: handle exception
			error = e.getMessage();
			System.out.println("--->"+error);
		}return error;
		
		
	}
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
	public static void ConexionBd(){
	
		
		// Constructor que crea la conexión
				try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String mi_url = "jdbc:oracle:thin:@localhost:1521:XE";
				conexion = DriverManager.getConnection(mi_url, "SYSTEM", "Nokia5320@");
				System.out.println("-- Conexión establecida --");
			} catch (ClassNotFoundException e) {
				System.out.println("No tengo el driver cargado");
			} catch (SQLException e) {
				System.out.println("Falla la conexión");
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}

}
