package Juego;

import Fabricas.Sprite;
import Grafica.Observer;

public class Jugador implements EntidadJugador{
	
	protected Sprite sprite;
	protected int x;
	protected int y;
	protected int velX;
	protected Observer observer;
	
	public Jugador(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}

	public Sprite getSprite() {
		return sprite;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setVelX(int VelocidadX) {
		this.velX=VelocidadX;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void registrarObserver(Observer observer) {
		this.observer=observer;
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
