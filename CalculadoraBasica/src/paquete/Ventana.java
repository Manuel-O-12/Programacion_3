package paquete;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana() {
		
		setVisible(true);
		setSize(330,380);
		setLocationRelativeTo(null);
		
		setTitle("CALCULADORA BASICA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(900,900));
		setMinimumSize(new Dimension(200,200));
		
		this.add(this,calculadora());
		this.repaint();
	}
	
	private JPanel calculadora() {
		
		JPanel Panel = new JPanel();
		
		Panel.setBackground(Color.decode("#7cdaf9"));
		Panel.setOpaque(true);
		Panel.setSize(330,380);
		Panel.setLocation(0, 0);
		Panel.setLayout(null);
		
		JTextField pantalla = new JTextField();
		pantalla.setSize(295, 40);
		pantalla.setLocation(10, 10);
		pantalla.setFont(new Font("Calibri",Font.BOLD,20));
    	Panel.add(pantalla);
    	/////////////////////////////////////////////////////////////
    	JButton ce = new JButton("CE");
    	ce.setSize(70, 50);
    	ce.setLocation(10, 55);
    	ce.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(ce);
        
        JButton siete = new JButton("7");
        siete.setSize(70, 50);
        siete.setLocation(10, 110);
        siete.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(siete);
        
        JButton cuatro = new JButton("4");
        cuatro.setSize(70, 50);
        cuatro.setLocation(10, 165);
        cuatro.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(cuatro);
        
        JButton uno = new JButton("1");
        uno.setSize(70, 50);
        uno.setLocation(10, 220);
        uno.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(uno);
        
        JButton cero = new JButton("0");
        cero.setSize(70, 50);
        cero.setLocation(10, 275);
        cero.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(cero);
        /////////////////////////////////////////////////////////////
        JButton nada = new JButton("");
        nada.setSize(145, 50);
        nada.setLocation(85, 55);
        nada.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(nada);
        
        JButton ocho = new JButton("8");
        ocho.setSize(70, 50);
        ocho.setLocation(85, 110);
        ocho.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(ocho);
        
        JButton cinco = new JButton("5");
    	cinco.setSize(70, 50);
    	cinco.setLocation(85, 165);
    	cinco.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(cinco);
        
        JButton dos = new JButton("2");
        dos.setSize(70, 50);
        dos.setLocation(85, 220);
        dos.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(dos);
        
        JButton punto = new JButton(".");
        punto.setSize(70, 50);
        punto.setLocation(85, 275);
        punto.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(punto);
        /////////////////////////////////////////////////////////////
        JButton nueve = new JButton("9");
        nueve.setSize(70, 50);
        nueve.setLocation(160, 110);
        nueve.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(nueve);
        
        JButton seis = new JButton("6");
        seis.setSize(70, 50);
        seis.setLocation(160, 165);
        seis.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(seis);
        
        JButton tres = new JButton("3");
        tres.setSize(70, 50);
        tres.setLocation(160, 220);
        tres.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(tres);
        
        JButton igual = new JButton("=");
        igual.setSize(145, 50);
        igual.setLocation(160, 275);
        igual.setFont(new Font("Calibri", Font.BOLD, 18));
        igual.setForeground(Color.WHITE);
        igual.setBackground(Color.black);
        Panel.add(igual);
        /////////////////////////////////////////////////////////////
        JButton division = new JButton("/");
        division.setSize(70, 50);
        division.setLocation(235, 55);
        division.setFont(new Font("Calibri", Font.BOLD, 18));
        division.setBackground(Color.orange);
        Panel.add(division);
        
        JButton multi = new JButton("*");
        multi.setSize(70, 50);
        multi.setLocation(235, 110);
        multi.setFont(new Font("Calibri", Font.BOLD, 18));
        multi.setBackground(Color.orange);
        Panel.add(multi);
        
        JButton menos = new JButton("-");
        menos.setSize(70, 50);
        menos.setLocation(235, 165);
        menos.setFont(new Font("Calibri", Font.BOLD, 18));
        menos.setBackground(Color.orange);
        Panel.add(menos);
        
        JButton mas = new JButton("+");
        mas.setSize(70, 50);
        mas.setLocation(235, 220);
        mas.setFont(new Font("Calibri", Font.BOLD, 18));
        mas.setBackground(Color.orange);
        Panel.add(mas);
        
		
		this.add(Panel);
        this.repaint();
        
		return Panel;
		
	}

}
