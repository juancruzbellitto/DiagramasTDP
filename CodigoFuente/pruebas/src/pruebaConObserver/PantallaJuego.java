package pruebaConObserver;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class PantallaJuego extends JPanel{

	private static final long serialVersionUID = 1L;
	protected JPanel panelJuego;
	protected JLabel imagenJuego;
	protected JScrollPane panelScrollJuego;
	
	public PantallaJuego() {
		setPreferredSize(new Dimension(1000, 298));
		setBackground(Color.black);
		setLayout(new BorderLayout());
		agregarPanelJuegoConFondoYScroll();
		
	}

	private void agregarPanelJuegoConFondoYScroll() {
		imagenJuego = new JLabel();
		imagenJuego.setLayout(null);
		imagenJuego.setBounds(0,0, 1000, 298);
		
		panelJuego = new JPanel(null);
		panelJuego.setBackground(Color.black);
		panelJuego.setPreferredSize(new Dimension(1000, 298));
		panelJuego.add(imagenJuego);
		
		panelScrollJuego = new JScrollPane(panelJuego);
		panelScrollJuego.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panelScrollJuego.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		panelScrollJuego.setBounds(0, 0, 1000, 298);
			
		add(panelScrollJuego, BorderLayout.CENTER);
	}
	
	public Observer incorporarEntidadJugador(Jugador entidad_jugador) {
		ObserverJugador observerJugador = new ObserverJugador(this, entidad_jugador);		
		imagenJuego.add(observerJugador);
		//actualizar_info_jugador(entidad_jugador);
		HiloJugador hiloJugador = new HiloJugador();
		hiloJugador.iniciarHiloMario(entidad_jugador);
		return observerJugador;
	}
	
	public void paintComponent(Graphics graficos) {
		
		super.paintComponent(graficos);
		
		Graphics2D graficos2D = (Graphics2D) graficos;
		
		graficos2D.setColor(Color.white);
		
		graficos2D.fillRect(100, 100, 48, 48);
		
		graficos2D.dispose();
	}
}
