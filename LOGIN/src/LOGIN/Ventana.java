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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Ventana extends JFrame {

	public Ventana() {

		setVisible(true);
		setSize(1000, 500);
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
				
				router("Recuperacion");
				
			}
		});
		edit.add(copy);

		JMenuItem paste = new JMenuItem("Baja");
		paste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("Recuperacion");
				
			}
		});
		edit.add(paste);

		JMenuItem select = new JMenuItem("Consultar");
		select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("Recuperacion");
				
			}
		});
		edit.add(select);

		JMenu help = new JMenu("Ayuda");///////////////////////////////////
		barra.add(help);

		JMenuItem asistente = new JMenuItem("¿Como crear un usuario?");
		asistente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("Recuperacion");
				
			}
		});
		help.add(asistente);

		JMenuItem buscador = new JMenuItem("¿Como acceder al sistema?");
		buscador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("Recuperacion");
				
			}
		});
		help.add(buscador);

		JMenuItem Sponsor = new JMenuItem("¿Que pasa si olvido mi contraseña?");
		Sponsor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				router("Recuperacion");
				
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

		Panel.setBackground(Color.decode("#e9c46a"));
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

		registro.setBackground(Color.CYAN);
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
		login.setLocation(250, 400);
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

		recuperacion1.setBackground(Color.CYAN);
		recuperacion1.setOpaque(true);
		recuperacion1.setSize(500, 800);
		recuperacion1.setLocation(1000 / 2, 0);
		recuperacion1.setLayout(null);

		JLabel titleR = new JLabel("Recuperacion de cuenta");
		titleR.setSize(200, 40);
		titleR.setLocation(140, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		recuperacion1.add(titleR);
		
		
		return recuperacion1;
		
	}
	
	public JPanel alta() {
		
		JPanel alta1 = new JPanel();

		alta1.setBackground(Color.CYAN);
		alta1.setOpaque(true);
		alta1.setSize(500, 800);
		alta1.setLocation(1000 / 2, 0);
		alta1.setLayout(null);

		JLabel titleR = new JLabel("Recuperacion de cuenta");
		titleR.setSize(200, 40);
		titleR.setLocation(140, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		alta1.add(titleR);
		
		
		return alta1;
		
	}
	
	public JPanel baja() {
		
		JPanel baja1 = new JPanel();

		baja1.setBackground(Color.CYAN);
		baja1.setOpaque(true);
		baja1.setSize(500, 800);
		baja1.setLocation(1000 / 2, 0);
		baja1.setLayout(null);

		JLabel titleR = new JLabel("Recuperacion de cuenta");
		titleR.setSize(200, 40);
		titleR.setLocation(140, 40);
		titleR.setHorizontalAlignment(JLabel.CENTER);
		titleR.setFont(new Font("Calibri", Font.BOLD, 30));
		baja1.add(titleR);
		
		
		return baja1;
		
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
			this.add(this.recuperacion());
		}

		this.repaint();
		this.revalidate();
	}

}
