import java.awt.event.*;
import javax.swing.*;

public class VentanaSaludo {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("App de Saludo ICC490");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 25);

        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270, 30, 100, 25);

        JLabel etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 80, 300, 25);

        // Acción del botón
        botonSaludar.addActionListener(e -> {
            String nombre = campoTexto.getText();

            // Aquí va lo que estaba fuera de lugar en tu código original
            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa tu nombre.");
            } else {
                etiquetaSaludo.setText("Hola : " + nombre);
            }
        });

        // Permitir que Enter haga clic en el botón
        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick();
                }
            }
        });

        ventana.add(campoTexto);
        ventana.add(botonSaludar);
        ventana.add(etiquetaSaludo);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
