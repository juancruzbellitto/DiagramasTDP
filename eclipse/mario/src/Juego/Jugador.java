package Juego;

import Fabricas.Sprite;

public class Jugador implements EntidadJugador{
	
	protected Sprite sprite;
	protected int x;
	protected int y;
	
	public Jugador(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}

	public Sprite getSprite() {
		return null;
	}

	public int getX() {
		return 0;
	}

	public int getY() {
		return 0;
	}

	public void cambiarEstado() {
		
	}

	public void saltar() {
		
	}

	public void moverIzquierda() {
		
	}

	public void moverDerecha() {
		
	}

	public void lanzarBolasDeFuego() {
		
	}

	public void afectar(EntidadLogica e) {
		
	}

	public void serAfectado(EntidadLogica e) {
		
	}
	
}
