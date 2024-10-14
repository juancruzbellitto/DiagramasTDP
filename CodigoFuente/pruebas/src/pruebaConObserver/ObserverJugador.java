package pruebaConObserver;


public class ObserverJugador extends ObserverGrafico{
	private static final long serialVersionUID = 7017967195998406908L;
	private PantallaJuego pantallaJuego;
	private Jugador jugadorObservado;
	
	protected KeyHandler manejadorTeclas = new KeyHandler();
	
	protected int jugadorX;
	protected int jugadorY;
	protected int velocidadJugador;
	
	public ObserverJugador(PantallaJuego pantallaJuego, Jugador jugadorObservado) {
		super(jugadorObservado);
		this.pantallaJuego = pantallaJuego;
		this.jugadorObservado = jugadorObservado;
		
		this.jugadorX = jugadorObservado.getX();
		this.jugadorY = jugadorObservado.getY();
		this.velocidadJugador = jugadorObservado.getVelocidad();
		
		actualizar();
	}
	
	public void actualizar() {
		super.actualizar();
		actualizarPosicionJugador();
		//pantallaJuego.actualizarScrollHaciaJugador(jugadorObservado);
	}
	
	protected void actualizarPosicionJugador() {
		if(manejadorTeclas.abajoPresionado) {
			jugadorY -= velocidadJugador;
		}
		else if(manejadorTeclas.izquierdaPresionado) {
			jugadorX -= velocidadJugador;
		}
		else if(manejadorTeclas.derechaPresionado) {
			jugadorX += velocidadJugador;
		}
	}
}
