package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;

import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;


class Trazo{
	List<Point> puntos;
	float grosor;
	Color color;
	
	public Trazo(List<Point> puntos, float grosor, Color color) {
		this.puntos = puntos;
		this.grosor = grosor;
		this.color = color;
	}

	public Color getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
}

public class paint implements MouseListener, MouseMotionListener {

	private JFrame frmPaint;
	
	private DrawingPanel drawingPanel; 
 	
 	private Point lastPoint;

 	private List<Point> points = new ArrayList<>();
 	
     List<Trazo> listaDeTrazos = new ArrayList<>();
     
    private float currentStrokeWidth = 5.0f;
    
    private Color currentColor = Color.BLACK;
    
    private List<Rectangle> figuras = new ArrayList<>();
    private List<Triangle> figuras_1 = new ArrayList<>();
    private List<Oval> figura_2 = new ArrayList<>();
    
    
    private int method = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paint window = new paint();
					window.frmPaint.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmPaint = new JFrame();
		frmPaint.setIconImage(Toolkit.getDefaultToolkit().getImage(paint.class.getResource("/paquete/icons8.png")));
		frmPaint.setTitle("Paint");
		frmPaint.setBounds(100, 100, 700, 500);
		frmPaint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_Herramientas = new JPanel();
		frmPaint.getContentPane().add(panel_Herramientas, BorderLayout.NORTH);
		panel_Herramientas.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_Herramientas.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_Herramientas.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel(" Herramientas");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 13));
		panel_1.add(lblNewLabel);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(0, 4, 0, 0));
		
		
		//DESHACER///////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_12 = new JButton("");
		ImageIcon originalIcon_12 = new ImageIcon(paint.class.getResource("/paquete/volver.png"));
		Image image_12 = originalIcon_12.getImage();
		Image scaledImage_12 = image_12.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon_12 = new ImageIcon(scaledImage_12);
		btnNewButton_12.setBackground(Color.WHITE);
		btnNewButton_12.setIcon(scaledIcon_12);
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setFocusPainted(false);
		btnNewButton_12.setContentAreaFilled(true); 
		btnNewButton_12.setPreferredSize(new Dimension(scaledImage_12.getWidth(null), scaledImage_12.getHeight(null)));
		panel_7.add(btnNewButton_12);
		
		//REHACER/////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_13 = new JButton("");
		ImageIcon originalIcon_13 = new ImageIcon(paint.class.getResource("/paquete/Rehacer.png"));
		Image image_13 = originalIcon_13.getImage();
		Image scaledImage_13 = image_13.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon_13 = new ImageIcon(scaledImage_13);
		btnNewButton_13.setBackground(Color.WHITE);
		btnNewButton_13.setIcon(scaledIcon_13);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setFocusPainted(false);
		btnNewButton_13.setContentAreaFilled(true); 
		btnNewButton_13.setPreferredSize(new Dimension(scaledImage_13.getWidth(null), scaledImage_13.getHeight(null)));
		panel_7.add(btnNewButton_13);
		
		//DIBUJAR//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//PIMCEL////////////////////////////////////////////////////////////////////////////////////////////////////////	
		JButton btnNewButton = new JButton("");
		ImageIcon originalIcon = new ImageIcon(paint.class.getResource("/paquete/Pincel.png"));
		Image image = originalIcon.getImage();
		Image scaledImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(scaledImage);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(scaledIcon);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(true); 
		btnNewButton.setPreferredSize(new Dimension(scaledImage.getWidth(null), scaledImage.getHeight(null)));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				method = 1;
				
			}
		});
		panel_7.add(btnNewButton);			
		
		//BORRADOR//////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		ImageIcon originalIcon_1 = new ImageIcon(paint.class.getResource("/paquete/Borrador.png"));
		Image image_1 = originalIcon_1.getImage();
		Image scaledImage_1 = image_1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon_1 = new ImageIcon(scaledImage_1);		
		btnNewButton_1.setIcon(scaledIcon_1);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(true); 
		btnNewButton_1.setPreferredSize(new Dimension(scaledImage.getWidth(null), scaledImage.getHeight(null)));
		panel_7.add(btnNewButton_1);
		//GROSOSR/////////////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel lblNewLabel_2 = new JLabel("Grosor");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		panel_7.add(lblNewLabel_2);
		
		JSlider slider = new JSlider();
		slider.setBackground(Color.WHITE);
		slider.setMinimum(1);
		slider.setMaximum(40);
		slider.setValue(10);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.addChangeListener(e ->{
			currentStrokeWidth = slider.getValue();
		});
		panel_7.add(slider);
		
		//FORMAS////////////////////////////////////////////////////////////////////////////////////////////////////////
		JPanel panel_3 = new JPanel();
		panel_Herramientas.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_8, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Formas geométricas");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		panel_8.add(lblNewLabel_1);
		
		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton Cuadrado = new JButton("");
		Cuadrado.setBackground(Color.WHITE);
		ImageIcon originalIcon_8 = new ImageIcon(paint.class.getResource("/paquete/Cuadrado.png"));
		Image image_8 = originalIcon_8.getImage();
		Image scaledImage_8 = image_8.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon_8 = new ImageIcon(scaledImage_8);
		Cuadrado.setIcon(scaledIcon_8);
		Cuadrado.setBorderPainted(false);
		Cuadrado.setFocusPainted(false);
		Cuadrado.setContentAreaFilled(true); 
		Cuadrado.setPreferredSize(new Dimension(scaledImage_8.getWidth(null), scaledImage_8.getHeight(null)));
		Cuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				method = 2;
			}
		});
		panel_9.add(Cuadrado);
		
		JButton Circulo = new JButton("");
		Circulo.setBackground(Color.WHITE);
		ImageIcon originalIcon_9 = new ImageIcon(paint.class.getResource("/paquete/Circulo.png"));
		Image image_9 = originalIcon_9.getImage();
		Image scaledImage_9 = image_9.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon_9 = new ImageIcon(scaledImage_9);
		Circulo.setIcon(scaledIcon_9);
		Circulo.setBorderPainted(false);
		Circulo.setFocusPainted(false);
		Circulo.setContentAreaFilled(true); 
		Circulo.setPreferredSize(new Dimension(scaledImage_9.getWidth(null), scaledImage_8.getHeight(null)));
		Circulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				method = 3;
			}
		});
		panel_9.add(Circulo);
		
		JButton Triangulo = new JButton("");
		Triangulo.setBackground(Color.WHITE);
		ImageIcon originalIcon_10 = new ImageIcon(paint.class.getResource("/paquete/Triangulo.png"));
		Image image_10 = originalIcon_10.getImage();
		Image scaledImage_10 = image_10.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon_10 = new ImageIcon(scaledImage_10);
		Triangulo.setIcon(scaledIcon_10);
		Triangulo.setBorderPainted(false);
		Triangulo.setFocusPainted(false);
		Triangulo.setContentAreaFilled(true); 
		Triangulo.setPreferredSize(new Dimension(scaledImage_10.getWidth(null), scaledImage_8.getHeight(null)));
		Triangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				method = 4;
			}
		});
		panel_9.add(Triangulo);
		
		JButton Linea = new JButton("");
		Linea.setBackground(Color.WHITE);
		ImageIcon originalIcon_11 = new ImageIcon(paint.class.getResource("/paquete/Linea.png"));
		Image image_11 = originalIcon_11.getImage();
		Image scaledImage_11 = image_11.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon_11 = new ImageIcon(scaledImage_11);
		Linea.setIcon(scaledIcon_11);
		Linea.setBorderPainted(false);
		Linea.setFocusPainted(false);
		Linea.setContentAreaFilled(true); 
		Linea.setPreferredSize(new Dimension(scaledImage_8.getWidth(null), scaledImage_8.getHeight(null)));
		panel_9.add(Linea);
		
		//LIMPIAR/////////////////////////////////////////////////////////////
		JPanel panel_4 = new JPanel();
		panel_Herramientas.add(panel_4);
		
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton Limpiar = new JButton("Limpiar");
		Border borde = BorderFactory.createLineBorder(Color.RED, 4);
		Limpiar.setBorder(borde);
		Limpiar.addActionListener(e ->{
			int responde = JOptionPane.showConfirmDialog(frmPaint, "Seguro quieres elimiar todo?", "confirmar la limpieza", JOptionPane.YES_NO_OPTION);
			
			if (responde == JOptionPane.YES_NO_OPTION) {
				listaDeTrazos.clear();
				points.clear();
				figuras.clear();
				figuras_1.clear();
				figura_2.clear();
				drawingPanel.repaint();
				
			}
		});
		panel_4.add(Limpiar);
		
		//PANTALLA DE DIBUJO/////////////////////////////////////////////////////////////////////////////////////
		
		drawingPanel = new DrawingPanel();
		frmPaint.add(drawingPanel, BorderLayout.CENTER);
		
		drawingPanel.addMouseListener(this);
		drawingPanel.addMouseMotionListener(this);
		
		
		/*JPanel panel_Dibujo = new JPanel();
		panel_Dibujo.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frmPaint.add(panel_Dibujo, BorderLayout.CENTER);*/

		//COLORES////////////////////////////////////////////////////////////////////////////////////////////////		
		JPanel panel_Colores = new JPanel();
		frmPaint.getContentPane().add(panel_Colores, BorderLayout.WEST);
		panel_Colores.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_Colores.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Colores");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		panel_Colores.add(lblNewLabel_3, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel_Colores.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 0, 0, 0));
		
		
		JButton Blanco = new JButton("Blanco");
		Blanco.setBackground(Color.WHITE);
		Blanco.addActionListener(e -> currentColor = Color.WHITE);
		panel.add(Blanco);
		
		JButton Negro = new JButton("Negro");
		Negro.addActionListener(e -> currentColor = Color.BLACK);
		Negro.setBackground(Color.BLACK);
		Negro.setForeground(Color.WHITE);
		panel.add(Negro);
		
		JButton Gris = new JButton("Gris");
		Gris.setBackground(Color.GRAY);
		Gris.setForeground(Color.WHITE);
		Gris.addActionListener(e -> currentColor = Color.GRAY);
		panel.add(Gris);
		
		JButton Rojo = new JButton("Rojo");
		Rojo.setBackground(Color.RED);
		Rojo.addActionListener(e -> currentColor = Color.RED);
		panel.add(Rojo);
		
		JButton Verde = new JButton("Verde");
		Verde.setBackground(Color.GREEN);
		Verde.addActionListener(e -> currentColor = Color.GREEN);
		panel.add(Verde);
		
		JButton Azul = new JButton("Azul");
		Azul.setBackground(Color.BLUE);
		Azul.setForeground(Color.WHITE);
		Azul.addActionListener(e -> currentColor = Color.BLUE);
		panel.add(Azul);
	}
///////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (method==2) {
			Rectangle tmp = new Rectangle(e.getX(), e.getY(), 100, 100);
			figuras.add(tmp);
		}
		
		if (method==4) {
			Triangle tmp = new Triangle(e.getX(), e.getY(), 100);
			figuras_1.add(tmp);
		}
		
		if (method==3) {
			Oval tmp = new Oval(e.getX(), e.getY());
			figura_2.add(tmp);
		}
		
		drawingPanel.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		lastPoint = e.getPoint();
		
		points.add(lastPoint);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		ArrayList<Point>listaCopiada = new ArrayList<>(points);
		
		Trazo nuevoTrazo = new Trazo (new ArrayList<>(points),currentStrokeWidth,currentColor);
		
		//Trazo nuevotraTrazo = new Trazo(new ArrayList<>(points), currentColor);
		listaDeTrazos.add(nuevoTrazo);
		points.clear();
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Point newPoint = e.getPoint();
		
		if (method==1) {
			points.add(newPoint);
		}
		
		drawingPanel.repaint();
		
		lastPoint = newPoint;
		
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////
	class DrawingPanel extends JPanel{
		
		public DrawingPanel() {
			
			setBackground(Color.WHITE);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			for (Trazo trazo : listaDeTrazos) {
				g2d.setStroke(new BasicStroke(trazo.grosor));
				g2d.setColor(trazo.getColor());
				
				for (int i = 1; i < trazo.puntos.size(); i++) {
					Point p1 = trazo.puntos.get(i - 1);
					Point p2 = trazo.puntos.get(i);
					g2d.drawLine(p1.x, p1.y, p2.x, p2.y);

				}
			}
			
			
			g2d.setStroke(new BasicStroke(currentStrokeWidth));
			g2d.setColor(currentColor);
			for (int i = 1; i < points.size(); i++) {
				Point p1 = points.get(i - 1);
				Point p2 = points.get(i);
				g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
			}
			
			for (Iterator iterator = figuras.iterator(); iterator.hasNext();) {
				Rectangle rectangle = (Rectangle) iterator.next();
				
				g2d.drawRect(rectangle.x, rectangle.y, rectangle.w, rectangle.h);
				
			}
			
			for (Triangle triangle : figuras_1) {
		        g2d.drawPolygon(triangle.xPoints, triangle.yPoints, 3);
		    }
			
			for (Iterator iterator = figura_2.iterator(); iterator.hasNext();) {
				Oval oval = (Oval) iterator.next();
				g2d.drawOval(oval.x, oval.y, 100, 100);
			}
		}
	}
	
		class Rectangle{
	 		
	 		private int x,y,w,h;
	 		
	 		public Rectangle(int x, int y,int w, int h)
	 		{
	 			this.x = x;
	 			this.y = y;
	 			this.w = w;
	 			this.h = h;
	 		}
	 	}
		
		class Triangle {
		    private int[] xPoints;
		    private int[] yPoints;

		    public Triangle(int x, int y, int size) {
		        this.xPoints = new int[] { x, x - size, x + size };
		        this.yPoints = new int[] { y, y + size, y + size };
		    }
		}
		
		class Oval{
			
			private int x,y;
			
			public Oval(int x, int y) {
				this.x = x;
				this.y = y;
			}
			
		}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
