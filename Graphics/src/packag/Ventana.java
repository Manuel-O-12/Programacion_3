package packag;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JPanel {
	
	public Ventana() {
        
        JFrame frame = new JFrame("PRUEBAS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(this); 
        frame.setVisible(true);
        
    }

	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D)g.create();
		g2d.setStroke(new BasicStroke(5));
		
		g2d.drawRect(100, 100, 80, 80);
		
		g2d.setColor(Color.BLUE);
		
		g2d.fillRect(120, 120, 80, 80);
		
		g2d.setColor(Color.GREEN);
		
		g2d.setFont(new Font("Trébol",Font.BOLD,60));
		g2d.drawString("HOLA", 450, 450);
		
		g2d.drawLine(0, 0, 400, 400);
		
		g2d.setColor(Color.BLACK);
		g2d.drawArc(400, 100, 100, 100, 0, 180);
		g2d.setColor(Color.ORANGE);
		g2d.drawArc(400, 100, 100, 100, 0, 180);
		
		g2d.drawOval(100, 400, 90, 190);
		
		g2d.fillOval(150, 400, 190, 90);
		
		try {
			BufferedImage image = ImageIO.read(new File("Abeja.png"));
			g2d.drawImage(image, 500, 0, null);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//int[] xs = {};
		
		//g2d.drawPolygon(null);
		
	}
	

}
