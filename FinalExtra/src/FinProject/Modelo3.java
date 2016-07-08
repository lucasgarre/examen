package FinProject;

<<<<<<< HEAD
import java.sql.*;

/**
 * @author <Pon aquí tu nombre>
 * Esta clase es la que se debe utilizar para resolver el Ejercicio 3
 * 
 */



public class Modelo3 {
	

	// Atributos de la clase
		private String surl = "jdbc:oracle:thin:@localhost:1521:XE";
		private Connection conexion;
		private Statement stmt;
		private ResultSet rset;
		

		// Constructor que crea la conexión
		public Modelo3() {
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
	
	
	
=======
/**
 * @author <Pon aquí tu nombre>
 * Esta clase es la que se debe utilizar para resolver el Ejercicio 3
 */
public class Modelo3 {

>>>>>>> origin/master
	/** 
	 * @param billete es el número premiado
	 * @param premio es la cantidad premiada
	 * @return Devuelve "Guardado" si el todo ha ido bien y "Número existente" en caso de que ya existiera en la base de datos
	 * @SQL INSERT INTO premios VALUES(<billete>,<premio>) - para insertar
	 * @SQL SELECT * FROM premios WHERE billete=<billete> - para comprobar
	 */
	public String setPrize (String billete, String premio){
<<<<<<< HEAD
		String error=""; 
		try {
			stmt= conexion.createStatement();
			int result = stmt.executeUpdate("INSERT INTO examenjava.PREMIOS VALUES ("  +billete+  "," + premio+")" );   //  INSERT INTO TABLA VALUES ()
			return "Guardado";
			//System.out.println("----> Guardado");
		} catch (SQLException e) {
			// TODO: handle exception
			error = e.getMessage();
			System.out.println("--->"+error);
		}return error;
		
		
	}
		// Sustituye este return por tu resultado
		
		//return "Sin hacer - Guardar";
	
=======
		// Sustituye este return por tu resultado
		return "Sin hacer - Guardar";
	}

>>>>>>> origin/master
	/** 
	 * @param billete es el número que hay que eliminar de la base de datos
	 * @return Devuelve "Borrado" si todo ha ido bien y "Número no encontrado" en caso de que el billete no estuviera guardado.
	 * @SQL DELETE FROM premios WHERE billete=<billete>;
	 */
<<<<<<< HEAD
	public String delPrize(String billete){
		String error=""; 
		try {
			stmt= conexion.createStatement();
			
			  
			int result = stmt.executeUpdate("DELETE  FROM examenjava.premios WHERE billete= billete " );   //  INSERT INTO TABLA VALUES ()
			return "borrado";
		//System.out.println("----> Borrado ");
		} catch (SQLException e)  {
			// TODO: handle exception
			error = e.getMessage();
			System.out.println("--->"+error);
		}return error;
=======
	public String delPrize (String billete){
		// Sustituye este return por tu resultado
		return "Sin hacer - Borrar";
>>>>>>> origin/master
	}
	
	/**
	 * @param billete es el número que hay que buscar en la base de datos
	 * @return Devuelve el premio asociado al billete o "Sin premio" en caso de que no estuviera en la base de datos.
	 * @SQL SELECT premio FROM premios WHERE billete=<billete>;
	 */
	public String getPrize (String billete){
<<<<<<< HEAD
		String error=""; 
		try {
			stmt= conexion.createStatement();
			int result = stmt.executeUpdate("SELECT premio FROM examenjava.premios WHERE billete=billete" );   //  Seleccionamos el premio de la tabla premios
			return "" +result;
			//System.out.println("---->:  " +result);
		} catch (SQLException e) {
			// TODO: handle exception
			error = e.getMessage();
			System.out.println("--->"+error);
		}return error;
		// Sustituye este return por tu resultado
		//return "Sin hacer - Comprobar";
	}
	
}



=======
		// Sustituye este return por tu resultado
		return "Sin hacer - Comprobar";
	}
}
>>>>>>> origin/master
