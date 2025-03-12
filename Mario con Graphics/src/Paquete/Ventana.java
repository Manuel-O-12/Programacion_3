package Paquete;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
		
		
		try {
	
			BufferedImage image2 = ImageIO.read(new File("Planta.png"));
			
			mapa.drawImage(image2, 590, 180, 100, 140, null);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
		mapa.drawRoundRect(280, 235, 150, 240,10,10);
		
		//SOMBRAS//////////////////////////////////////////////////////////////
		mapa.fillRoundRect(220, 340, 150, 135, 5, 5);
		
		//BLQUE2/////
		mapa.setColor(Color.decode("#F28482"));
		mapa.fillRoundRect(185, 310, 160, 165, 5, 5);
		mapa.setColor(Color.BLACK);
		mapa.drawRoundRect(185, 310, 160, 165,10,10);
		
		mapa.setColor(Color.decode("#80ED99"));
		mapa.fillRoundRect(830, 310, 170, 165, 5, 5);
		mapa.setColor(Color.BLACK);
		mapa.drawRoundRect(830, 310, 170, 165,10,10);
		
		
		
		//CUADRITOS////////////////////////////////////////////////////////////
		mapa.setColor(Color.ORANGE);
		mapa.fillRect(130, 50, 70, 70);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(130, 50, 70, 70);
		mapa.fillOval(132, 52, 10, 10);
		mapa.fillOval(132, 107, 10, 10);
		mapa.fillOval(187, 52, 10, 10);
		mapa.fillOval(187, 107, 10, 10);
		
		mapa.setColor(Color.ORANGE);
		mapa.fillRect(200, 50, 70, 70);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(200, 50, 70, 70);
		mapa.fillOval(202, 52, 10, 10);
		mapa.fillOval(202, 107, 10, 10);
		mapa.fillOval(257, 52, 10, 10);
		mapa.fillOval(257, 107, 10, 10);
		
		mapa.setColor(Color.ORANGE);
		mapa.fillRect(900, 120, 70, 70);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(900, 120, 70, 70);
		mapa.fillOval(902, 122, 10, 10);
		mapa.fillOval(902, 177, 10, 10);
		mapa.fillOval(957, 122, 10, 10);
		mapa.fillOval(957, 177, 10, 10);
		
		mapa.setColor(Color.ORANGE);
		mapa.fillRect(20, 200, 70, 70);
		mapa.setColor(Color.BLACK);
		mapa.drawRect(20, 200, 70, 70);
		mapa.fillOval(22, 202, 10, 10);
		mapa.fillOval(22, 257, 10, 10);
		mapa.fillOval(77, 202, 10, 10);
		mapa.fillOval(77, 257, 10, 10);
		
		
		//TORNILLOS////////////////////////////////////////////////////////////
		mapa.setStroke(new BasicStroke(3));
		
		mapa.drawOval(285, 240, 15, 15);
		mapa.drawOval(410, 240, 15, 15);
		mapa.drawOval(190, 455, 15, 15);
		
		mapa.drawOval(410, 455, 15, 15);
		mapa.drawOval(190, 315, 15, 15);
		mapa.drawOval(325, 315, 15, 15);
		mapa.drawOval(325, 455, 15, 15);
		
		mapa.drawOval(838, 315, 15, 15);
		mapa.drawOval(838, 454, 15, 15);
		
		
		//PERSONAJE////////////////////////////////////////////////////////////
		
		try {
			BufferedImage image = ImageIO.read(new File("mario1.png"));
			BufferedImage image3 = ImageIO.read(new File("pregunta.png"));

			mapa.drawImage(image, 370, 380, 55, 90, null);
			
			mapa.drawImage(image3, 135, 55, 60, 60, null);
			mapa.drawImage(image3, 905, 125, 60, 60, null);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
