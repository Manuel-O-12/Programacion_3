package paquete;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setSize(800,500);
		setLocationRelativeTo(null);
		
		setTitle("LOGIN CON IMAGENES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(900, 900));
    	setMinimumSize(new Dimension(400, 400));
    	
    	
    	JMenuBar barra = new JMenuBar();
    	
    	JMenu file = new JMenu("Files");//////////////////////////////////
    	barra.add(file);
    	
    	JMenuItem nuevo = new JMenuItem("New");
    	file.add(nuevo);
    	
    	JMenuItem open = new JMenuItem("Open");
    	file.add(open);
    	
    	JMenuItem cerrar = new JMenuItem("Close");
    	file.add(cerrar);
    	
    	JMenu edit = new JMenu("Edit");//////////////////////////////////
    	barra.add(edit);
    	
    	JMenuItem copy = new JMenuItem("Copy");
    	edit.add(copy);
    	
    	JMenuItem paste = new JMenuItem("Paste");
    	edit.add(paste);
    	
    	JMenuItem select = new JMenuItem("Select All");
    	edit.add(select);
    	
    	JMenu help = new JMenu("Help");///////////////////////////////////
    	barra.add(help);
    	
    	JMenuItem asistente = new JMenuItem("Assistant");
    	help.add(asistente);
    	
    	JMenuItem buscador = new JMenuItem("Search");
    	help.add(buscador);
    	
    	JMenuItem Sponsor = new JMenuItem("Sponsor");
    	help.add(Sponsor);
    	
    	this.setJMenuBar(barra);
    	
    	this.add(this.login());
    	this.repaint();
    	this.revalidate();
    	
	}
	
	public JPanel login() {
		JPanel Panel = new JPanel();
		//Panel.setBackground(Color.BLUE);
		Panel.setOpaque(false);
		Panel.setSize(800,500);
		Panel.setLocation(0, 0);
		Panel.setLayout(null);
		
		ImageIcon imagen1 =new ImageIcon("fondo1.jpg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 800, 500);
		fondo.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH)));
		Panel.add(fondo);
		
		JLabel iniciar = new JLabel("Iniciar Sesión");
		iniciar.setSize(200,40);
		iniciar.setLocation(450, 40);
		iniciar.setHorizontalAlignment(JLabel.CENTER);
		iniciar.setFont(new Font("Bold", Font.BOLD, 30 ));
		iniciar.setForeground(Color.WHITE);
		fondo.add(iniciar);
		
		JLabel etiqueta2 = new JLabel("Ingresa tu correo: ");
    	etiqueta2.setSize(200, 40);
    	etiqueta2.setLocation(450, 100);
    	etiqueta2.setFont(new Font("Italic",Font.BOLD,15));
    	etiqueta2.setForeground(Color.WHITE);
    	fondo.add(etiqueta2);
    	
    	ImageIcon imagen2 =new ImageIcon("usuario1.jpg");
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
        etiqueta3.setForeground(Color.WHITE);
        fondo.add(etiqueta3);
        
        ImageIcon imagen3 =new ImageIcon("candado.png");
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
        
        
        this.add(fondo);
        this.repaint();
		
        return Panel;
		
	}

}
