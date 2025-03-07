package pack;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JPanel {
	
	public Ventana() {
        
        JFrame frame = new JFrame("PRUEBAS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(this); 
        frame.setVisible(true);
        
    }
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D)g.create();
		g2d.setStroke(new BasicStroke(5));
		
		//cielo
		g2d.setColor(Color.decode("#4EA8F0"));
		g2d.fillRect(0, 0, getWidth(), getHeight());
		
		//cerca
		g2d.setColor(Color.decode("#CC6559"));
	    for (int i = 0; i < 30; i++) {
	    	g2d.fillRect(10 + i * 30, 350, 20, 100);
	            
	        }
	    g2d.drawLine(0, 380, 800, 380);
	    g2d.drawLine(0, 420, 800, 420);
	    
		//paredes
		g2d.setColor(Color.decode("#EDBA18"));
		g2d.fillRect(250, 180, 250,270);
		
		//techo
		g2d.setColor(Color.decode("#ED3818"));
		int[] xs = {230,320,525};
		int[] ys = {190,90,190};
		g2d.fillPolygon(xs,ys,3);
		
		//puerta
		g2d.setColor(Color.decode("#8A4E0E"));
		g2d.fillRect(270, 260, 90, 170);
		
		//ventana
		g2d.setColor(Color.decode("#CAF21D"));
		g2d.fillRect(380, 230, 100, 100);
		
		//cruz de las ventanas 
		g2d.setColor(Color.BLACK);
		g2d.drawLine(382, 280, 475, 280);
		g2d.drawLine(423, 230, 423, 330);
		
		//chimenea
		g2d.setColor(Color.GRAY);
		g2d.fillRect(400, 100, 35, 60);
		
		//entrada
		g2d.setColor(Color.decode("#5f4633"));
		g2d.fillRect(235, 430, 285, 50);
	    
	    
	    //suelo
		// Verde1
		g2d.setColor(Color.decode("#92e27a")); 
        g2d.fillRect(0, 480, 800, 50);
		
        //verde2
        g2d.setColor(Color.decode("#009929")); 
        g2d.fillRect(0, 530, 800, 50);
        
        //cafe
	    g.setColor(Color.decode("#69503c"));
        g.fillRect(0,580,800, 80);
        
        
		
	}

}