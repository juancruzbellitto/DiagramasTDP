package Grafica;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import Juego.EntidadJugador;

public class ObserverJugador extends ObserverGrafico{

	private static final long serialVersionUID = 7017967195998406908L;
	private PantallaJuego pantallaJuego;
	private EntidadJugador jugadorObservado;
	
	protected int jugadorX, jugadorY, velocidadJugador;
	protected String direccionJugador;
	
	public ObserverJugador(PantallaJuego pantallaJuego, EntidadJugador jugadorObservado) {
		super(jugadorObservado);
		this.pantallaJuego = pantallaJuego;
		this.jugadorObservado = jugadorObservado;
		
		this.jugadorX = jugadorObservado.getX();
		this.jugadorY = jugadorObservado.getY();
		this.velocidadJugador = jugadorObservado.getVelocidad();
		this.direccionJugador = jugadorObservado.getDireccion();
		
		actualizar();
	}
	
	public void actualizar() {
		//super.actualizar();
		//pantallaJuego.actualizarScrollHaciaJugador(jugadorObservado);
		update();
	}
	
	private void update() {
		if(jugadorObservado.getKeyHandler().arribaPresionado) {
			direccionJugador = "derecha";
			jugadorY -= velocidadJugador;
		}
		else if(jugadorObservado.getKeyHandler().izquierdaPresionado) {
			direccionJugador = "derecha";
			jugadorX -= velocidadJugador;
		}
		else if(jugadorObservado.getKeyHandler().derechaPresionado) {
			direccionJugador = "derecha";
			jugadorY += velocidadJugador;
		}
	}
	
	private void paintComponent(Graphics graficos) {
		pantallaJuego.paintComponent(graficos);
		
	}
	
	private void draw(Graphics2D graficos) {
		
		BufferedImage imagen = null;
		
		switch(direccionJugador) {
		
		case "arriba": 
		case "izquierda": 
		case "derecha": 
		}
	}
}
