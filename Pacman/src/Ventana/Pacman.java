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
	private JLabel tiempo,puntos;
	private int seg=0,seg_2=0;
	private List<Player>Pastillas = new ArrayList<>();
	private int x2,y2;
	private int puntosActuales;
	
	
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
		nuevasPastillas();
		Paredes();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPacman = new JFrame();
		frmPacman.setTitle("PAC-MAN");
		frmPacman.setBounds(100, 0, 700, 750);
		frmPacman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmPacman.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frmPacman.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		//****PERSONAJE****//////////////////////////////////////////////////////
		Pacman=new Player(335, 300, 30, 30, Color.YELLOW);
		
		//****PAREDES****////////////////////////////////////////////////////////////////
		
		//***************////////////////////////////////////////////////////////////////
		
		//Pastillas.add(new Player(55, 20, 20, 20, Color.WHITE));
		
		/////////////////////////////////////////////////////////////////////////////////
		
		JButton Reinicio = new JButton("REINICIAR");
		Reinicio.setForeground(new Color(255, 255, 255));
		Reinicio.setBackground(Color.decode("#006400"));
		Reinicio.setBorderPainted(false);
		Reinicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Pacman.x=335;
				Pacman.y=300;
				
				/*tablero.repaint();
				tablero.requestFocus();*/
				run.stop();
				timer.stop();
					
				seg=0;
				seg_2=0;
		        tiempo.setText("Tiempo: " +seg + ":" + (seg_2 < 10 ? "0" + seg_2 : seg_2));
		        
		        timer.start();
		        
		        tablero.repaint();
				tablero.requestFocus();
				
				puntos.setText("Puntos: 0 ");
				Pastillas.clear();
				nuevasPastillas();
				
			}
		});
		panel_1.setLayout(new BorderLayout(150, 0));
		panel_1.add(Reinicio);
		
		tiempo = new JLabel("Tiempo: 0:0");
		tiempo.setFont(new Font("Arial Black", Font.BOLD, 16));
		panel_1.add(tiempo, BorderLayout.EAST);
		
		puntos = new JLabel("Puntos: 0");
		puntos.setFont(new Font("Arial Black", Font.BOLD, 16));
		panel_1.add(puntos, BorderLayout.WEST);
		
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
                tiempo.setText("Tiempo: " +seg + ":" + (seg_2 < 10 ? "0" + seg_2 : seg_2));
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
		run = new Timer(5, taskPerformer);////////CONTROL DE VELOCIDAD //////////
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
				//g2d.fillRoundRect(x, y, w, HEIGHT, WIDTH, HEIGHT);
			}
			
			for(Player pastilla : Pastillas ) {
				g2d.setColor(Color.WHITE);
				g2d.fillOval(pastilla.x, pastilla.y, pastilla.w, pastilla.h);
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
			
			for (Iterator<Player> iterator = Pastillas.iterator(); iterator.hasNext();) {
		        Player pastilla = iterator.next();
		        
		        if (Pacman.colision(pastilla)) {
		            iterator.remove();
		            
		            puntosActuales += 5;
		            
		            puntos.setText("Puntos: " + puntosActuales);
		        }
		    }

		    x2 = Pacman.x;
		    y2 = Pacman.y;

		    if (press == 87 || press == 38) {
		    	if (y2<=-25) {
					y2=670;
				}
		    	y2 -= 1;
		    }

		    if (press == 83 || press == 40) {
		    	if (y2>=670) {
		    		y2=-25;
				}
		    	y2 += 1;
		    }

		    if (press == 65 || press == 37) {
		    	if (x2<=-30) {
		    		x2=680;
				}
		    	x2 -= 1;
		    }

		    if (press == 68 || press == 39) {
		    	if (x2>=684) {
		    		x2=-35;
				}
		    	x2 += 1;
		    }

		    for (Player pared : Paredes) {
		        if (new Player(x2, y2, Pacman.w, Pacman.h, null).colision(pared)) {
		            colision = true;
		        }
		    }

		    if (!colision) {
		        Pacman.x = x2;
		        Pacman.y = y2;
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
	
	private void Paredes() {
		Paredes.add(new Player(0, 0, 325, 10, Color.decode("#f106e8")));//Arriba-Izquierda
		Paredes.add(new Player(375, 0, 400, 10, Color.decode("#f106e8")));//Arriba-Derecha
		Paredes.add(new Player(0, 10, 10, 210, Color.decode("#f106e8")));//Izquierda-Arriba
		Paredes.add(new Player(0, 430, 10, 350, Color.decode("#f106e8")));//Izquierda-Abajo
		Paredes.add(new Player(0, 664, 325, 10, Color.decode("#f106e8")));//Abajo-Izquierda
		Paredes.add(new Player(375, 664, 400, 10, Color.decode("#f106e8")));//Abajo-Derecha
		Paredes.add(new Player(673, 10, 10, 210, Color.decode("#f106e8")));//Derecha-Arriba
		Paredes.add(new Player(673, 430, 10, 350, Color.decode("#f106e8")));//Derecha-Abajo
		
		Paredes.add(new Player(50, 50, 80, 40, Color.BLUE));
		Paredes.add(new Player(180, 50, 90, 40, Color.BLUE));
		
		Paredes.add(new Player(315, 10, 10, 80, Color.BLUE));
		Paredes.add(new Player(375, 10, 10, 80, Color.BLUE));
		
		Paredes.add(new Player(430, 50, 80, 40, Color.BLUE));
		Paredes.add(new Player(560, 50, 70, 40, Color.BLUE));
		
		Paredes.add(new Player(50, 140, 80, 30, Color.BLUE)); 
		Paredes.add(new Player(180, 140, 30, 160, Color.BLUE));
		Paredes.add(new Player(180, 210, 110, 30, Color.BLUE));
		Paredes.add(new Player(260, 140, 170, 30, Color.BLUE));//T//
		Paredes.add(new Player(335, 140, 30, 100, Color.BLUE));//T//
		Paredes.add(new Player(480, 140, 30, 160, Color.BLUE));
		Paredes.add(new Player(410, 210, 80, 30, Color.BLUE));
		Paredes.add(new Player(560, 140, 70, 30, Color.BLUE));
		
		Paredes.add(new Player(10, 210, 120, 10, Color.decode("#f106e8")));
		Paredes.add(new Player(120, 210, 10, 90, Color.decode("#f106e8")));
		Paredes.add(new Player(0, 290, 120, 10, Color.decode("#f106e8")));
		
		Paredes.add(new Player(560, 210, 115, 10, Color.decode("#f106e8")));
		Paredes.add(new Player(560, 210, 10, 90, Color.decode("#f106e8")));
		Paredes.add(new Player(560, 290, 125, 10, Color.decode("#f106e8")));
		
		Paredes.add(new Player(0, 350, 130, 10, Color.decode("#f106e8")));
		Paredes.add(new Player(120, 350, 10, 90, Color.decode("#f106e8")));
		Paredes.add(new Player(10, 430, 120, 10, Color.decode("#f106e8")));
		
		Paredes.add(new Player(560, 350, 125, 10, Color.decode("#f106e8")));
		Paredes.add(new Player(560, 350, 10, 90, Color.decode("#f106e8")));
		Paredes.add(new Player(560, 430, 125, 10, Color.decode("#f106e8")));
		
		Paredes.add(new Player(180, 350, 30, 90, Color.BLUE));
		Paredes.add(new Player(480, 350, 30, 90, Color.BLUE));

		Paredes.add(new Player(260, 410, 160, 30, Color.BLUE));//T//
		Paredes.add(new Player(335, 430, 30, 60, Color.BLUE));//T//
		
		Paredes.add(new Player(260, 550, 170, 20, Color.BLUE));//T//
		Paredes.add(new Player(335, 570, 30, 50, Color.BLUE));//T//
		
		Paredes.add(new Player(180, 480, 110, 30, Color.BLUE));
		Paredes.add(new Player(410, 480, 100, 30, Color.BLUE));
		
		Paredes.add(new Player(560, 480, 70, 30, Color.BLUE));
		Paredes.add(new Player(560, 510, 30, 60, Color.BLUE));
		
		Paredes.add(new Player(50, 480, 80, 30, Color.BLUE));
		Paredes.add(new Player(100, 510, 30, 60, Color.BLUE));
		
		Paredes.add(new Player(180, 560, 30, 50, Color.BLUE));//T//
		Paredes.add(new Player(50, 610, 240, 15, Color.BLUE));//T//
		
		Paredes.add(new Player(480, 560, 30, 50, Color.BLUE));//T//
		Paredes.add(new Player(410, 610, 220, 15, Color.BLUE));//T//
	}
	
	 private void nuevasPastillas() {
	        Pastillas.clear();
	        
	        for (int i = 0; i < 11; i++) {
	        		Pastillas.add(new Player(145, 70 + i * 50, 20, 20, Color.WHITE));
		            
		        }
	        
	        for (int i = 0; i < 11; i++) {
        		Pastillas.add(new Player(525, 70 + i * 50, 20, 20, Color.WHITE));
	            
	        }
	        
	        for (int i = 0; i < 11; i++) {
        		Pastillas.add(new Player(22 + i * 62, 25, 20, 20, Color.WHITE));
	            
	        }
	        
	        for (int i = 0; i < 11; i++) {
        		Pastillas.add(new Player(22 + i * 62, 635, 20, 20, Color.WHITE));
	            
	        }
	        
	        for (int i = 0; i < 5; i++) {
        		Pastillas.add(new Player(220 + i * 62, 110, 20, 20, Color.WHITE));
	            
	        }
	        
	        for (int i = 0; i < 5; i++) {
        		Pastillas.add(new Player(220 + i * 62, 520, 20, 20, Color.WHITE));
	            
	        }
	        
	        /*Pastillas.add(new Player(55, 20, 20, 20, Color.WHITE));
	        Pastillas.add(new Player(100, 100, 20, 20, Color.WHITE));
	        for (int i = 0; i < 30; i++) {
		    	g2d.fillRect(10 + i * 30, 350, 20, 100);
		            
		        }*/
	 }

}

