package Juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import Grafica.ObserverJugador;
import Grafica.PantallaJuego;
import KeyHandler.KeyHandler;

public class HiloMario implements Runnable{
	
	protected Thread hiloMario;
	
	protected KeyHandler manejadorTeclas = new KeyHandler();
	
	protected EntidadJugador jugador;
	protected int jugadorX;
	protected int jugadorY;
	protected int velocidadJugador;
	
	protected ObserverJugador observerJugador;
	protected PantallaJuego pantallaJuego;
	
	protected static final int FPS = 60;
	
	public void iniciarHiloMario(PantallaJuego pantallaJuego, EntidadJugador jugador) {
		this.jugador = jugador;
		this.jugadorX = jugador.getX();
		this.jugadorY = jugador.getY();
		this.velocidadJugador = jugador.getVelocidad();
		this.pantallaJuego = pantallaJuego;
		
		hiloMario = new Thread(this);
		hiloMario.run();
	}

	public void run() {
		
		double intervaloDeDibujo = 1000000000 / FPS;
		double siguienteDibujo = System.nanoTime() + intervaloDeDibujo;
		
		while(hiloMario != null) {
			
			update();
			//repaint();
			
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
	
	public void update() {
		observerJugador.actualizar();
	}
	
	public void paintComponent(Graphics graficos) {
		
	}
}
