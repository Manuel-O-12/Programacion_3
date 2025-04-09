package Ventana;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Rectangle;

public class Pacman implements KeyListener {

	private JFrame frmPacman;
	private pacman tablero;
	private int x=300,y=200;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman window = new Pacman();
					window.frmPacman.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pacman() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPacman = new JFrame();
		frmPacman.setTitle("PAC-MAN");
		frmPacman.setBounds(100, 100, 700, 500);
		frmPacman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		frmPacman.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		frmPacman.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton Reinicio = new JButton("REINICIAR");
		Reinicio.setForeground(new Color(255, 255, 255));
		Reinicio.setBackground(new Color(64, 128, 128));
		Reinicio.setBorderPainted(false);
		Reinicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				x=300;
				y=200;
				
				tablero.repaint();
				tablero.requestFocus();
			}
		});
		panel_1.add(Reinicio);
		
		tablero = new pacman();
		tablero.setBackground(Color.BLUE);
		frmPacman.getContentPane().add(tablero, BorderLayout.CENTER);
		
		
		tablero.addKeyListener(this);
		tablero.setFocusable(true);
		
	}
	
	class pacman extends JPanel{
		
		public pacman() {
			setBackground(Color.WHITE);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Color.YELLOW);
			g2d.fillOval(x, y, 30, 30);
			
			
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		/*38arr
		40aba
		39dere
		37izq*/
		
		if (e.getKeyCode() == 87 || e.getKeyCode() == 38) {
			y-=5;
			if (y<=-30) {
				y=440;
			}
		}
		
		if (e.getKeyCode() == 83 || e.getKeyCode() == 40) {
			y+=5;
			if (y>=440) {
				y=-25;
			}
		}
		
		if (e.getKeyCode() == 65 || e.getKeyCode() == 37) {
			x-=5;
			if (x<=-30) {
				x=680;
			}
		}
		
		if (e.getKeyCode() == 68 || e.getKeyCode() == 39) {
			x+=5;
			if (x>=684) {
				x=-35;
			}
		}
		
		tablero.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

