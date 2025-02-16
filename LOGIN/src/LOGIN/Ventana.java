package LOGIN;

import java.awt.Dimension;

import javax.swing.JFrame;

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
		
	}

}
