package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class memorama {

	private JFrame frame;
	public int []  cartas = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
	public int c1=-1,c2=-1;
	public ArrayList<JButton>cartas1 = new ArrayList<JButton>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memorama window = new memorama();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public memorama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 714);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("MEMORAMA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(128, 255, 255));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 4, 0, 0));

		//////////////////////////////////////////////////////////////////////////////////////////////

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        btnNewButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/carrito1.jpg")));
		        
		        cartas1.add(btnNewButton);
		        
		        int index = cartas1.indexOf(btnNewButton);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton);

		//////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_1.setIcon(new ImageIcon(memorama.class.getResource("/paquete/carrito1.jpg")));
				
				cartas1.add(btnNewButton_1);
				
		        int index = cartas1.indexOf(btnNewButton_1);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_1.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_1);
		
		//////////////////////////////////////////////////////////////////////////////////////////////

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_2.setIcon(new ImageIcon(memorama.class.getResource("/paquete/luna1.jpg")));
				
				cartas1.add(btnNewButton_2);
				
		        int index = cartas1.indexOf(btnNewButton_2);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_2.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_2);
		
		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_3.setIcon(new ImageIcon(memorama.class.getResource("/paquete/luna1.jpg")));
				
				cartas1.add(btnNewButton_3);
		        int index = cartas1.indexOf(btnNewButton_3);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_3.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_3);
		
		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_4.setIcon(new ImageIcon(memorama.class.getResource("/paquete/nave1.jpg")));
				
				cartas1.add(btnNewButton_4);
		        int index = cartas1.indexOf(btnNewButton_4);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_4.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_4);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_12.setIcon(new ImageIcon(memorama.class.getResource("/paquete/nave1.jpg")));
				
				cartas1.add(btnNewButton_12);
		        int index = cartas1.indexOf(btnNewButton_12);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_12.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_12);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_5.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ovni1.jpg")));
				
				cartas1.add(btnNewButton_5);
		        int index = cartas1.indexOf(btnNewButton_5);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_5.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_5);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_6.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ovni1.jpg")));
				
				cartas1.add(btnNewButton_6);
		        int index = cartas1.indexOf(btnNewButton_6);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_6.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_6);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_9.setIcon(new ImageIcon(memorama.class.getResource("/paquete/persona1.jpg")));
				
				cartas1.add(btnNewButton_9);
		        int index = cartas1.indexOf(btnNewButton_9);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_9.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_9);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_8.setIcon(new ImageIcon(memorama.class.getResource("/paquete/persona1.jpg")));
				
				cartas1.add(btnNewButton_8);
		        int index = cartas1.indexOf(btnNewButton_8);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_8.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_8);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_7.setIcon(new ImageIcon(memorama.class.getResource("/paquete/satelite1.jpg")));
				
				cartas1.add(btnNewButton_7);
		        int index = cartas1.indexOf(btnNewButton_7);

		        if (c1 == -1) {
		            c1 = cartas[index]; 
		        } else if (c2 == -1) {
		            c2 = cartas[index]; 
		        }
		        
		        if (c1 != -1 && c2 != -1) {
		            if (c1 == c2) {
		                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                    jButton.setEnabled(false);
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		            } else {
		                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
		                
		                for (JButton jButton : cartas1) {
		                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
		                }
		                
		                cartas1.clear();
		                c1 = -1;
		                c2 = -1;
		                   
		            }
		        }
		    }
		});
		btnNewButton_7.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_7);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			
			btnNewButton_10.setIcon(new ImageIcon(memorama.class.getResource("/paquete/satelite1.jpg")));
			
			cartas1.add(btnNewButton_10);
	        int index = cartas1.indexOf(btnNewButton_10);

	        if (c1 == -1) {
	            c1 = cartas[index]; 
	        } else if (c2 == -1) {
	            c2 = cartas[index]; 
	        }
	        
	        if (c1 != -1 && c2 != -1) {
	            if (c1 == c2) {
	                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                    jButton.setEnabled(false);
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	            } else {
	                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	                   
	            }
	        }
	    }
	});
		btnNewButton_10.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_10);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			
			btnNewButton_11.setIcon(new ImageIcon(memorama.class.getResource("/paquete/sol1.jpg")));
			
			cartas1.add(btnNewButton_11);
	        int index = cartas1.indexOf(btnNewButton_11);

	        if (c1 == -1) {
	            c1 = cartas[index]; 
	        } else if (c2 == -1) {
	            c2 = cartas[index]; 
	        }
	        
	        if (c1 != -1 && c2 != -1) {
	            if (c1 == c2) {
	                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                    jButton.setEnabled(false);
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	            } else {
	                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	                   
	            }
	        }
	    }
	});
		btnNewButton_11.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_11);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			
			btnNewButton_13.setIcon(new ImageIcon(memorama.class.getResource("/paquete/sol1.jpg")));
			
			cartas1.add(btnNewButton_13);
	        int index = cartas1.indexOf(btnNewButton_13);

	        if (c1 == -1) {
	            c1 = cartas[index]; 
	        } else if (c2 == -1) {
	            c2 = cartas[index]; 
	        }
	        
	        if (c1 != -1 && c2 != -1) {
	            if (c1 == c2) {
	                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                    jButton.setEnabled(false);
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	            } else {
	                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	                   
	            }
	        }
	    }
	});
		btnNewButton_13.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_13);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			
			btnNewButton_14.setIcon(new ImageIcon(memorama.class.getResource("/paquete/tierra1.jpg")));
			
			cartas1.add(btnNewButton_14);
	        int index = cartas1.indexOf(btnNewButton_14);

	        if (c1 == -1) {
	            c1 = cartas[index]; 
	        } else if (c2 == -1) {
	            c2 = cartas[index]; 
	        }
	        
	        if (c1 != -1 && c2 != -1) {
	            if (c1 == c2) {
	                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                    jButton.setEnabled(false);
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	            } else {
	                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	                   
	            }
	        }
	    }
	});
		btnNewButton_14.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_14);

		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			
			btnNewButton_15.setIcon(new ImageIcon(memorama.class.getResource("/paquete/tierra1.jpg")));
			
			cartas1.add(btnNewButton_15);
			
	        int index = cartas1.indexOf(btnNewButton_15);

	        if (c1 == -1) {
	            c1 = cartas[index]; 
	        } else if (c2 == -1) {
	            c2 = cartas[index]; 
	        }
	        
	        if (c1 != -1 && c2 != -1) {
	            if (c1 == c2) {
	                JOptionPane.showMessageDialog(null, "¡Par encontrado!", "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                    jButton.setEnabled(false);
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	            } else {
	                JOptionPane.showMessageDialog(null, "No es un par.", "Error", JOptionPane.ERROR_MESSAGE);
	                
	                for (JButton jButton : cartas1) {
	                	jButton.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.jpg")));
	                }
	                
	                cartas1.clear();
	                c1 = -1;
	                c2 = -1;
	                   
	            }
	        }
	    }
	});
		btnNewButton_15.setIcon(new ImageIcon(memorama.class.getResource("/paquete/ocultar.png")));
		panel_2.add(btnNewButton_15);
		
		//////////////////////////////////////////////////////////////////////////////////////////////

		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 255, 255));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_3.add(lblNewLabel_3);
	}

}
