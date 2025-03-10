package paquete;

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
		
		//NUBES////////////////////////////////////////////////////////////////
		//nubes1
		mundo.setColor(Color.WHITE);
		mundo.fillRoundRect(630, 180, 170, 35, 50, 50);
		mundo.fillRoundRect(240, 380, 170, 35, 50, 50);
		mundo.fillRoundRect(120, 430, 170, 35, 50, 50);
		mundo.fillRoundRect(240, 480, 170, 35, 50, 50);
		
		//MONTAÑAS/////////////////////////////////////////////////////////////
		//MONTAÑAS1
		mundo.setColor(Color.decode("#cadffb"));
		mundo.fillRoundRect(500, 50, 205, 705, 200, 200);
		mundo.fillRoundRect(298, 150, 205, 705, 200, 200);
		mundo.fillRoundRect(20, 130, 205, 705, 200, 200);
		
		//nubes2//////////////////////////////////////////////////////////
		mundo.setColor(Color.WHITE);
		mundo.fillRoundRect(250, 120, 180, 35, 50, 50);
		mundo.fillRoundRect(700, 140, 130, 35, 50, 50);
		mundo.fillRoundRect(-50, 240, 200, 35, 50, 50);
		mundo.fillRoundRect(210, 280, 170, 35, 50, 50);
		mundo.fillRoundRect(480, 300, 130, 35, 50, 50);
		mundo.fillRoundRect(800, 320, 130, 35, 50, 50);
		
		//MONTAÑAS2
		mundo.setColor(Color.decode("#6a9cde"));
		mundo.fillRoundRect(-50, 330, 200, 705, 175, 175);
		mundo.fillRoundRect(298, 330, 250, 705, 200, 200);
		mundo.fillRoundRect(548, 220, 220, 705, 150, 150);
		
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
		mundo.fillRect(390, 420, 75, 30);
		mundo.setColor(Color.BLACK);
		mundo.drawRect(390, 420, 75, 30);
		
		//paredES////////////////////////////////////////////////////////////////
		
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
		mundo.fillRect(810, 450, 75, 30);
		mundo.setColor(Color.BLACK);
		mundo.drawRect(810, 450, 75, 30);
		
		//OVALOS///////////////////////////////////////////////////////////////
		mundo.setColor(Color.WHITE);
		mundo.fillOval(160, 190, 25, 40);
		mundo.fillOval(160, 270, 25, 40);
		mundo.fillOval(70, 294, 25, 40);
		
		mundo.fillOval(430, 190, 25, 40);
		mundo.fillOval(380, 250, 25, 40);
		mundo.fillOval(310, 320, 25, 40);
		
		mundo.fillOval(610, 105, 25, 40);
		mundo.fillOval(540, 190, 25, 40);
		
		mundo.fillOval(610, 305, 25, 40);
		mundo.fillOval(680, 390, 25, 40);
		
		try {
			BufferedImage image = ImageIO.read(new File("mario1.png"));
			
			mundo.drawImage(image, 570, 450, 50, 70, null);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
