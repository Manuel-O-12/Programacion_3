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
import java.awt.Shape;

import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;

class ColoredShape {
	
    Shape shape;
    Color color;

    public ColoredShape(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }
}

public class paint {

	private JFrame frmPaint;
    private Color currentColor = Color.BLACK;
    private int strokeSize = 5;
    private ArrayList<ColoredShape> shapes = new ArrayList<>();
    private Point startPoint = null;
    private JPanel panel_Dibujo;

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
		slider.setValue(25);
		slider.setPaintLabels(true);
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
		
		JButton grosor = new JButton("Limpiar");
		Border borde = BorderFactory.createLineBorder(Color.RED, 4);
		grosor.setBorder(borde);
		panel_4.add(grosor);
		
		//PANTALLA DE DIBUJO/////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel_Dibujo = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
					Graphics2D g2d = (Graphics2D) g;
					
				for (ColoredShape coloredShape : shapes) {
                    g2d.setColor(coloredShape.color);
                    g2d.setStroke(new BasicStroke(strokeSize));
                    g2d.draw(coloredShape.shape);
                }

			}
		};
		/*panel_Dibujo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
		frmPaint.getContentPane().add(panel_Dibujo, BorderLayout.CENTER);*/

		panel_Dibujo.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				startPoint = e.getPoint();
				shapes.add(new ColoredShape(new Line2D.Double(startPoint,startPoint), currentColor));
			}

			public void mouseReleased(MouseEvent e) {
				startPoint = null;
			}
		});

		panel_Dibujo.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				if (startPoint != null) {
					ColoredShape lasteShape = shapes.get(shapes.size()-1);
					lasteShape.shape = new Line2D.Double(startPoint, e.getPoint());
					startPoint = e.getPoint();
					
					panel_Dibujo.repaint();
				}
			}
		});
		panel_Dibujo.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frmPaint.getContentPane().add(panel_Dibujo, BorderLayout.CENTER);

		//COLORES////////////////////////////////////////////////////////////////////////////////////////////////		
		JPanel panel_Colores = new JPanel();
		frmPaint.getContentPane().add(panel_Colores, BorderLayout.WEST);
		panel_Colores.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Colores");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		panel_Colores.add(lblNewLabel_3, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel_Colores.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 0, 0, 0));
		
		
		
		JButton btnNewButton_2 = new JButton("Blanco");
		btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.addActionListener(e -> {
            currentColor = Color.WHITE;
            //currentShape = "Eraser";
        });
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Negro");
		 btnNewButton_3.setBackground(Color.BLACK);
	        btnNewButton_3.setForeground(Color.WHITE);
	        btnNewButton_3.addActionListener(e -> {
	            currentColor = Color.BLACK;
	            startPoint = e;
	        });
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Gris");
		btnNewButton_4.setBackground(Color.GRAY);
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.addActionListener(e -> {
	            currentColor = Color.GRAY;
	            //currentShape = "Brush";
	        });
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Rojo");
		btnNewButton_5.setBackground(Color.RED);
		btnNewButton_5.addActionListener(e -> {
            currentColor = Color.RED; 
            //currentShape = "Brush";
        });
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Verde");
		btnNewButton_6.setBackground(Color.GREEN);
		btnNewButton_6.addActionListener(e -> {
            currentColor = Color.GREEN;
            //currentShape = "Brush";
        });
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Azul");
		btnNewButton_7.setBackground(Color.BLUE);
		btnNewButton_7.addActionListener(e -> {
            currentColor = Color.BLUE;
            //currentShape = "Brush";
        });
		btnNewButton_7.setForeground(Color.WHITE);
		panel.add(btnNewButton_7);
	}

}
