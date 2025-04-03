package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Teclado {

	private JFrame frame;
	private JButton teclaActual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado window = new Teclado();
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
	public Teclado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		panel.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 10, 0, 0));
		
		String[] teclas = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", 
                "A", "S", "D", "F", "G", "H", "J", "K", "L", "Ñ", 
                "Z", "X", "C", "V", "B", "N", "M", "", "", ""};
		
		JButton[] botones = new JButton[teclas.length];
		for (int i = 0; i < teclas.length; i++) {
            botones[i] = new JButton(teclas[i]);
            botones[i].setOpaque(true);
            //botones[i].setContentAreaFilled(false);
            panel.add(botones[i]);
        }
		
		
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("TECLADO VIRTUAL");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton_28 = new JButton("ESPACIO");
		panel_2.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("BORRADOR");
		panel_2.add(btnNewButton_29);
		
		
		frame.setOpacity(1);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				char tecla = e.getKeyChar();
				JButton botonActual = buscar_Boton(tecla, botones);
                
                if (botonActual != null) {
                    if (teclaActual != null) {
                        teclaActual.setBackground(null);
                    }
                    botonActual.setBackground(Colores());
                    teclaActual = botonActual;
                }
            }

            private JButton buscar_Boton(char c, JButton[] botones) {
                for (JButton boton : botones) {
                    if (boton.getText().equalsIgnoreCase(String.valueOf(c))) {
                        return boton;
                    }
                }
                return null;
            }
            
            private Color Colores() {
            	Random aleatorio = new Random();
            	return new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256));
            }
            
        });
		
    }
}
