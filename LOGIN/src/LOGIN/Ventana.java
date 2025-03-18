package LOGIN;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {

	public Ventana() {

		setVisible(true);
		setSize(750, 600);
		setLocationRelativeTo(null);

		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(700, 700));
		setMinimumSize(new Dimension(400, 400));

		JMenuBar barra = new JMenuBar();

		JMenu file = new JMenu("Cuenta");//////////////////////////////////
		barra.add(file);

		JMenuItem nuevo = new JMenuItem("Login");
		nuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		file.add(nuevo);
		

		JMenuItem open = new JMenuItem("Registro");
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("registro");
				
			}
		});
		file.add(open);

		JMenuItem cerrar = new JMenuItem("Recuperacion de cuenta");
		cerrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("Recuperacion");
				
			}
		});
		file.add(cerrar);

		JMenu edit = new JMenu("Usuarios");//////////////////////////////////
		barra.add(edit);

		JMenuItem copy = new JMenuItem("Alta");
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("alta");
				
			}
		});
		edit.add(copy);

		JMenuItem paste = new JMenuItem("Baja");
		paste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("baja");
				
			}
		});
		edit.add(paste);

		JMenuItem select = new JMenuItem("Consultar");
		select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("Consultar");
				
			}
		});
		edit.add(select);

		JMenu help = new JMenu("Ayuda");///////////////////////////////////
		barra.add(help);

		JMenuItem asistente = new JMenuItem("¿Como crear un usuario?");
		asistente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("crear_usuario");
				
			}
		});
		help.add(asistente);

		JMenuItem buscador = new JMenuItem("¿Como acceder al sistema?");
		buscador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("acceder_sistema");
				
			}
		});
		help.add(buscador);

		JMenuItem Sponsor = new JMenuItem("¿Que pasa si olvido mi contraseña?");
		Sponsor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("olvido_contraseña");
				
			}
		});
		help.add(Sponsor);

		this.setJMenuBar(barra);

		this.add(this.login());
		//this.add(this.registro());
		// this.add(this.registro());
		this.repaint();

	}

	public JPanel login() {

		JPanel Panel = new JPanel();

		Panel.setBackground(Color.decode("#c8eafa"));
		Panel.setOpaque(true);
		Panel.setSize(500, 800);
		Panel.setLocation(0, 0);
		Panel.setLayout(null);

		JLabel iniciar = new JLabel("Iniciar sesion");
		iniciar.setSize(200, 40);
		iniciar.setLocation(140, 40);
		iniciar.setHorizontalAlignment(JLabel.CENTER);
		iniciar.setFont(new Font("Calibri", Font.BOLD, 30));
		Panel.add(iniciar);

		JLabel etiqueta2 = new JLabel("Ingresa tu correo: ");
		etiqueta2.setSize(200, 40);
		etiqueta2.setLocation(140, 100);
		etiqueta2.setFont(new Font("Calibri", Font.BOLD, 15));
		Panel.add(etiqueta2);

		JTextField correo = new JTextField();
		correo.setSize(200, 20);
		correo.setLocation(140, 127);
		correo.setFont(new Font("Calibri", Font.BOLD, 15));
		Panel.add(correo);

		JLabel etiqueta3 = new JLabel("Contraseña:");
		etiqueta3.setSize(200, 40);
		etiqueta3.setLocation(140, 165);
		etiqueta3.setFont(new Font("Calibri", Font.BOLD, 15));
		Panel.add(etiqueta3);

		JPasswordField contrasena = new JPasswordField();
		contrasena.setSize(200, 20);
		contrasena.setLocation(140, 193);
		contrasena.setFont(new Font("Calibri", Font.PLAIN, 15));
		Panel.add(contrasena);

		JLabel Olvido = new JLabel("¿Olvidaste tu contraseña?");
		Olvido.setSize(200, 20);
		Olvido.setLocation(138, 212);
		Olvido.setFont(new Font("Calibri", Font.BOLD, 12));
		Panel.add(Olvido);

		JButton acceder = new JButton("Acceder");
		acceder.setSize(120, 40);
		acceder.setLocation(190, 270);
		acceder.setFont(new Font("Calibri", Font.BOLD, 15));

		acceder.addActionListener(new ActionListener() {
			//
			@Override
			public void actionPerformed(ActionEvent e) {

				boolean flag1 = false;
				if (correo.getText().equals("")) {

					correo.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					correo.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag1 = true;

				}

				String micontrasena = new String(contrasena.getPassword());

				boolean flag2 = false;
				if (micontrasena.equals("")) {

					contrasena.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					contrasena.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag2 = true;
				}

				if (flag1 && flag2) {
					JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
				}

			}
		});

		Panel.add(acceder);

		JButton registro = new JButton("registro");
		registro.setSize(120, 40);
		registro.setLocation(190, 320);
		registro.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("registro");

			}
		});

		Panel.add(registro);

		//this.repaint();

		return Panel;
	}

	public JPanel registro() {

		JPanel registro = new JPanel();

		registro.setBackground(Color.decode("#c8eafa"));
		registro.setOpaque(true);
		registro.setSize(500, 800);
		registro.setLocation(1000 / 2, 0);
		registro.setLayout(null);

		JLabel titleR = new JLabel("Registro");
		titleR.setSize(200, 40);
		titleR.setLocation(140, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		registro.add(titleR);

		JLabel nombre = new JLabel("Nombre completo:");
		nombre.setSize(200, 40);
		nombre.setLocation(50, 100);
		nombre.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(nombre);

		JTextField nombreField = new JTextField();
		nombreField.setSize(280, 20);
		nombreField.setLocation(50, 127);
		nombreField.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(nombreField);

		JLabel bio = new JLabel("BIO:");
		bio.setSize(200, 40);
		bio.setLocation(50, 150);
		bio.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(bio);

		JTextArea bioField = new JTextArea();
		bioField.setSize(280, 60);
		bioField.setLocation(50, 180);
		bioField.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(bioField);

		JLabel Preferencias = new JLabel("Preferencias:");
		Preferencias.setSize(200, 40);
		Preferencias.setLocation(50, 230);
		Preferencias.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(Preferencias);

		JCheckBox dulces = new JCheckBox("Dulces");
		dulces.setBounds(50, 260, 80, 30);
		registro.add(dulces);

		JCheckBox salado = new JCheckBox("Salado");
		salado.setBounds(150, 260, 80, 30);
		registro.add(salado);

		JCheckBox saludable = new JCheckBox("Saludable");
		saludable.setBounds(250, 260, 90, 30);
		registro.add(saludable);

		JLabel terminos = new JLabel("Terminos:");
		terminos.setSize(200, 40);
		terminos.setLocation(50, 295);
		terminos.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(terminos);

		JRadioButton terms1 = new JRadioButton("Acepto los terminos");
		terms1.setSize(150, 20);
		terms1.setLocation(50, 330);
		registro.add(terms1);

		JRadioButton terms2 = new JRadioButton("No acepto los terminos");
		terms2.setSize(170, 20);
		terms2.setLocation(225, 330);
		registro.add(terms2);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(terms1);
		grupo.add(terms2);

		JButton cuenta = new JButton("Crear Cuenta");
		cuenta.setSize(120, 40);
		cuenta.setLocation(150, 400);
		cuenta.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(cuenta);

		cuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				boolean flag3 = false;
				if (nombreField.getText().equals("")) {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				} else {
					nombreField.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag3 = true;
				}

				boolean flag4 = false;
				if (bioField.getText().equals("")) {
					bioField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				} else {
					bioField.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag4 = true;
				}

				if (flag3 && flag4) {
					JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
				}

			}
		});
		
		
		JButton login = new JButton("Ir a Login");
		login.setSize(120, 40);
		login.setLocation(150, 450);
		login.setFont(new Font("Calibri", Font.BOLD, 15));
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		
		registro.add(login);
		
		//registro.add(login);

		//this.add(registro);
		//this.repaint();

		return registro;

	}
	
	
	public JPanel recuperacion() {
		
		JPanel recuperacion1 = new JPanel();

		recuperacion1.setBackground(Color.decode("#c8eafa"));
		recuperacion1.setOpaque(true);
		recuperacion1.setSize(500, 800);
		recuperacion1.setLocation(1000 / 2, 0);
		recuperacion1.setLayout(null);

		JLabel titleR = new JLabel("Recuperacion de cuenta");
		titleR.setSize(380, 40);
		titleR.setLocation(40, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		recuperacion1.add(titleR);		
		
		JLabel title1 = new JLabel("Pasos para Recuperar tu Cuenta");
		title1.setSize(380, 40);
		title1.setLocation(40, 70);
		title1.setForeground(Color.decode("#235596"));
		title1.setHorizontalAlignment(JLabel.CENTER);
		title1.setFont(new Font("Calibri", Font.BOLD, 22));
		recuperacion1.add(title1);
		
		JLabel title2 = new JLabel("<html> 1._Ingresa tu correo electrónico:<br>"
				+ "Introduce la dirección de correo electrónico que deseas recuperar.<br>"
				+ "Asegúrate de escribirla correctamente.</html>");
		title2.setSize(500, 150);
		title2.setLocation(40, 70);
		title2.setHorizontalAlignment(JLabel.CENTER);
		title2.setFont(new Font("Calibri", Font.BOLD, 15));
		recuperacion1.add(title2);
		
		JTextField correo = new JTextField();
		correo.setSize(200, 20);
		correo.setLocation(120, 200);
		correo.setFont(new Font("Calibri", Font.BOLD, 15));
		recuperacion1.add(correo);
		
		JLabel title3 = new JLabel("<html> 2._Verificación de identidad:<br>"
				+ "Recibiras un código en tu número de teléfono o correo electrónico alternativo.<br>"
				+ "Introducir el codigo de verificacion.</html>");
		title3.setSize(500, 150);
		title3.setLocation(80, 210);
		title3.setHorizontalAlignment(JLabel.CENTER);
		title3.setFont(new Font("Calibri", Font.BOLD, 15));
		recuperacion1.add(title3);
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setSize(200, 20);
		contrasena.setLocation(120, 330);
		contrasena.setFont(new Font("Calibri", Font.PLAIN, 15));
		recuperacion1.add(contrasena);
		
		JButton acceder = new JButton("Verificar");
		acceder.setSize(120, 40);
		acceder.setLocation(220, 370);
		acceder.setFont(new Font("Calibri", Font.BOLD, 15));

		acceder.addActionListener(new ActionListener() {
			//
			@Override
			public void actionPerformed(ActionEvent e) {

				boolean flag1 = false;
				if (correo.getText().equals("")) {

					correo.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					correo.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag1 = true;

				}

				String micontrasena = new String(contrasena.getPassword());

				boolean flag2 = false;
				if (micontrasena.equals("")) {

					contrasena.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					contrasena.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag2 = true;
				}

				if (flag1 && flag2) {
					JOptionPane.showMessageDialog(null, "RECUPERACION EXITOSA");
				}

			}
		});

		recuperacion1.add(acceder);
		
		JButton volver = new JButton("Volver");
		volver.setSize(80, 30);
		volver.setLocation(10, 10);
		volver.setFont(new Font("Calibri", Font.BOLD, 15));
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		
		recuperacion1.add(volver);
		
		return recuperacion1;
		
	}
	
	public JPanel alta() {
		
		JPanel alta1 = new JPanel();

		alta1.setBackground(Color.decode("#c8eafa"));
		alta1.setOpaque(true);
		alta1.setSize(500, 800);
		alta1.setLocation(1000 / 2, 0);
		alta1.setLayout(null);

		JLabel titleR = new JLabel("Alta");
		titleR.setSize(200, 40);
		titleR.setLocation(140, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		alta1.add(titleR);
		
		JLabel title1 = new JLabel("Nombre:");
		title1.setSize(100, 40);
		title1.setLocation(50, 100);
		//title1.setHorizontalAlignment(JLabel.CENTER);
		title1.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(title1);
		
		JTextField text1 = new JTextField();
		text1.setSize(200, 20);
		text1.setLocation(190, 107);
		text1.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(text1);
		
		JLabel title2 = new JLabel("Apellido:");
		title2.setSize(100, 40);
		title2.setLocation(50, 140);
		//title2.setHorizontalAlignment(JLabel.CENTER);
		title2.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(title2);
		
		JTextField text2 = new JTextField();
		text2.setSize(200, 20);
		text2.setLocation(190, 147);
		text2.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(text2);
		
		JLabel title3 = new JLabel("Correo electronico:");
		title3.setSize(150, 40);
		title3.setLocation(50, 180);
		//title3.setHorizontalAlignment(JLabel.CENTER);
		title3.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(title3);
		
		JTextField text3 = new JTextField();
		text3.setSize(200, 20);
		text3.setLocation(190, 187);
		text3.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(text3);
		
		JLabel title4 = new JLabel("Sexo:");
		title4.setSize(100, 40);
		title4.setLocation(50, 220);
		//title4.setHorizontalAlignment(JLabel.CENTER);
		title4.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(title4);
		
		JTextField text4 = new JTextField();
		text4.setSize(200, 20);
		text4.setLocation(190, 227);
		text4.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(text4);
		
		JLabel title5 = new JLabel("Edad:");
		title5.setSize(100, 40);
		title5.setLocation(50, 260);
		//title5.setHorizontalAlignment(JLabel.CENTER);
		title5.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(title5);
		
		JTextField text5 = new JTextField();
		text5.setSize(200, 20);
		text5.setLocation(190, 267);
		text5.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(text5);
		
		JLabel title6 = new JLabel("CURP:");
		title6.setSize(100, 40);
		title6.setLocation(50, 300);
		//title6.setHorizontalAlignment(JLabel.CENTER);
		title6.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(title6);
		
		JTextField text6 = new JTextField();
		text6.setSize(200, 20);
		text6.setLocation(190, 307);
		text6.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(text6);
		
		JLabel title7 = new JLabel("Domicilio:");
		title7.setSize(100, 40);
		title7.setLocation(50, 340);
		//title7.setHorizontalAlignment(JLabel.CENTER);
		title7.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(title7);
		
		JTextField text7 = new JTextField();
		text7.setSize(200, 20);
		text7.setLocation(190, 347);
		text7.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(text7);
		
		JButton acceder = new JButton("Crear");
		acceder.setSize(120, 40);
		acceder.setLocation(500, 480);
		acceder.setFont(new Font("Calibri", Font.BOLD, 15));
		acceder.setBackground(Color.GREEN);
		acceder.addActionListener(new ActionListener() {
			//
			@Override
			public void actionPerformed(ActionEvent e) {

				boolean flag1 = false;///////////////////////////////////////////////////////
				if (text1.getText().equals("")) {

					text1.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					text1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag1 = true;

				}
				
				boolean flag2 = false;///////////////////////////////////////////////////////////
				if (text2.getText().equals("")) {

					text2.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					text2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag2 = true;

				}
				
				boolean flag3 = false;////////////////////////////////////////////////////////
				if (text3.getText().equals("")) {

					text3.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					text3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag3 = true;

				}
				
				
				boolean flag4 = false;////////////////////////////////////////////////////////
				if (text4.getText().equals("")) {

					text4.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					text4.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag4 = true;

				}
				
				
				boolean flag5 = false;///////////////////////////////////////////////////////////
				if (text5.getText().equals("")) {

					text5.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					text5.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag5 = true;

				}
				
				boolean flag6 = false;//////////////////////////////////////////////////////////////
				if (text6.getText().equals("")) {

					text6.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					text6.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag6 = true;

				}
				
				boolean flag7 = false;//////////////////////////////////////////////////////////////
				if (text7.getText().equals("")) {

					text7.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					text7.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag7 = true;

				}

				if (flag1 && flag2 && flag3 && flag4 && flag5 && flag6 && flag7) {
					JOptionPane.showMessageDialog(null, "Usuario creado");
				}

			}
		});
		alta1.add(acceder);
		
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.setSize(120, 40);
		Cancelar.setLocation(350, 480);
		Cancelar.setFont(new Font("Calibri", Font.BOLD, 15));
		alta1.add(Cancelar);
		
		JButton volver = new JButton("Volver");
		volver.setSize(80, 30);
		volver.setLocation(10, 10);
		volver.setHorizontalTextPosition(JButton.CENTER);
		volver.setFont(new Font("Calibri", Font.BOLD, 15));
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		alta1.add(volver);
		
		return alta1;
		
	}
	
	public JPanel baja() {
		
		JPanel baja1 = new JPanel();

		baja1.setBackground(Color.decode("#c8eafa"));
		baja1.setOpaque(true);
		baja1.setSize(500, 800);
		baja1.setLocation(1000 / 2, 0);
		baja1.setLayout(null);

		JLabel titleR = new JLabel("Baja");
		titleR.setSize(200, 40);
		titleR.setLocation(140, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		baja1.add(titleR);
		
		JLabel title1 = new JLabel("Seleccionar persona que dara de baja.");
		title1.setSize(250, 40);
		title1.setLocation(140, 70);
		title1.setHorizontalAlignment(JLabel.CENTER);
		title1.setFont(new Font("Calibri", Font.BOLD, 15));
		baja1.add(title1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setSize(600,300);
		scrollPane.setLocation(50,100);
		baja1.add(scrollPane);
		
		JTable usuarios = new JTable();
		usuarios.setModel(new DefaultTableModel(
				new Object[][] {
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
					{null,null,null,null,null},
				},
				new String[] {
						"Apellidos","Nombres","Correo","Edad","Sexo", 
				}
				
		));
		scrollPane.setViewportView(usuarios);
		
		JButton Eliminar = new JButton("Eliminar");
		Eliminar.setSize(120, 40);
		Eliminar.setLocation(500, 480);
		Eliminar.setFont(new Font("Calibri", Font.BOLD, 15));
		Eliminar.setBackground(Color.RED);
		Eliminar.setForeground(Color.WHITE);
		Eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminarlo");
			}
		});
		baja1.add(Eliminar);
		
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.setSize(120, 40);
		Cancelar.setLocation(350, 480);
		Cancelar.setFont(new Font("Calibri", Font.BOLD, 15));
		baja1.add(Cancelar);
		
		JButton volver = new JButton("Volver");
		volver.setSize(80, 30);
		volver.setLocation(10, 10);
		volver.setHorizontalTextPosition(JButton.CENTER);
		volver.setFont(new Font("Calibri", Font.BOLD, 15));
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		baja1.add(volver);
		
		
		return baja1;
		
	}
	
	public JPanel Consultar() {
		
		JPanel Consultar1 = new JPanel();

		Consultar1.setBackground(Color.decode("#c8eafa"));
		Consultar1.setOpaque(true);
		Consultar1.setSize(500, 900);
		Consultar1.setLocation(1000 / 2, 0);
		Consultar1.setLayout(null);

		JLabel titleR = new JLabel("Consultar usuarios");
		titleR.setSize(300, 40);
		titleR.setLocation(80, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		Consultar1.add(titleR);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setSize(700,400);
		scrollPane.setLocation(20,80);
		Consultar1.add(scrollPane);
		
		JTable usuarios = new JTable();
		usuarios.setModel(new DefaultTableModel(
				new Object[][] {
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null},
				},
				new String[] {
						"Apellidos","Nombres","Correo","Edad","Sexo","CURP", "Domicilio",
				}
				
		));
		scrollPane.setViewportView(usuarios);
		
		JButton volver = new JButton("Volver");
		volver.setSize(80, 30);
		volver.setLocation(10, 10);
		volver.setHorizontalTextPosition(JButton.CENTER);
		volver.setFont(new Font("Calibri", Font.BOLD, 15));
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		Consultar1.add(volver);
		
		return Consultar1;
	}
	
	public JPanel crear_usuario() {
		
		JPanel crear_usuario1 = new JPanel();

		crear_usuario1.setBackground(Color.decode("#8DBBBB"));
		crear_usuario1.setOpaque(true);
		crear_usuario1.setSize(500, 800);
		crear_usuario1.setLocation(1000 / 2, 0);
		crear_usuario1.setLayout(null);

		JLabel titleR = new JLabel("Como crear un usuario");
		titleR.setSize(350, 40);
		titleR.setLocation(80, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		crear_usuario1.add(titleR);
		
		JLabel title1 = new JLabel("<html>Importante: Antes de configurar una nueva cuenta, asegúrate de salir de tu cuenta actual.<br>"
                + "Ve a la página en la parte de dar ALTA la Cuenta.<br>"
                + "Haz clic en Crear cuenta.<br>"
                + "Para configurar tu cuenta, sigue los pasos que aparecen en pantalla.</html>");	
		title1.setSize(800, 1000);
		title1.setLocation(80, 90);
		title1.setFont(new Font("Calibri", Font.BOLD, 15));
		title1.setVerticalAlignment(JLabel.TOP);
		crear_usuario1.add(title1);
		
		JButton volver = new JButton("Volver");
		volver.setSize(80, 30);
		volver.setLocation(10, 10);
		volver.setHorizontalTextPosition(JButton.CENTER);
		volver.setFont(new Font("Calibri", Font.BOLD, 15));
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		crear_usuario1.add(volver);
		
		return crear_usuario1;
		
	}

	public JPanel acceder_sistema() {
		
		JPanel acceder_sistema1 = new JPanel();

		acceder_sistema1.setBackground(Color.decode("#8DBBBB"));
		acceder_sistema1.setOpaque(true);
		acceder_sistema1.setSize(500, 800);
		acceder_sistema1.setLocation(1000 / 2, 0);
		acceder_sistema1.setLayout(null);

		JLabel titleR = new JLabel("Como acceder al sistema");
		titleR.setSize(350, 40);
		titleR.setLocation(60, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		acceder_sistema1.add(titleR);
		
		JLabel title1 = new JLabel("<html>Para acceder al sistema debes de ingresar tu correo electronico y contraseña en los campos requeridos <br>"
                + "Debes de seguir las instruccuiones solicitadas<br>"
				+ " <br>"
                + "Para ingresar al panel de consultas debes tener permiso de un administrador o ser uno.</html>");
		title1.setSize(800, 1000);
		title1.setLocation(80, 90);
		title1.setFont(new Font("Calibri", Font.BOLD, 15));
		title1.setVerticalAlignment(JLabel.TOP);
		acceder_sistema1.add(title1);
		
		JButton volver = new JButton("Volver");
		volver.setSize(80, 30);
		volver.setLocation(10, 10);
		volver.setHorizontalTextPosition(JButton.CENTER);
		volver.setFont(new Font("Calibri", Font.BOLD, 15));
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		acceder_sistema1.add(volver);
		
		
		return acceder_sistema1;

	}
	
	
	public JPanel olvido_contraseña() {
		
		JPanel olvido_contraseña1 = new JPanel();

		olvido_contraseña1.setBackground(Color.decode("#8DBBBB"));
		olvido_contraseña1.setOpaque(true);
		olvido_contraseña1.setSize(500, 800);
		olvido_contraseña1.setLocation(1000 / 2, 0);
		olvido_contraseña1.setLayout(null);

		JLabel titleR = new JLabel("Olvide mi contraseña");
		titleR.setSize(300, 40);
		titleR.setLocation(80, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		olvido_contraseña1.add(titleR);
		
		JLabel title1 = new JLabel("<html>Sigue los pasos para recuperar tu Cuenta de Google o Gmail.<br>"
                + "Deberás responder algunas preguntas para confirmar que es tu cuenta.<br>"
				+ "Responde las preguntas de la mejor manera posible.<br>"
                + "<br>"
                + "Si tienes problemas, prueba las sugerencias para completar los pasos de recuperación de la cuenta.<br>"
                + "Restablece la contraseña cuando se te solicite.<br>"
                + "Elige una contraseña segura que no hayas usado antes con esta cuenta.</html>");
		title1.setSize(800, 1000);
		title1.setLocation(80, 90);
		//title1.setHorizontalAlignment(JLabel.CENTER);
		title1.setFont(new Font("Calibri", Font.BOLD, 15));
		title1.setVerticalAlignment(JLabel.TOP);
		olvido_contraseña1.add(title1);
		
		JButton volver = new JButton("Volver");
		volver.setSize(80, 30);
		volver.setLocation(10, 10);
		volver.setHorizontalTextPosition(JButton.CENTER);
		volver.setFont(new Font("Calibri", Font.BOLD, 15));
		volver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("login");
				
			}
		});
		olvido_contraseña1.add(volver);

		
		return olvido_contraseña1;
		
	}
	
	
	
	public void router(String router) {
		this.getContentPane().removeAll();
		
		if (router.equals("login")) {
			this.add(this.login());
		}

		if (router.equals("registro")) {
			this.add(this.registro());
		}
		
		if (router.equals("Recuperacion")) {
			this.add(this.recuperacion());
		}
		
		if (router.equals("alta")) {
			this.add(this.alta());
		}
		
		if (router.equals("baja")) {
			this.add(this.baja());
		}
		
		if (router.equals("Consultar")) {
			this.add(this.Consultar());
		}
		if (router.equals("crear_usuario")) {
			this.add(this.crear_usuario());
		}
		
		if (router.equals("acceder_sistema")) {
			this.add(this.acceder_sistema());
		}
		
		if (router.equals("olvido_contraseña")) {
			this.add(this.olvido_contraseña());
		}
		

		this.repaint();
		this.revalidate();
	}

}


