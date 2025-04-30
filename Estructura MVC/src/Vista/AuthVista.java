package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

public class AuthVista extends JFrame {

    public AuthVista() {
        // Constructor
    }

    public void Login() {
        JFrame Panel = new JFrame();
        
        Panel.setVisible(true);
        Panel.setSize(800, 700);
        Panel.setLocationRelativeTo(null);
        Panel.setTitle("Login");
        Panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel.setMaximumSize(new Dimension(900, 900));
        Panel.setMinimumSize(new Dimension(400, 400));
        Panel.setResizable(true);

        JPanel Panel_1 = new JPanel();
        Panel_1.setBackground(Color.decode("#c8eafa"));
        Panel_1.setOpaque(true);
        Panel_1.setSize(500, 800);
        Panel_1.setLocation(0, 0);
        Panel_1.setLayout(null);

        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"));
        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, 800, 700);
        fondo.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(800, 700, Image.SCALE_SMOOTH)));
        Panel_1.add(fondo);

        JLabel iniciar = new JLabel("Iniciar Sesión");
        iniciar.setSize(200, 40);
        iniciar.setLocation(450, 40);
        iniciar.setHorizontalAlignment(JLabel.CENTER);
        iniciar.setFont(new Font("Bold", Font.BOLD, 30));
        iniciar.setForeground(Color.WHITE);
        fondo.add(iniciar);

        JLabel etiqueta2 = new JLabel("Ingresa tu correo: ");
        etiqueta2.setSize(200, 40);
        etiqueta2.setLocation(450, 100);
        etiqueta2.setFont(new Font("Italic", Font.BOLD, 15));
        etiqueta2.setForeground(Color.WHITE);
        fondo.add(etiqueta2);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Imagenes/usuario1.jpg"));
        JLabel usuario1 = new JLabel();
        usuario1.setBounds(415, 125, 27, 27);
        usuario1.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(27, 27, Image.SCALE_SMOOTH)));
        fondo.add(usuario1);

        JTextField correo = new JTextField();
        correo.setSize(200, 20);
        correo.setLocation(450, 129);
        correo.setFont(new Font("Italic", Font.BOLD, 15));
        fondo.add(correo);

        JLabel etiqueta3 = new JLabel("Contraseña:");
        etiqueta3.setSize(200, 40);
        etiqueta3.setLocation(450, 165);
        etiqueta3.setFont(new Font("Italic", Font.BOLD, 15));
        etiqueta3.setForeground(Color.WHITE);
        fondo.add(etiqueta3);

        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/Imagenes/candado.png"));
        JLabel candado = new JLabel();
        candado.setBounds(415, 190, 27, 27);
        candado.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(27, 27, Image.SCALE_SMOOTH)));
        fondo.add(candado);

        JPasswordField contrasena = new JPasswordField();
        contrasena.setSize(200, 20);
        contrasena.setLocation(450, 193);
        contrasena.setFont(new Font("Italic", Font.PLAIN, 15));
        fondo.add(contrasena);

        JLabel Olvido = new JLabel("¿Olvidaste tu contraseña?");
        Olvido.setSize(200, 20);
        Olvido.setLocation(448, 215);
        Olvido.setFont(new Font("Italic", Font.BOLD, 12));
        Olvido.setForeground(Color.WHITE);
        fondo.add(Olvido);

        JButton acceder = new JButton("Acceder");
        acceder.setSize(120, 40);
        acceder.setLocation(490, 270);
        acceder.setFont(new Font("Bold", Font.BOLD, 15));
        fondo.add(acceder);
        acceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean flag1 = false;
                if (correo.getText().equals("")) {
                    correo.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                } else {
                    correo.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
                    flag1 = true;
                }

                String micontrasena = new String(contrasena.getPassword());
                boolean flag2 = false;
                if (micontrasena.equals("")) {
                    contrasena.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                } else {
                    contrasena.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
                    flag2 = true;
                }

                if (flag1 && flag2) {
                    JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                }
            }
        });

        JButton registro = new JButton("Register");
        registro.setSize(120, 40);
        registro.setLocation(490, 320);
        registro.setFont(new Font("Bold", Font.BOLD, 15));
        registro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                router("Register");
            }
        });
        fondo.add(registro);

        Panel.add(Panel_1);
        Panel.repaint();
        Panel.revalidate();
    }

    public void Register() {
       
    	JFrame Panel = new JFrame();
        
        Panel.setVisible(true);
        Panel.setSize(800, 700);
        Panel.setLocationRelativeTo(null);
        Panel.setTitle("Register");
        Panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel.setMaximumSize(new Dimension(900, 900));
        Panel.setMinimumSize(new Dimension(400, 400));
        Panel.setResizable(true);
    	
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

        JLabel title1 = new JLabel("Nombre:");
		title1.setSize(100, 40);
		title1.setLocation(50, 100);
		//title1.setHorizontalAlignment(JLabel.CENTER);
		title1.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title1);
		
		JTextField text1 = new JTextField();
		text1.setSize(200, 20);
		text1.setLocation(130, 107);
		text1.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(text1);
		
		JLabel title2 = new JLabel("Apellido:");
		title2.setSize(100, 40);
		title2.setLocation(400, 100);
		//title2.setHorizontalAlignment(JLabel.CENTER);
		title2.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title2);
		
		JTextField text2 = new JTextField();
		text2.setSize(200, 20);
		text2.setLocation(480, 107);
		text2.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(text2);
		
		JLabel title3 = new JLabel("Empresa:");
		title3.setSize(150, 40);
		title3.setLocation(50, 140);
		//title3.setHorizontalAlignment(JLabel.CENTER);
		title3.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title3);
		
		JTextField text3 = new JTextField();
		text3.setSize(200, 20);
		text3.setLocation(130, 147);
		text3.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(text3);
		
		JLabel title4 = new JLabel("Cargo:");
		title4.setSize(100, 40);
		title4.setLocation(400, 140);
		//title4.setHorizontalAlignment(JLabel.CENTER);
		title4.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title4);
		
		JTextField text4 = new JTextField();
		text4.setSize(200, 20);
		text4.setLocation(480, 147);
		text4.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(text4);
		
		JLabel title5 = new JLabel("Nombre de usuario:");
		title5.setSize(150, 40);
		title5.setLocation(50, 220);
		//title5.setHorizontalAlignment(JLabel.CENTER);
		title5.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title5);
		
		JTextField text5 = new JTextField();
		text5.setSize(200, 20);
		text5.setLocation(190, 227);
		text5.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(text5);
		
		JLabel title6 = new JLabel("Contraseña:");
		title6.setSize(100, 40);
		title6.setLocation(50, 260);
		//title6.setHorizontalAlignment(JLabel.CENTER);
		title6.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title6);
		
		//JTextField text6 = new JTextField();
		JPasswordField text6 = new JPasswordField();
		text6.setSize(200, 20);
		text6.setLocation(190, 267);
		text6.setFont(new Font("Calibri", Font.PLAIN, 15));
		registro.add(text6);
		
		
		JLabel title7 = new JLabel("Repetir contraseña:");
		title7.setSize(150, 40);
		title7.setLocation(50, 300);
		//title7.setHorizontalAlignment(JLabel.CENTER);
		title7.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title7);
		
		JPasswordField text7 = new JPasswordField();
		text7.setSize(200, 20);
		text7.setLocation(190, 307);
		text7.setFont(new Font("Calibri", Font.PLAIN, 15));
		registro.add(text7);
		
		
		JLabel title8 = new JLabel("Correo electrónico:");
		title8.setSize(150, 40);
		title8.setLocation(50, 340);
		//title7.setHorizontalAlignment(JLabel.CENTER);
		title8.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title8);
		
		JTextField text8 = new JTextField();
		text8.setSize(200, 20);
		text8.setLocation(190, 347);
		text8.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(text8);
		
		JLabel title9 = new JLabel("Ámbito de la empresa:");
		title9.setSize(150, 40);
		title9.setLocation(50, 180);
		//title7.setHorizontalAlignment(JLabel.CENTER);
		title9.setFont(new Font("Calibri", Font.BOLD, 15));
		registro.add(title9);
		
		JComboBox<String> ambito = new JComboBox<>(new String[] {
	            "Tecnología",
	            "Salud",
	            "Educación",
	            "Comercio",
	            "Otro"
	        });
		ambito.setSize(100,20);
		ambito.setLocation(220,187);
		registro.add(ambito);
		
		
		
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
				
				boolean flag8 = false;//////////////////////////////////////////////////////////////
				if (text8.getText().equals("")) {

					text8.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
				}

				else {
					text8.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
					flag8 = true;

				}

				if (flag1 && flag2 && flag3 && flag4 && flag5 && flag6 && flag7 && flag8) {
					JOptionPane.showMessageDialog(null, "Usuario creado");
				}

			}
		});
		registro.add(acceder);

        JButton login = new JButton("Ir a Login");
        login.setSize(120, 40);
        login.setLocation(150, 480);
        login.setFont(new Font("Calibri", Font.BOLD, 15));
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                router("Login");
            }
        });

        registro.add(login);
        
        Panel.add(registro);
        Panel.repaint();
        Panel.repaint();

        /*this.getContentPane().removeAll();
        this.add(registro);
        this.repaint();
        this.revalidate();*/
    }

    public void router(String router) {
        this.getContentPane().removeAll();

        if (router.equals("Login")) {
            this.Login();
        }

        if (router.equals("Register")) {
            this.Register();
        }

        this.repaint();
        this.revalidate();
    }
}
