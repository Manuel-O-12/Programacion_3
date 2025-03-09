package paquete;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JPanel{

	public Ventana() {
		JFrame frame = new JFrame("PRUEBAS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);
        frame.add(this); 
        frame.setVisible(true);
	}
	
	@Override
	public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D mundo = (Graphics2D)g.create();
		mundo.setStroke(new BasicStroke(2));
		
		//cielo////////////////////////////////////////////////////////////////
		
		mundo.setColor(Color.decode("#092CDB"));
		mundo.fillRect(0, 0, getWidth(), getHeight());
		
		
		//MONTAÑAS/////////////////////////////////////////////////////////////
		//MONTAÑAS1
		mundo.setColor(Color.decode("#cadffb"));
		mundo.fillRoundRect(500, 50, 205, 705, 200, 200);
		
		mundo.fillRoundRect(298, 150, 205, 705, 200, 200);
		
		mundo.fillRoundRect(20, 130, 205, 705, 200, 200);
		
		//MONTAÑAS2
		mundo.setColor(Color.decode("#6a9cde"));
		mundo.fillRoundRect(-50, 330, 200, 705, 175, 175);
		
		mundo.fillRoundRect(298, 330, 250, 705, 200, 200);
		
		mundo.fillRoundRect(548, 220, 240, 705, 150, 150);
		
		//suelo////////////////////////////////////////////////////////////////
		
		mundo.setColor(Color.decode("#8E967E"));
		mundo.fillRect(0, 550, getWidth(), getHeight());
		
		//pasto////////////////////////////////////////////////////////////////
		
		mundo.setColor(Color.decode("#038C3E"));
		mundo.fillRect(0, 520, 900, 30);
		
		//tubo/////////////////////////////////////////////////////////////////
		
		//vertical
		mundo.setColor(Color.decode("#4c007d"));
		mundo.fillRect(400, 450, 55, 70);
		mundo.setColor(Color.BLACK);
		mundo.drawRect(400, 450, 55, 70);
		//horizontal
		mundo.setColor(Color.decode("#4c007d"));
		mundo.fillRect(375, 405, 110, 45);
		mundo.setColor(Color.BLACK);
		mundo.drawRect(375, 405, 110, 45);
		
		//pared////////////////////////////////////////////////////////////////
		
		//gris
		mundo.setColor(Color.decode("#b5b5b5"));
		mundo.fillRect(740, 485, 35, 35);
		mundo.setStroke(new BasicStroke(2));
		mundo.setColor(Color.BLACK);
		mundo.drawRect(740, 485, 35, 35);
		
		mundo.setColor(Color.decode("#b5b5b5"));
		mundo.fillRect(740, 450, 35, 35);
		mundo.setStroke(new BasicStroke(2));
		mundo.setColor(Color.BLACK);
		mundo.drawRect(740, 450, 35, 35);
		
		mundo.setColor(Color.decode("#b5b5b5"));
		mundo.fillRect(740, 415, 35, 35);
		mundo.setStroke(new BasicStroke(2));
		mundo.setColor(Color.BLACK);
		mundo.drawRect(740, 415, 35, 35);
		
		mundo.setColor(Color.decode("#b5b5b5"));
		mundo.fillRect(740, 380, 35, 35);
		mundo.setStroke(new BasicStroke(2));
		mundo.setColor(Color.BLACK);
		mundo.drawRect(740, 380, 35, 35);
		
		//amarillo
		mundo.setColor(Color.decode("#F0D718"));
		mundo.fillRect(775, 380, 35, 35);
		mundo.setStroke(new BasicStroke(2));
		mundo.setColor(Color.BLACK);
		mundo.drawRect(775, 380, 35, 35);
		//ojos
		mundo.drawLine(787, 405, 787, 390);
		mundo.drawLine(800, 405, 800, 390);
		
		mundo.setColor(Color.decode("#F0D718"));
		mundo.fillRect(810, 380, 35, 35);
		mundo.setStroke(new BasicStroke(2));
		mundo.setColor(Color.BLACK);
		mundo.drawRect(810, 380, 35, 35);
		//ojos
		mundo.drawLine(822, 405, 822, 390);
		mundo.drawLine(835, 405, 835, 390);
		
		mundo.setColor(Color.decode("#F0D718"));
		mundo.fillRect(845, 380, 35, 35);
		mundo.setStroke(new BasicStroke(2));
		mundo.setColor(Color.BLACK);
		mundo.drawRect(845, 380, 35, 35);
		//ojos
		mundo.drawLine(857, 405, 857, 390);
		mundo.drawLine(870, 405, 870, 390);
		
		mundo.setColor(Color.decode("#F0D718"));
		mundo.fillRect(880, 380, 35, 35);
		mundo.setStroke(new BasicStroke(2));
		mundo.setColor(Color.BLACK);
		mundo.drawRect(880, 380, 35, 35);
		//ojos
		mundo.drawLine(892, 405, 892, 390);
		mundo.drawLine(905, 405, 905, 390);
		
		//tubo2
		//vertical
		mundo.setColor(Color.decode("#4c007d"));
		mundo.fillRect(820, 470, 55, 50);
		mundo.setColor(Color.BLACK);
		mundo.drawRect(820, 470, 55, 50);
		//horizontal
		mundo.setColor(Color.decode("#4c007d"));
		mundo.fillRect(800, 450, 90, 35);
		mundo.setColor(Color.BLACK);
		mundo.drawRect(800, 450, 90, 35);
		
		
		
		
		
	}

}
