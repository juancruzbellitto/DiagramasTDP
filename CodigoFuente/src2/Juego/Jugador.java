package Juego;

import Fabricas.Sprite;
import Grafica.Observer;
import KeyHandler.KeyHandler;

public class Jugador implements EntidadJugador{
	
	protected Sprite sprite;
	protected int x;
	protected int y;
	protected int velocidad;
	protected Observer observer;
	
	protected String direccion;
	
	protected KeyHandler keyHandler = new KeyHandler();
	
	private static final int VELOCIDAD_JUGADOR_DEFAULT = 4;
	
	public Jugador(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		this.velocidad = VELOCIDAD_JUGADOR_DEFAULT;
		
		this.direccion = "derecha";
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
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public KeyHandler getKeyHandler() {
		return keyHandler;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
