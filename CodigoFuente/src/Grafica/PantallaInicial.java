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
	private JButton botonIniciarModo1;
	private JButton botonIniciarModo2;
	private JButton botonRanking;

	
	private static final String RUTA_FONDO_PANTALLA_INICIAL = "/Imagenes/imagenPantallaInicial.png";

	public PantallaInicial(ControladorDeVistas controlador_vistas) {
		this.controladorVistas = controlador_vistas;
		setSize(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO);
		setLayout(null);
		agregarImagenFondo();
		agregarBotonIniciarModo1();
		agregarBotonIniciarModo2();
		agregarBotonRanking();

	}
	
	protected void agregarImagenFondo() {
		imagenFondo = new JLabel();
		ImageIcon iconoImagen = new ImageIcon(this.getClass().getResource(RUTA_FONDO_PANTALLA_INICIAL));
		Image imagenEscalada = iconoImagen.getImage().getScaledInstance(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO, Image.SCALE_SMOOTH);
		Icon iconoImagenEscalado = new ImageIcon(imagenEscalada);
		imagenFondo.setIcon(iconoImagenEscalado);
		imagenFondo.setBounds(0,0, ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO);
		add(imagenFondo);
	}
	
	protected void agregarBotonIniciarModo1() {
		botonIniciarModo1 = new JButton();
		decorarBotonIniciarModo1();
		registrarOyenteBotonIniciarModo1();
		add(botonIniciarModo1);
	}
	
	protected void agregarBotonIniciarModo2() {
		botonIniciarModo2 = new JButton();
		decorarBotonIniciarModo2();
		registrarOyenteBotonIniciarModo1();
		add(botonIniciarModo2);
	}
	
	protected void agregarBotonRanking() {
		botonRanking = new JButton();
		decorarBotonRanking();
		registrarOyenteBotonRanking();
		add(botonRanking);
	}
	
	protected void decorarBotonIniciarModo1() {
		transparentarBoton(botonIniciarModo1);
		botonIniciarModo1.setBounds((ConstantesVistas.PANEL_ANCHO / 2) - 140 ,ConstantesVistas.PANEL_ALTO - 250, 330 , 40);
	}
	
	protected void decorarBotonIniciarModo2() {
		transparentarBoton(botonIniciarModo2);
		botonIniciarModo2.setBounds((ConstantesVistas.PANEL_ANCHO / 2) - 140 ,ConstantesVistas.PANEL_ALTO - 200, 330 , 40);
	}
	
	protected void decorarBotonRanking() {
		transparentarBoton(botonRanking);
		botonRanking.setBounds((ConstantesVistas.PANEL_ANCHO / 2) - 140 ,ConstantesVistas.PANEL_ALTO - 143, 330 , 40);
	}
	
	protected void registrarOyenteBotonIniciarModo1() {
		botonIniciarModo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorVistas.accionarInicioJuego();
			}
		});
	}
	
	protected void registrarOyenteBotonIniciarModo2() {
		botonIniciarModo2.addActionListener(new ActionListener() {
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