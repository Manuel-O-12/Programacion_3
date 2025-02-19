package LOGIN;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	public Ventana() {
		// TODO Auto-generated constructor stub
		
		this.setVisible(true);
		this.setTitle("LOGIN");
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(true);
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(400,400));
		//this.getContentPane().setBackground(Color.gray);
		
		componentes();
		
		
	}
	
	private void componentes() {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//panel.setBackground(Color.BLUE);
		this.getContentPane().add(panel);
		 
		
		JLabel iniciar = new JLabel("Iniciar sesión",SwingConstants.CENTER);
		//iniciar.setText("Iniciar sesión");
		iniciar.setBounds(150, 40, 95, 50);
		iniciar.setForeground(Color.WHITE);
		iniciar.setOpaque(true);  //Sirve para ver el contorno del texto
		iniciar.setBackground(Color.BLACK);
		panel.add(iniciar);
		
		
		
		
		
	}

}
