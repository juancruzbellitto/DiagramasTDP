package Grafica;

import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaInicial extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private ControladorDeVistas controladorVistas;
	private JLabel imagenFondo;
	private JButton botonIniciar;
	private JButton botonRanking;

	public PantallaInicial(ControladorDeVistas controlador_vistas) {
		this.controladorVistas = controlador_vistas;
		setSize(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO);
		setLayout(null);
		agregarImagenFondo();
		agregarBotonIniciar();
		agregarBotonRanking();
	}
	
	protected void agregarImagenFondo() {
		imagenFondo = new JLabel();
		ImageIcon iconoImagen = new ImageIcon(this.getClass().getResource("/imagenes/imagenFondo.png"));
		Image imagenEscalada = iconoImagen.getImage().getScaledInstance(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO, Image.SCALE_SMOOTH);
		Icon iconoImagenEscalado = new ImageIcon(imagenEscalada);
		imagenFondo.setIcon(iconoImagenEscalado);
		imagenFondo.setBounds(0,0, ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO);
		add(imagenFondo);
	}
	
	protected void agregarBotonIniciar() {
		botonIniciar = new JButton();
		decorarBotonIniciar();
		registrarOyenteBotonIniciar();
		add(botonIniciar);
	}
	
	protected void agregarBotonRanking() {
		botonRanking = new JButton();
		decorarBotonRanking();
		registrarOyenteBotonRanking();
		add(botonRanking);
	}
	
	protected void decorarBotonIniciar() {
		transparentarBoton(botonIniciar);
		botonIniciar.setBounds((ConstantesVistas.PANEL_ANCHO / 2) - 100 ,ConstantesVistas.PANEL_ALTO - 150, 200 , 50);
	}
	
	protected void decorarBotonRanking() {
		transparentarBoton(botonRanking);
		botonRanking.setBounds((ConstantesVistas.PANEL_ANCHO / 2) - 130 ,ConstantesVistas.PANEL_ALTO - 90, 260 , 50);
	}
	
	protected void registrarOyenteBotonIniciar() {
		botonIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorVistas.accionarInicioJuego();
			}
		});
	}
	
	protected void registrarOyenteBotonRanking() {
		botonRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorVistas.accionarPantallaRanking();
			}
		});
	}
	
	protected void transparentarBoton(JButton boton) {
		boton.setOpaque(false);
		boton.setContentAreaFilled(false);
		boton.setBorderPainted(false);
	}
}