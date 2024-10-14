package pruebaConObserver;



public class HiloJugador implements Runnable{
	
	protected Thread hiloJugador;
	
	protected Jugador jugador;
	protected int jugadorX;
	protected int jugadorY;
	protected int velocidadJugador;
	
	protected ObserverJugador observerJugador;
	
	protected static final int FPS = 60;
	
	public HiloJugador() {
		hiloJugador = new Thread(this);
	}
	
	public void iniciarHiloMario(Jugador jugador) {
		this.jugador = jugador;
		this.jugadorX = jugador.getX();
		this.jugadorY = jugador.getY();
		this.velocidadJugador = jugador.getVelocidad();
		
		hiloJugador.run();
	}

	public void run() {
		
		double intervaloDeDibujo = 1000000000 / FPS;
		double siguienteDibujo = System.nanoTime() + intervaloDeDibujo;
		
		while(hiloJugador != null) {
			
			observerJugador.actualizar();
			
			try {
				double tiempoRestante = siguienteDibujo - System.nanoTime();
				tiempoRestante = tiempoRestante / 1000000;
				
				if(tiempoRestante < 0) {
					tiempoRestante = 0;
				}
				
				Thread.sleep((long) tiempoRestante);
				
				siguienteDibujo += intervaloDeDibujo;
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
//	public void update() {
//		
//		if(manejadorTeclas.abajoPresionado) {
//			jugadorY -= velocidadJugador;
//		}
//		else if(manejadorTeclas.izquierdaPresionado) {
//			jugadorX -= velocidadJugador;
//		}
//		else if(manejadorTeclas.derechaPresionado) {
//			jugadorX += velocidadJugador;
//		}
//	}
}