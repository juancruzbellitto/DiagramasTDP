package Hilos;

import Juego.Jugador;

public class HiloMario extends Thread{
	protected Jugador jugador;
	
	public HiloMario(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public void run() {
		while(true) {
			
			try {
				sleep(17);
				jugador.moverseHorizontalmente();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
