package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		//this.add(this.calculadora());
		//this.repaint();
		this.add(this.calcular2());
		
	}
	
	private JPanel calcular2() {
		
		Font fuente = new Font("Calibri",Font.BOLD,22);
		
		JPanel panel = new JPanel();
		//panel.setBackground(Color.CYAN);
		panel.setSize(330,380);
		panel.setLocation(0, 0);
		panel.setOpaque(true);
		panel.setLayout(new BorderLayout());
		
		JLabel results = new JLabel("12.5");
		results.setBackground(Color.WHITE);
		results.setOpaque(true);
		results.setFont(fuente);
		results.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(results,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.GREEN);
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		panel.add(centro,BorderLayout.CENTER);
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,3));
		centro.add(botones,BorderLayout.CENTER);
		
		String [] botones1 = {"9","8","7","6","5","4","3","2","1","0"};
		
		for (String botones2 : botones1) {
			JButton botones3 = new JButton(botones2);
			botones.setFont(fuente);
			botones.add(botones3);
		}
		
		JPanel simbolos = new JPanel();
		simbolos.setLayout(new GridLayout(6,0));
		centro.add(simbolos,BorderLayout.LINE_END);
		
		String [] simbolos1 = {"+","-","*","/","=","CE"};
		
		for (String simbolos2 : simbolos1) {
			JButton simbolos4 = new JButton(simbolos2);
			simbolos.setFont(fuente);
			simbolos.add(simbolos4);
		}
		
		this.add(panel);
		
		return panel;
		
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
        //this.repaint();
        
		return Panel;
		
	}

}
