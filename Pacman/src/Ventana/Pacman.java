package Ventana;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.Timer;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Pacman implements KeyListener {

	private JFrame frmPacman;
	private DrawingPanel tablero;
	private int x=300,y=200;
	private Player Pacman;
	private List<Player>Paredes = new ArrayList<>();
	Timer run;
	Timer timer;
	private int press =0;
	private JLabel tiempo;
	private int seg=0,seg_2=0;
	
	
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
		panel.setBackground(Color.CYAN);
		frmPacman.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		frmPacman.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		//****PERSONAJE****//////////////////////////////////////////////////////
		Pacman=new Player(300, 200, 30, 30, Color.YELLOW);
		
		//****PAREDES****///////////////////////////////////////////////////////
		Paredes.add(new Player(300, 300, 200, 30, Color.BLUE));
		Paredes.add(new Player(120, 50, 200, 30, Color.BLUE));
		Paredes.add(new Player(600, 70, 30, 200, Color.BLUE));
		
		
		JButton Reinicio = new JButton("REINICIAR");
		Reinicio.setForeground(new Color(255, 255, 255));
		Reinicio.setBackground(new Color(64, 128, 128));
		Reinicio.setBorderPainted(false);
		Reinicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Pacman.x=300;
				Pacman.y=200;
				
				/*tablero.repaint();
				tablero.requestFocus();*/
				run.stop();
				timer.stop();
					
				seg=0;
				seg_2=0;
		        tiempo.setText(seg + ":" + (seg_2 < 10 ? "0" + seg_2 : seg_2));
		        
		        timer.start();
		        
		        tablero.repaint();
				tablero.requestFocus();
			}
		});
		panel_1.setLayout(new BorderLayout(150, 0));
		panel_1.add(Reinicio);
		
		tiempo = new JLabel("0:0");
		tiempo.setFont(new Font("Arial Black", Font.BOLD, 16));
		panel_1.add(tiempo, BorderLayout.EAST);
		//****TIEMPO****//////////////////////////////////////////////////////
		ActionListener cronometro = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				seg_2 += 1;
                if (seg_2 >= 60) {
                    seg++;
                    seg_2 = 1;
                }
                tiempo.setText(seg + ":" + (seg_2 < 10 ? "0" + seg_2 : seg_2));
			}
		};
		timer = new Timer(1000, cronometro);
        timer.start();
		
        
        //****VELOCIDAD****//////////////////////////////////////////////////////
		ActionListener taskPerformer = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				punch();
			}
		};
		run = new Timer(2, taskPerformer);////////CONTROL DE VELOCIDAD //////////
        run.start();
        
		
		tablero = new DrawingPanel();
		tablero.setBackground(Color.BLACK);
		frmPacman.getContentPane().add(tablero, BorderLayout.CENTER);
		
		
		tablero.addKeyListener(this);
		tablero.setFocusable(true);
		
	}
	
	class DrawingPanel extends JPanel{
		
		public DrawingPanel() {
			setBackground(Color.BLUE);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Pacman.color);
			g2d.fillOval(Pacman.x, Pacman.y, Pacman.w, Pacman.h);
			
			for (Player pared : Paredes) {
				g2d.setColor(pared.color);
				g2d.fillRect(pared.x, pared.y, pared.w, pared.h);
			}
			
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		press = e.getKeyCode();
		run.start();
		punch();
	}
		
		public void punch() {
			Boolean colision=false;
		
			for (Player pared : Paredes) {
				if (Pacman.colision(pared)) {
					colision = true;
					
				}
			}
		
		
		if (press == 87 || press == 38) {
			if (Pacman.y<=-25) {
				Pacman.y=410;
			}
			
			if (!colision) {
				Pacman.y-=1;
			} else {
				Pacman.y+=1;
				press=0;
			}
			
		}
		
		if (press == 83 || press == 40) {
			if (Pacman.y>=410) {
				Pacman.y=-25;
			}
			
			if (!colision) {
				Pacman.y+=1;
			} else {
				Pacman.y-=1;
				press=0;
			}
		}
		
		if (press == 65 || press == 37) {
			if (Pacman.x<=-30) {
				Pacman.x=680;
				press=0;
			}
			
			if (!colision) {
				Pacman.x-=1;
			} else {
				Pacman.x+=1;
				press=0;
			}
			
		}
		
		if (press == 68 || press == 39) {
			if (Pacman.x>=684) {
				Pacman.x=-35;
			}
			
			if (!colision) {
				Pacman.x+=1;
			} else {
				Pacman.x-=1;
				press=0;
			}
			
		}
		
		tablero.repaint();

	}
		
	
	class Player{
		int x,y,w,h;
		Color color;
		
		public Player(int x, int y, int w, int h, Color color) {
			this.x=x;
			this.y=y;
			this.w=w;
			this.h=h;
			this.color=color;
		}
		
		public Boolean colision(Player target) {
			if(this.x < target.x + target.w &&

					this.x + this.w > target.x &&

					this.y < target.y + target.h &&

					this.y + this.h > target.y) 
			{
				return true;
			}
			return false;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

