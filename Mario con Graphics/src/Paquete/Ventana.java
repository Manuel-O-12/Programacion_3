package Paquete;

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
        frame.setSize(1000, 600);
        frame.add(this); 
        frame.setVisible(true);
	}
	
	@Override
	public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D mapa = (Graphics2D)g.create();
		mapa.setStroke(new BasicStroke(2));
		
		//CIELO////////////////////////////////////////////////////////////////
		mapa.setColor(Color.decode("#90E0EF"));
		mapa.fillRect(0, 0, getWidth(), getHeight());
		
		//SOMBRAS//////////////////////////////////////////////////////////////
		mapa.setColor(Color.BLACK);
		mapa.fillRoundRect(300, 265, 170, 230, 5, 5);
		
		//TUBO/////////////////////////////////////////////////////////////////
		mapa.setStroke(new BasicStroke(5));
		mapa.setColor(Color.decode("#007200"));
		mapa.fillRect(585, 348, 100, 130);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(585, 348, 100, 130);
		//horizontal
		mapa.setColor(Color.decode("#007200"));
		mapa.fillRect(570, 310, 130, 50);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(570, 310, 130, 50);
		
		//SUELO////////////////////////////////////////////////////////////////
		
		mapa.setColor(Color.decode("#FED0BB"));
		mapa.fillRect(0, 500, getWidth(), getHeight());
		mapa.setStroke(new BasicStroke(5));
		mapa.setColor(Color.decode("#9E2A2B"));
		mapa.drawLine(0, 500, 1000, 500);
		mapa.setColor(Color.decode("#FED0BB"));
		mapa.fillRect(0, 478, 1000, 20);
		mapa.setStroke(new BasicStroke(4));
		mapa.setColor(Color.BLACK);
		mapa.drawLine(0, 476, 1000, 476);
		
		//BLOQUES//////////////////////////////////////////////////////////////
		mapa.setColor(Color.decode("#3A86FF"));
		mapa.fillRoundRect(280, 235, 150, 240, 5, 5);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(280, 235, 150, 240);
		
		//SOMBRAS//////////////////////////////////////////////////////////////
		mapa.fillRoundRect(220, 340, 150, 135, 5, 5);
		
		//BLQUE2/////
		mapa.setColor(Color.decode("#F28482"));
		mapa.fillRoundRect(185, 310, 160, 165, 5, 5);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(185, 310, 160, 165);
		
		mapa.setColor(Color.decode("#80ED99"));
		mapa.fillRoundRect(830, 310, 170, 165, 5, 5);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(830, 310, 170, 165);
		
		
		
		//CUADRITOS////////////////////////////////////////////////////////////
		mapa.setColor(Color.YELLOW);
		mapa.fillRect(130, 50, 70, 70);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(130, 50, 70, 70);
		
		mapa.setColor(Color.YELLOW);
		mapa.fillRect(200, 50, 70, 70);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(200, 50, 70, 70);
		
	}

}
