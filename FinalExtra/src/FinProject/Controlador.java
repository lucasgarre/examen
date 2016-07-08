package FinProject;

/**
 * @author <Pon aquí tu nombre>
 * Desde esta clase se incial el proyecto
 */
public class Controlador {

	public static void main(String[] args) {
		Modelo1 miModelo1 = new Modelo1();
		Modelo2 miModelo2 = new Modelo2();
		Modelo3 miModelo3 = new Modelo3();
		
		Vista miVista = new Vista(miModelo1, miModelo2, miModelo3);
		miVista.setVisible(true);

	}

}
