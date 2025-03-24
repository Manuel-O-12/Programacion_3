package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;

public class Evaluacion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evaluacion window = new Evaluacion();
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
	public Evaluacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Factura en Java-Eclipse-ArrayList y POO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del cliente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(21, 11, 108, 19);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("Datos de factura");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(21, 166, 108, 14);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 30, 644, 125);
		Border borde_1 = BorderFactory.createLineBorder(Color.BLACK, 2);
		panel_2.setBorder(borde_1);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(38, 17, 86, 33);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField("123456");
		textField.setBounds(147, 17, 161, 33);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(349, 17, 61, 33);
		panel_2.add(lblNewLabel_3);
		
		textField_1 = new JTextField("Jhon Doe");
		textField_1.setBounds(443, 17, 161, 33);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(38, 61, 61, 33);
		panel_2.add(lblNewLabel_4);
		
		textField_2 = new JTextField("Calle 1 #123");
		textField_2.setBounds(147, 61, 161, 33);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(349, 61, 61, 33);
		panel_2.add(lblNewLabel_5);
		
		textField_3 = new JTextField("5554433");
		textField_3.setBounds(443, 61, 161, 33);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 187, 644, 61);
		Border borde_3 = BorderFactory.createLineBorder(Color.BLACK, 2);
		panel_3.setBorder(borde_3);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("N° Factura:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(24, 23, 77, 14);
		panel_3.add(lblNewLabel_7);
		
		textField_4 = new JTextField("1");
		textField_4.setBounds(109, 22, 86, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(350, 23, 47, 14);
		panel_3.add(lblNewLabel_8);
		
		textField_5 = new JTextField("2025/03/23");
		textField_5.setColumns(10);
		textField_5.setBounds(407, 22, 95, 20);
		panel_3.add(textField_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 259, 644, 36);
		Border borde_2 = BorderFactory.createLineBorder(Color.BLACK, 2);
		panel_4.setBorder(borde_2);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Ver listado de facturas");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(37, 11, 139, 14);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Añadir");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(428, 13, 59, 14);
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Eliminar");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(547, 13, 52, 14);
		panel_4.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setSelected(true);
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(Evaluacion.class.getResource("/paquete/icons8-menú-2-24.png")));
		btnNewButton.setBounds(0, 2, 45, 34);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setSelected(true);
		btnNewButton_1.setRolloverEnabled(false);
		btnNewButton_1.setRequestFocusEnabled(false);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setIcon(new ImageIcon(Evaluacion.class.getResource("/paquete/icons8-más-40.png")));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setDefaultCapable(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(382, 2, 45, 34);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setSelected(true);
		btnNewButton_1_1.setRolloverEnabled(false);
		btnNewButton_1_1.setRequestFocusEnabled(false);
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setIcon(new ImageIcon(Evaluacion.class.getResource("/paquete/icons8-multiplicar-48.png")));
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setDefaultCapable(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(505, 2, 45, 34);
		panel_4.add(btnNewButton_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 296, 644, 111);
		Border borde_4 = BorderFactory.createLineBorder(Color.BLACK, 2);
		panel_5.setBorder(borde_4);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setBounds(2, 5, 640, 64);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Producto", "Cantidad", "Valor", "Sub Total"},
				{"Agua", "2", "500", "1000"},
				{"Cereal", "5", "1000", "5000"},
				{"Leche", "2", "300", "600"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		panel_5.add(table);
		
		JLabel lblNewLabel_12 = new JLabel("SubTotal:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(44, 418, 67, 14);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblDescuento = new JLabel("% Descuento:");
		lblDescuento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescuento.setBounds(44, 443, 97, 14);
		panel_1.add(lblDescuento);
		
		JLabel lblNewLabel_13 = new JLabel("IVA %19:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(44, 470, 67, 14);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Total Factura:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(44, 500, 97, 14);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Valor Descontado:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(278, 447, 120, 14);
		panel_1.add(lblNewLabel_15);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(235, 443, 21, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JButton btnNewButton_2 = new JButton("Finalizar Factura");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(391, 526, 139, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Limpiar");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(540, 526, 89, 23);
		panel_1.add(btnNewButton_2_1);
		
		textField_6 = new JTextField("6600.0");
		textField_6.setBounds(143, 418, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField("5");
		textField_7.setColumns(10);
		textField_7.setBounds(143, 442, 86, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField("1254.0");
		textField_8.setColumns(10);
		textField_8.setBounds(143, 469, 86, 20);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField("7524.0");
		textField_9.setColumns(10);
		textField_9.setBounds(143, 499, 86, 20);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField("330.0");
		textField_10.setColumns(10);
		textField_10.setBounds(401, 445, 86, 20);
		panel_1.add(textField_10);
	}
}
