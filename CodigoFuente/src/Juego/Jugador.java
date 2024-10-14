package Juego;

import Fabricas.Sprite;
import Grafica.Observer;

public class Jugador implements EntidadJugador{
	
	protected Sprite sprite;
	protected int x;
	protected int y;
	protected Observer observer;
	protected int direccion;
	protected int velX;
	
	public Jugador(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		direccion=0;
		velX=1;
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
	
	public int getVelX() {
		return velX;
	}
	
	public int getDireccion() {
		return direccion;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void registrarObserver(Observer observer) {
		this.observer=observer;
	}
	
	public void mover() {
		if(direccion==1) {
			x = x + velX;
			observer.actualizar();
		}
		else {
			if(direccion==2) {
				x = x - velX;
				observer.actualizar();
			}
		}
	}

	public void cambiarEstado() {
		
	}

	public void saltar() {
		
	}

	public void lanzarBolasDeFuego() {
		
	}

	public void afectar(EntidadLogica e) {
		
	}

	public void serAfectado(EntidadLogica e) {
		
	}
	
}
