package Evaluacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Winaplica {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Winaplica window = new Winaplica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Winaplica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 128));
		frame.setBounds(100, 100, 649, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE USUARIOS");
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 255, 255));
		panel_3.setBorder(new LineBorder(new Color(128, 255, 128), 5));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos Generales");
		lblNewLabel_1.setBounds(10, 11, 102, 14);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(10, 25, 296, 207);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(77, 11, 42, 14);
		panel_5.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(150, 8, 125, 20);
		panel_5.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Paterno");
		lblNewLabel_3.setBounds(39, 36, 101, 14);
		panel_5.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 33, 125, 20);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Materno");
		lblNewLabel_4.setBounds(39, 61, 101, 14);
		panel_5.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 58, 125, 20);
		panel_5.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha Nacimiento");
		lblNewLabel_5.setBounds(33, 86, 107, 14);
		panel_5.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(150, 83, 86, 20);
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo");
		lblNewLabel_6.setBounds(95, 116, 45, 14);
		panel_5.add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(150, 112, 101, 23);
		panel_5.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(150, 132, 101, 23);
		panel_5.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad");
		lblNewLabel_7.setBounds(61, 166, 86, 14);
		panel_5.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Antigua y Barbuda", "Bahamas", "Barbados", "Canadá", "Costa Rica", "Cuba", "Dominica", "Granda", "Jamaica ", "Estados Unidos", "México", "Panamá", "República Dominicana", "Trinidad y Tobago"}));
		comboBox.setBounds(160, 162, 115, 22);
		panel_5.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 64));
		panel_2.setBorder(new LineBorder(new Color(128, 255, 128), 5));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(10, 11, 46, 14);
		panel_2.add(lblNewLabel_8);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 128, 64));
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_7.setBounds(10, 28, 296, 204);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		chckbxNewCheckBox.setBounds(65, 125, 179, 23);
		panel_7.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar Fecha de Nacimiento");
		chckbxMostrarFechaDe.setBounds(65, 163, 179, 23);
		panel_7.add(chckbxMostrarFechaDe);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\josem\\Desktop\\Usuario1.PNG"));
		lblNewLabel_12.setBounds(101, 12, 92, 106);
		panel_7.add(lblNewLabel_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setBorder(new LineBorder(new Color(128, 255, 128), 5));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Datos Opcionales");
		lblNewLabel_9.setBounds(10, 11, 103, 14);
		panel_1.add(lblNewLabel_9);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 128, 128));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_6.setBounds(10, 29, 296, 203);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 60, 126, 107);
		panel_6.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(146, 60, 140, 107);
		panel_6.add(textArea_1);
		
		JLabel lblNewLabel_10 = new JLabel("Descripcion");
		lblNewLabel_10.setBounds(22, 35, 73, 14);
		panel_6.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Preferencias");
		lblNewLabel_11.setBounds(158, 35, 99, 14);
		panel_6.add(lblNewLabel_11);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(64, 255, 255));
		panel_4.setBorder(new LineBorder(new Color(128, 255, 128), 5));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBounds(109, 54, 89, 23);
		panel_4.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(109, 153, 89, 23);
		panel_4.add(btnSalir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(109, 103, 89, 23);
		panel_4.add(btnGuardar);
	}
}
