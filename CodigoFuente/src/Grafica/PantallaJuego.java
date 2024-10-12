package Grafica;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Juego.EntidadJugador;
import Juego.EntidadLogica;

public class PantallaJuego extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JPanel panelJuego;
	protected JLabel imagenJuego;
	protected JScrollPane panelScrollJuego;
	
	public PantallaJuego() {
		setPreferredSize(new Dimension(ConstantesVistas.PANEL_JUEGO_ANCHO, ConstantesVistas.PANEL_JUEGO_ALTO));
		setLayout(new BorderLayout());
		agregarPanelJuegoConFondoYScroll();
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
	}
	
	public Observer incorporarEntidad(EntidadLogica entidadLogica) {
		ObserverEntidades observerEntidad = new ObserverEntidades(entidadLogica);
		imagenJuego.add(observerEntidad);	
		return observerEntidad;
	}
	
	public Observer incorporarEntidadJugador(EntidadJugador entidad_jugador) {
		ObserverJugador observerJugador = new ObserverJugador(this, entidad_jugador);
		imagenJuego.add(observerJugador);
		//actualizar_info_jugador(entidad_jugador);
		return observerJugador;
	}
	
	public Observer incorporarSilueta(EntidadLogica entidad_logica) {
		ObserverEntidades observerEntidad = new ObserverEntidades(entidad_logica);
		imagenJuego.setIcon(new ImageIcon(getClass().getClassLoader().getResource(entidad_logica.getSprite().getRutaImagen())));
		imagenJuego.setBounds(0,0, imagenJuego.getIcon().getIconWidth(), imagenJuego.getIcon().getIconHeight());
		panelJuego.setPreferredSize(new Dimension(imagenJuego.getIcon().getIconWidth(), imagenJuego.getIcon().getIconHeight()));
		return observerEntidad;
	}
		
}
