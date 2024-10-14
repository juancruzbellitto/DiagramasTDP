package Juego;


public class MoverMario extends Thread{
	
	protected Juego juego;
	
	public MoverMario(Juego juego) {
		this.juego=juego;
	}
	
	public void run() {
		while(true) {
						try {
								Thread.sleep(10);
								juego.getNivelActual().getJugador().mover();
							} catch (InterruptedException e) {
									e.printStackTrace();
						}

					}

		}
}

