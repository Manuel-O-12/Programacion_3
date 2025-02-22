package Paquetes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana() {

		setVisible(true);
    	setSize(1000, 500);
    	setLocationRelativeTo(null);
    	
    	setTitle("USUARIOS");    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    	
    	setMaximumSize(new Dimension(700, 700));
    	setMinimumSize(new Dimension(400, 400));
    	
    	this.add(this.login());
    	//this.add(this.registro());
    	this.repaint();
    	
    }
    
    public JPanel login() {
    	
    	JPanel Panel = new JPanel();
    	
    	Panel.setBackground(Color.WHITE);
    	Panel.setOpaque(true);
    	Panel.setSize(1000, 800);
    	Panel.setLocation(0, 0);
    	Panel.setLayout(null);
    	
    	JLabel iniciar = new JLabel("USUARIOS");
    	iniciar.setSize(200, 40);
    	iniciar.setLocation(400, 30);
    	iniciar.setHorizontalAlignment(JLabel.CENTER);
    	iniciar.setFont(new Font("Calibri",Font.BOLD,40));
    	Panel.add(iniciar);
    	
    	
    	Object data[][]= {{"0001","Manuel", "23", "Activo"},
    					{"0002", "Francisco", "20", "activo"}};
    		
    		String	titles[]= {"ID", "Nombres", "Edad", "Estado"};
    	
    	
    	JTable tabla = new JTable(data,titles);
    	JScrollPane scroll_Pane = new JScrollPane(tabla);
    	scroll_Pane.setSize(900,300);
    	scroll_Pane.setLocation(45, 120);
    	Panel.add(scroll_Pane);
    	
    	JButton acceder = new JButton("Acceder");
        acceder.setSize(120, 40);
        acceder.setLocation(48, 70);
        acceder.setFont(new Font("Calibri", Font.BOLD, 15));
        Panel.add(acceder);
        
        JButton Descargar = new JButton("Descargar");
        Descargar.setSize(120, 40);
        Descargar.setLocation(700, 70);
        Descargar.setFont(new Font("Calibri", Font.BOLD, 15));
        Panel.add(Descargar);
        
        JButton Añadir = new JButton("Añadir");
        Añadir.setSize(120, 40);
        Añadir.setLocation(825, 70);
        Añadir.setFont(new Font("Calibri", Font.BOLD, 15));
        Panel.add(Añadir);
    	
    	        
        this.add(Panel);
        this.repaint();
		return Panel;
	}

}
