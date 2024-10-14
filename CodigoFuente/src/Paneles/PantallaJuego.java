package Paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

import Juego.EntidadJugador;
import Juego.EntidadLogica;
import KeyHandler.KeyHandler;
import Grafica.*;

public class PantallaJuego extends JPanel{

	private static final long serialVersionUID = 1L;
	
	protected JPanel panelJuego;
	
	protected JLabel imagenJuego;
	protected JLabel labelPuntaje;
	protected JLabel labelVidas;
	protected JLabel labelMonedas;
	
	protected JScrollPane panelScrollJuego;
	
	protected KeyHandler keyHandler;
	
	
	protected Thread hiloMario;
	
	public PantallaJuego() {
		setPreferredSize(new Dimension(ConstantesVistas.PANEL_JUEGO_ANCHO, ConstantesVistas.PANEL_JUEGO_ALTO));
		setLayout(new BorderLayout());
		setFocusable(true);
		requestFocusInWindow();
		
		agregarPanelJuegoConFondoYScroll();
		
	}
	
	public Observer incorporarEntidad(EntidadLogica entidadLogica) {
		ObserverEntidades observerEntidad = new ObserverEntidades(entidadLogica);
		imagenJuego.add(observerEntidad);	
		return observerEntidad;
	}
	
	public Observer incorporarEntidadJugador(EntidadJugador entidad_jugador) {
		ObserverJugador observerJugador = new ObserverJugador(this, entidad_jugador);	
		actualizarInfoJugador(entidad_jugador);
		imagenJuego.add(observerJugador);
		return observerJugador;
	}
	
	public Observer incorporarSilueta(EntidadLogica entidad_logica) {
		ObserverEntidades observerEntidad = new ObserverEntidades(entidad_logica);
		imagenJuego.setIcon(new ImageIcon(getClass().getClassLoader().getResource(entidad_logica.getSprite().getRutaImagen())));
		imagenJuego.setBounds(0,0, imagenJuego.getIcon().getIconWidth(), imagenJuego.getIcon().getIconHeight());
		panelJuego.setPreferredSize(new Dimension(imagenJuego.getIcon().getIconWidth(), imagenJuego.getIcon().getIconHeight()));
		return observerEntidad;
	}	
	
	
	
	protected void agregarPanelJuegoConFondoYScroll() {
		imagenJuego = new JLabel();
		imagenJuego.setLayout(null);
		imagenJuego.setBounds(0,0, ConstantesVistas.PANEL_JUEGO_ANCHO, ConstantesVistas.PANEL_JUEGO_ALTO);
		
		panelJuego = new JPanel(null);
		panelJuego.setPreferredSize(new Dimension(ConstantesVistas.PANEL_JUEGO_ANCHO, ConstantesVistas.PANEL_JUEGO_ALTO));
		panelJuego.add(imagenJuego);
		
		panelScrollJuego = new JScrollPane(panelJuego);
		panelScrollJuego.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panelScrollJuego.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		panelScrollJuego.setBounds(0, 0, ConstantesVistas.PANEL_JUEGO_ANCHO, ConstantesVistas.PANEL_JUEGO_ALTO);
		add(panelScrollJuego, BorderLayout.CENTER);
		
		agregarLabelsConInormacion();
	}
	
	private void agregarLabelsConInormacion() {
		labelPuntaje = new JLabel("000");
		labelVidas = new JLabel("000");
		labelMonedas = new JLabel("000");
		decorarLabelsConInformacion();
		imagenJuego.add(labelPuntaje);
		imagenJuego.add(labelVidas);
		imagenJuego.add(labelMonedas);
	}

	private void decorarLabelsConInformacion() {
		labelPuntaje.setBounds(100, 0, 150, 50);
		labelVidas.setBounds(250, 0, 150, 50);
		labelMonedas.setBounds(400, 0, 150, 50);
		
		labelPuntaje.setForeground(Color.BLACK);
		labelVidas.setForeground(Color.BLACK);
		labelMonedas.setForeground(Color.BLACK);
		
		labelPuntaje.setFont(new Font(labelPuntaje.getFont().getName(), Font.BOLD, 24));
		labelVidas.setFont(new Font(labelPuntaje.getFont().getName(), Font.BOLD, 24));
		labelMonedas.setFont(new Font(labelPuntaje.getFont().getName(), Font.BOLD, 24));
	}

	public void actualizarInfoJugador(EntidadJugador entidad_jugador) {
		actualizarLabelsInformacion(entidad_jugador);
	    actualizarScrollHaciaJugador(entidad_jugador);
	}
	
	private void actualizarLabelsInformacion(EntidadJugador entidad_jugador) {
		labelPuntaje.setText(Integer.toString(entidad_jugador.getPuntaje()));
		labelMonedas.setText(Integer.toString(entidad_jugador.getMonedas()));
		labelVidas.setText(Integer.toString(entidad_jugador.getVidas()));
	}

	public void actualizarScrollHaciaJugador(EntidadJugador jugador) {
		
	}

	public void notificarCambioJugador(EntidadJugador jugadorObservado) {
		actualizarInfoJugador(jugadorObservado);
	}
	
	
}
