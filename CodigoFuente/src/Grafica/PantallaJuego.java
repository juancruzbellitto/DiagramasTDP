package Grafica;


import java.awt.*;
import javax.swing.*;


public class PantallaJuego extends JPanel {
    private JLabel imagenNivel;
    private JScrollPane panelScrollNivel;
    private JPanel panelNivel;

    public PantallaJuego() {
        setSize(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO);
        setLayout(new BorderLayout());
        agregarImagenFondo();
        agregarScroll();
    }
/*
    protected void agregarImagenFondo() {
        ImageIcon iconoImagen = new ImageIcon(this.getClass().getResource("/imagenes/imagenNivel.png"));
        imagenNivel = new JLabel(iconoImagen);
        panelNivel = new JPanel();
        panelNivel.setLayout(null);
        imagenNivel.setBounds(0, 0, iconoImagen.getIconWidth(), iconoImagen.getIconHeight());
        panelNivel.add(imagenNivel);
        panelNivel.setPreferredSize(new Dimension(iconoImagen.getIconWidth(), iconoImagen.getIconHeight()));
    }

    protected void agregarScroll() {
        panelScrollNivel = new JScrollPane(panelNivel);
        panelScrollNivel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelScrollNivel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        panelScrollNivel.setPreferredSize(new Dimension(800, 600));
        add(panelScrollNivel, BorderLayout.CENTER);

        revalidate();
        repaint();
    }


*//





	
	public static void main(String[] args) {
        JFrame frame = new JFrame("Pantalla de Juego");
        PantallaJuego pantalla = new PantallaJuego();

        frame.add(pantalla);
        frame.setSize(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
