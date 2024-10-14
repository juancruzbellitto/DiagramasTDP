package Grafica;

import Juego.EntidadJugador;
import Paneles.PantallaJuego;

public class ObserverJugador extends ObserverGrafico{

	private static final long serialVersionUID = 7017967195998406908L;
	private PantallaJuego pantallaJuego;
	private EntidadJugador jugadorObservado;
	
	public ObserverJugador(PantallaJuego pantallaJuego, EntidadJugador jugadorObservado) {
		super(jugadorObservado);
		this.pantallaJuego = pantallaJuego;
		
		actualizar();
	}
	
	public void actualizar() {		
		super.actualizar();
		pantallaJuego.actualizarScrollHaciaJugador(jugadorObservado);
	}
}
