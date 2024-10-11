package Vistas;

import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Icon;

public class PantallaInicio extends JPanel{
	
	private static final long serialVersionUID = 1431423425502117803L;
	private ControladorVistas controladorVistas;
	private JLabel imagenFondo;
	private JButton botonIniciar;
	private JButton botonCambiarModo;
	private JButton botonRanking;
	
	public PantallaInicio(ControladorVistas controlador) {
		this.controladorVistas = controlador;
		setSize(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO);
		setLayout(null);
		agregarImagenFondo();
		agregarBotonIniciar();
		agregarBotonCambiarModo();
		agregarBotonRanking();
	}

	protected void agregarBotonRanking() {
		botonRanking = new JButton();
		decorarBotonRanking();
		//registrarOyenteBotonRanking();
		add(botonRanking);
	}

	protected void agregarBotonCambiarModo() {
		botonCambiarModo = new JButton();
		//decorarBotonCambiarModo();
		//registrarOyenteBotonCambiarModo();
		add(botonCambiarModo);

	}

	protected void agregarBotonIniciar() {
		botonIniciar = new JButton();
		decorarBotonIniciar();
		//registrarOyenteBotonIniciar();
		add(botonIniciar);
	}

	protected void agregarImagenFondo() {
		imagenFondo = new JLabel();
		ImageIcon iconoImagen = new ImageIcon(this.getClass().getResource("/Sprites/fondo_pantalla_inicio.png"));
		Image imagenEscalada = iconoImagen.getImage().getScaledInstance(ConstantesVistas.VENTANA_ANCHO, ConstantesVistas.PANEL_ALTO, Image.SCALE_SMOOTH);
		Icon iconoImagenEscalada = new ImageIcon(imagenEscalada);
		imagenFondo.setIcon(iconoImagenEscalada);
		imagenFondo.setBounds(0, 0, ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO);
		add(imagenFondo);
		
	}
	
	protected void decorarBotonRanking() {
		transparentarBoton(botonRanking);
		botonRanking.setBounds((ConstantesVistas.PANEL_ANCHO / 2) - 100 ,ConstantesVistas.PANEL_ALTO - 150, 200 , 50);
	}
	
	/*
	 * protected void decorarBotonCambiarModo() {
		transparentarBoton(botonCambiarModo);
		botonCambiarModo.setBounds((ConstantesVistas.PANEL_ANCHO / 2) - 100 ,ConstantesVistas.PANEL_ALTO - 150, 200 , 50);
		}
	 * 
	 * 
	 */
	
	
	protected void decorarBotonIniciar() {
		transparentarBoton(botonIniciar);
		botonIniciar.setBounds((ConstantesVistas.PANEL_ANCHO / 2) - 130 ,ConstantesVistas.PANEL_ALTO - 90, 260 , 50);
	}
	
	/*
	protected void registrarOyenteBotonRanking() {
		botonRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorVistas.accionarInicioJuego();
			}
		});
	}
	
	protected void registrarOyenteBotonCambiarModo() {
		botonCambiarModo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorVistas.accionarInicioJuego();
			}
		});
	}
	
	protected void registrarOyenteBotonIniciar() {
		botonIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorVistas.accionarInicioJuego();
			}
		});
	}
	*/
	
	protected void transparentarBoton(JButton boton) {
		boton.setOpaque(false);
		boton.setContentAreaFilled(false);
		boton.setBorderPainted(false);
	}
	
}
