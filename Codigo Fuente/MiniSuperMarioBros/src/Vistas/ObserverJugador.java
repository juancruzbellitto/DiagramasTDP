package Vistas;

import Juego.EntidadJugador;

public class ObserverJugador extends ObserverGrafico{
	
	private PantallaJuego pantallaJuego;
	private EntidadJugador jugadorObservado;
	
	public ObserverJugador(PantallaJuego pantallaJuego, EntidadJugador jugadorObservado) {
		super(jugadorObservado);
		this.pantallaJuego = pantallaJuego;
		this.jugadorObservado = jugadorObservado;
		actualizar();
	}
	
	
	public void actualizar() {
		super.actualizar();
		pantallaJuego.actualizarScrollHaciaJugador(jugadorObservado);
	}

}
