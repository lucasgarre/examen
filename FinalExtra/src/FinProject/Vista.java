package FinProject;

import javax.swing.JPanel;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

/***************************************/
/* IMPORTANTE: NO MODIFICAR ESTA CLASE */
/***************************************/

public class Vista extends JFrame {

	private Modelo1 miModelo1;
	private Modelo2 miModelo2;
	private Modelo3 miModelo3;
	private JPanel contentPane;
	private JLabel lblResAbundante, lblResHex, lblResCartas, lblAreaRect,
			lblResMedia, lblRes;
	private JTextField txtNumero, txtHex, n1, n2, n3, n4;
	private JTextField txtBillete, txtPremio,
			txtTitulo, txtNota;
	private JTextField txtCod, txtDesc;
	private JLabel lblInfo;

	public Vista(Modelo1 m1, Modelo2 m2, Modelo3 m3) {
		this.miModelo1 = m1;
		this.miModelo2 = m2;
		this.miModelo3 = m3;

		setTitle("Examen Final Ordinario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// coordenadas de las esquinas del frame en el escritorio
		setSize(500, 400);
		setLocationRelativeTo(null);

		// el panel que contiene todo se crea y se pone en el frame
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// distribución nula para poder posicionar los elementos en las
		// coordenadas que queramos
		contentPane.setLayout(null);

		// se crea el panel de pestañas gracias a JTabbedPane
		JTabbedPane panelDePestanas = new JTabbedPane(JTabbedPane.TOP);
		// se posiciona en el panel
		panelDePestanas.setBounds(10, 11, 460, 340);
		contentPane.add(panelDePestanas);

		// panel1 -> Ejercicio 1
				JPanel panel1 = new JPanel();
				panelDePestanas.addTab("Ejericio 1 - 4 p", null, panel1, null);
				panel1.setLayout(null);
				
						JLabel lbl1 = new JLabel("Número:");
						lbl1.setBounds(9, 63, 59, 14);
						panel1.add(lbl1);
						
								txtNumero = new JTextField();
								txtNumero.setBounds(117, 60, 60, 20);
								panel1.add(txtNumero);
								txtNumero.setColumns(10);
								
										JButton btnAbundante = new JButton("esAbundate");
										btnAbundante.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												lblResAbundante.setText(miModelo1.esAbundante(txtNumero.getText()));
												txtNumero.setText("");
											}
										});
										btnAbundante.setBounds(187, 59, 127, 23);
										panel1.add(btnAbundante);
										
												JLabel lblPtos1_1 = new JLabel("1 pto");
												lblPtos1_1.setBounds(399, 63, 56, 14);
												panel1.add(lblPtos1_1);
												
														JLabel lblHexadecimal = new JLabel("Hexadecimal:");
														lblHexadecimal.setBounds(9, 124, 86, 14);
														panel1.add(lblHexadecimal);
														
																txtHex = new JTextField();
																txtHex.setBounds(117, 121, 60, 20);
																panel1.add(txtHex);
																txtHex.setColumns(10);
																
																		lblResHex = new JLabel("");
																		lblResHex.setBounds(324, 124, 71, 14);
																		panel1.add(lblResHex);
																		
																				lblResAbundante = new JLabel("");
																				lblResAbundante.setBounds(324, 63, 71, 14);
																				panel1.add(lblResAbundante);
																				
																						JButton btnSiguiente = new JButton("Siguiente");
																						btnSiguiente.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																								lblResHex.setText(miModelo1.siguienteHex(txtHex.getText()));
																								txtHex.setText("");
																							}
																						});
																						btnSiguiente.setBounds(187, 120, 127, 23);
																						panel1.add(btnSiguiente);
																						
																								JLabel lblPtos1_2 = new JLabel("1,5 ptos");
																								lblPtos1_2.setBounds(399, 124, 56, 14);
																								panel1.add(lblPtos1_2);
																								
																										JLabel lblPtos1_3 = new JLabel("1,5 ptos");
																										lblPtos1_3.setBounds(399, 222, 56, 14);
																										panel1.add(lblPtos1_3);
																										
																												JLabel lblNumeros = new JLabel("N\u00FAmeros:");
																												lblNumeros.setBounds(9, 183, 59, 14);
																												panel1.add(lblNumeros);
																												
																														n1 = new JTextField();
																														n1.setBounds(31, 219, 25, 20);
																														panel1.add(n1);
																														n1.setColumns(10);
																														
																																n2 = new JTextField();
																																n2.setColumns(10);
																																n2.setBounds(66, 219, 25, 20);
																																panel1.add(n2);
																																
																																		n3 = new JTextField();
																																		n3.setColumns(10);
																																		n3.setBounds(135, 219, 25, 20);
																																		panel1.add(n3);
																																		
																																				n4 = new JTextField();
																																				n4.setColumns(10);
																																				n4.setBounds(101, 219, 25, 20);
																																				panel1.add(n4);
																																				
																																						lblResCartas = new JLabel("");
																																						lblResCartas.setBounds(324, 222, 59, 14);
																																						panel1.add(lblResCartas);
																																						
																																								JButton btnEscalera = new JButton("Consecutivos");
																																								btnEscalera.addActionListener(new ActionListener() {
																																									public void actionPerformed(ActionEvent e) {
																																										String[] nums = { n1.getText(), n2.getText(), n3.getText(), n4.getText()};
																																										lblResCartas.setText(miModelo1.consecutivos(nums));
																																										n1.setText("");
																																										n2.setText("");
																																										n3.setText("");
																																										n4.setText("");
																																									}
																																								});
																																								btnEscalera.setBounds(187, 218, 127, 23);
																																								panel1.add(btnEscalera);
																																								
																																										JLabel lblEjercicioStr = new JLabel("Ejercicio 1: Strings y Arrays");
																																										lblEjercicioStr.setFont(new Font("Tahoma", Font.BOLD, 13));
																																										lblEjercicioStr.setBounds(9, 11, 386, 29);
																																										panel1.add(lblEjercicioStr);

		

		// panel2 -> Ejercicio 2
		JPanel panel2 = new JPanel();
		panelDePestanas.addTab("Ejercicio 2 - 3 p", null, panel2, null);
		panel2.setLayout(null);
		JLabel lblEjercicioRelaciones = new JLabel(
				"Ejercicio 2: Relaciones entre Objetos");
		lblEjercicioRelaciones.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEjercicioRelaciones.setBounds(10, 11, 386, 29);
		panel2.add(lblEjercicioRelaciones);

		JLabel lblAlumno = new JLabel("Media del Alumno:");
		lblAlumno.setFont(new Font("Sylfaen", Font.ITALIC, 13));
		lblAlumno.setBounds(10, 72, 121, 14);
		panel2.add(lblAlumno);

		JLabel lblTitulo = new JLabel("Título:");
		lblTitulo.setBounds(114, 144, 46, 14);
		panel2.add(lblTitulo);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(185, 141, 86, 20);
		panel2.add(txtTitulo);
		txtTitulo.setColumns(10);

		JLabel lblAsignatura = new JLabel("Asignatura:");
		lblAsignatura.setFont(new Font("Sylfaen", Font.ITALIC, 13));
		lblAsignatura.setBounds(53, 119, 78, 14);
		panel2.add(lblAsignatura);

		JLabel lblNota = new JLabel("Nota:");
		lblNota.setBounds(114, 186, 46, 14);
		panel2.add(lblNota);

		txtNota = new JTextField();
		txtNota.setBounds(185, 183, 86, 20);
		panel2.add(txtNota);
		txtNota.setColumns(10);

		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResMedia.setText(miModelo2.addAsignatura(txtTitulo.getText(), txtNota.getText()));
				txtTitulo.setText("");
				txtNota.setText("");
			}
		});
		btnAnadir.setBounds(301, 182, 78, 23);
		panel2.add(btnAnadir);

		lblAreaRect = new JLabel("");
		lblAreaRect.setBounds(333, 133, 86, 14);
		panel2.add(lblAreaRect);

		lblResMedia = new JLabel("");
		lblResMedia.setBounds(185, 72, 91, 14);
		panel2.add(lblResMedia);

		JLabel label2 = new JLabel("3 ptos");
		label2.setBounds(407, 186, 38, 14);
		panel2.add(label2);
		
				// panel3 -> Ejercicio 3
		JPanel panel3 = new JPanel();
		panelDePestanas.addTab("Ejercicio 3 - 3 p", null, panel3, null);
		panel3.setLayout(null);
		JLabel lblEjercicioFicheros = new JLabel("Ejercicio 3: Bases de Datos");
		lblEjercicioFicheros.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEjercicioFicheros.setBounds(10, 11, 386, 29);
		panel3.add(lblEjercicioFicheros);

		JLabel lblBillete = new JLabel("Billete:");
		lblBillete.setBounds(10, 75, 75, 14);
		panel3.add(lblBillete);

		JLabel lblPremio = new JLabel("Premio:");
		lblPremio.setBounds(10, 117, 75, 14);
		panel3.add(lblPremio);

		txtBillete = new JTextField();
		txtBillete.setBounds(95, 72, 86, 20);
		panel3.add(txtBillete);
		txtBillete.setColumns(10);

		txtPremio = new JTextField();
		txtPremio.setBounds(95, 114, 86, 20);
		panel3.add(txtPremio);
		txtPremio.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblInfo.setText(miModelo3.setPrize(txtBillete.getText(), txtPremio.getText()));
				txtBillete.setText("");
				txtPremio.setText("");
			}
		});
		btnGuardar.setBounds(255, 71, 104, 23);
		panel3.add(btnGuardar);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblInfo.setText(miModelo3.delPrize(txtBillete.getText()));
				txtBillete.setText("");
				txtPremio.setText("");
			}
		});
		btnBorrar.setBounds(255, 113, 104, 23);
		panel3.add(btnBorrar);

		JLabel lblPto3_1 = new JLabel("1 pto");
		lblPto3_1.setBounds(399, 75, 46, 14);
		panel3.add(lblPto3_1);

		JLabel lbl3_2 = new JLabel("1 pto");
		lbl3_2.setBounds(399, 117, 46, 14);
		panel3.add(lbl3_2);

		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblInfo.setText(miModelo3.getPrize(txtBillete.getText()));
				txtBillete.setText("");
				txtPremio.setText("");
			}
		});
		btnComprobar.setBounds(255, 155, 104, 23);
		panel3.add(btnComprobar);

		JLabel lbl3_3 = new JLabel("1 pto");
		lbl3_3.setBounds(399, 159, 46, 14);
		panel3.add(lbl3_3);
		
		JLabel lblRes3 = new JLabel("Resultado:");
		lblRes3.setBounds(10, 221, 75, 14);
		panel3.add(lblRes3);
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(95, 221, 159, 14);
		panel3.add(lblInfo);

	}
}
