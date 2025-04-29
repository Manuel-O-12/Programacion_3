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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AuthVista extends JFrame{

	public AuthVista() {
		// TODO Auto-generated constructor stub
	}
	
	public void Login() {
		
		JFrame Panel = new JFrame();
		
		Panel.setVisible(true);
		Panel.setSize(800,500);
		Panel.setLocationRelativeTo(null);
		
		Panel.setTitle("MVC");
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
		
		ImageIcon imagen1 =new ImageIcon("/Imagenes/fondo1.jpg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 800, 500);
		fondo.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH)));
		Panel_1.add(fondo);
		
		JLabel iniciar = new JLabel("Iniciar Sesión");
		iniciar.setSize(200,40);
		iniciar.setLocation(450, 40);
		iniciar.setHorizontalAlignment(JLabel.CENTER);
		iniciar.setFont(new Font("Bold", Font.BOLD, 30 ));
		iniciar.setForeground(Color.BLACK);
		fondo.add(iniciar);
		
		JLabel etiqueta2 = new JLabel("Ingresa tu correo: ");
    	etiqueta2.setSize(200, 40);
    	etiqueta2.setLocation(450, 100);
    	etiqueta2.setFont(new Font("Italic",Font.BOLD,15));
    	etiqueta2.setForeground(Color.BLACK);
    	fondo.add(etiqueta2);
    	
    	ImageIcon imagen2 =new ImageIcon("/Imagenes/usuario1.jpg");
		JLabel usuario1 = new JLabel();
		usuario1.setBounds(415, 125, 27, 27);
		usuario1.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(27, 27, Image.SCALE_SMOOTH)));
		fondo.add(usuario1);
    	
    	JTextField correo = new JTextField();
    	correo.setSize(200, 20);
    	correo.setLocation(450, 129);
    	correo.setFont(new Font("Italic",Font.BOLD,15));
    	fondo.add(correo);
    	
        JLabel etiqueta3 = new JLabel("Contraseña:");
        etiqueta3.setSize(200, 40);
        etiqueta3.setLocation(450, 165);
        etiqueta3.setFont(new Font("Italic", Font.BOLD, 15));
        etiqueta3.setForeground(Color.BLACK);
        fondo.add(etiqueta3);
        
        ImageIcon imagen3 =new ImageIcon("/Imagenes/candado.png");
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
        Olvido.setForeground(Color.BLACK);
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
        
        acceder.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                acceder.setBackground(Color.decode("#7BB4E3"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                acceder.setBackground(Color.WHITE);
            }
        });
        
        
        Panel.add(Panel_1);
        Panel.repaint();
        Panel.revalidate();
		
        return;
	}
	
	public void Register() {
		
	}

}
