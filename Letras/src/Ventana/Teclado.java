package Ventana;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Teclado implements KeyListener {

    private JFrame frame;
    private JButton teclaActual;
    private List<String> Palabras = new ArrayList<>();
    private JLabel lblNewLabel_1,lblNewLabel_2;
    private Timer timer;
    private JButton[] botones;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Teclado window = new Teclado();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
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
        frame.setFocusable(true);
        frame.addKeyListener(this);

        Palabras.add("mango");
        Palabras.add("platano");
        Palabras.add("fresa");
        Palabras.add("manzana");
        Palabras.add("pera");
        Palabras.add("naranja");
        Palabras.add("uva");

        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 192, 192));
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 10, 0, 0));

        JPanel panel_1 = new JPanel();
        frame.getContentPane().add(panel_1, BorderLayout.NORTH);
        panel_1.setLayout(new BorderLayout(0, 0));

        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 30));
        panel_1.add(lblNewLabel_1, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("Palabra a Escribir");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel_1.add(lblNewLabel, BorderLayout.NORTH);

        lblNewLabel_2 = new JLabel("0:0");
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
        panel_1.add(lblNewLabel_2, BorderLayout.EAST);

        JPanel panel_2 = new JPanel();
        frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
        panel_2.setLayout(new GridLayout(0, 2, 0, 0));

        JButton btnNewButton_28 = new JButton("ESPACIO");
        panel_2.add(btnNewButton_28);

        JButton btnNewButton_29 = new JButton("BORRADOR");
        panel_2.add(btnNewButton_29);

        String[] teclas = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P",
                           "A", "S", "D", "F", "G", "H", "J", "K", "L", "Ñ",
                           "Z", "X", "C", "V", "B", "N", "M", "", "", ""};

        botones = new JButton[teclas.length];

        for (int i = 0; i < teclas.length; i++) {
            botones[i] = new JButton(teclas[i]);
            botones[i].setOpaque(true);
            panel.add(botones[i]);
        }

        Random nombres_random = new Random();
        int nombre = nombres_random.nextInt(Palabras.size());
        lblNewLabel_1.setText(Palabras.get(nombre));

        ActionListener taskPerformer = new ActionListener() {
            int seg = 0;
            int mil = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                mil += 1;
                if (mil >= 60) {
                    seg++;
                    mil = 0;
                }
                lblNewLabel_2.setText(seg + ":" + (mil < 10 ? "0" + mil : mil));
            }
        };

        timer = new Timer(1000, taskPerformer);
        timer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
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

    @Override
    public void keyReleased(KeyEvent e) {
        // No se necesita implementación aquí
    }
}
