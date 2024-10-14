package Grafica;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import Juego.EntidadJugador;
import Juego.EntidadLogica;

public class PantallaJuego extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JPanel panelJuego;
	protected JLabel imagenJuego;
	protected JScrollPane panelScrollJuego;
	
	public PantallaJuego() {
		setPreferredSize(new Dimension(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_ALTO));
		setLayout(new BorderLayout());
		setFocusable(true);
		agregarPanelJuegoConFondoYScroll();
	}

	protected void agregarPanelJuegoConFondoYScroll() {
		
		imagenJuego = new JLabel();
		imagenJuego.setLayout(null);
		imagenJuego.setBounds(0,0, ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_JUEGO_ALTO);

		
		panelJuego = new JPanel(null);
		panelJuego.setPreferredSize(new Dimension(ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_JUEGO_ALTO));
		panelJuego.add(imagenJuego);
		
		panelScrollJuego = new JScrollPane(panelJuego);
		panelScrollJuego.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panelScrollJuego.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		panelScrollJuego.setBounds(0, 0, ConstantesVistas.PANEL_ANCHO, ConstantesVistas.PANEL_JUEGO_ALTO);
			
		add(panelScrollJuego, BorderLayout.CENTER);
	}
	
	public void actualizarScrollHaciaJugador(EntidadJugador entidadJugador) {
		
		JScrollBar horizontalScrollBar = panelScrollJuego.getHorizontalScrollBar();
		
		int jugadorX = entidadJugador.getX();
        int ventanaAncho = panelScrollJuego.getViewport().getWidth();

        int posicionScroll = jugadorX - (ventanaAncho / 2);
        horizontalScrollBar.setValue(Math.max(0, posicionScroll));

	}
	
	public Observer incorporarEntidad(EntidadLogica entidadLogica) {
		ObserverEntidades observerEntidad = new ObserverEntidades(entidadLogica);
		imagenJuego.add(observerEntidad);	
		return observerEntidad;
	}
	
	public Observer incorporarEntidadJugador(EntidadJugador entidadJugador) {
		ObserverJugador observerJugador = new ObserverJugador(this, entidadJugador);
		imagenJuego.add(observerJugador);
		return observerJugador;
	}
	
	public Observer incorporarSilueta(EntidadLogica entidadLogica) {
		
		/*double ratio = (double) 3584 / 240;
		int nuevaAltura = 550;
		int nuevoAncho = (int) (nuevaAltura * ratio);
		
		ObserverEntidades observerEntidad = new ObserverEntidades(entidadLogica);
		
		ImageIcon iconoImagen = new ImageIcon(getClass().getClassLoader().getResource(entidadLogica.getSprite().getRutaImagen()));
		Image imagenEscalada = iconoImagen.getImage().getScaledInstance(nuevoAncho, nuevaAltura, Image.SCALE_SMOOTH);
		Icon iconoImagenEscalado = new ImageIcon(imagenEscalada);
		imagenJuego.setIcon(iconoImagenEscalado);
		
		imagenJuego.setBounds(0,0,imagenJuego.getIcon().getIconWidth(),imagenJuego.getIcon().getIconHeight());
		panelJuego.setPreferredSize(new Dimension(imagenJuego.getIcon().getIconWidth(),imagenJuego.getIcon().getIconHeight()));*/
		
		ObserverEntidades observerEntidad = new ObserverEntidades(entidadLogica);
		imagenJuego.setIcon(new ImageIcon(getClass().getClassLoader().getResource(entidadLogica.getSprite().getRutaImagen())));
		imagenJuego.setBounds(0,0, imagenJuego.getIcon().getIconWidth(), imagenJuego.getIcon().getIconHeight());
		panelJuego.setPreferredSize(new Dimension(imagenJuego.getIcon().getIconWidth(), imagenJuego.getIcon().getIconHeight()));
		
		return observerEntidad;
	}
		
}
