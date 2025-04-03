package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Teclado {

	private JFrame frame;

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
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 10, 0, 0));
		
		JButton btnNewButton = new JButton("Q");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("W");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("E");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("R");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("T");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Y");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("U");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("I");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("O");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("P");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("A");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("S");
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("D");
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("F");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("G");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("H");
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("J");
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("K");
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("L");
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("Ñ");
		panel.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("Z");
		panel.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("X");
		panel.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("C");
		panel.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("V");
		panel.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("V");
		panel.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("B");
		panel.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("N");
		panel.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("M");
		panel.add(btnNewButton_27);
		
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
	}

}
