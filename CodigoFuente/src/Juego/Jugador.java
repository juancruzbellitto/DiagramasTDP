package Juego;

import Fabricas.Sprite;
import Grafica.Observer;
import Grafica.ObserverJugador;
import KeyHandler.KeyHandler;

public class Jugador implements EntidadJugador{
	
	protected Sprite sprite;
	protected int x;
	protected int y;
	protected int velocidad;
	protected int puntaje;
	protected int vidas;
	protected int monedas;
	protected Observer observer;
	
	
	
	protected int direccion;
	
	private static final int VELOCIDAD_JUGADOR_DEFAULT = 2;
	
	public Jugador(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		this.velocidad = VELOCIDAD_JUGADOR_DEFAULT;
		
		this.vidas = 3;
		this.puntaje = 0;
		this.monedas = 0;

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
	
	public int getDireccion() {
		return this.direccion;
	}
	
	public int getPuntaje() {
		return this.puntaje;
	}
	
	public int getMonedas() {
		return this.monedas;
	}
	
	public int getVidas() {
		return this.vidas;
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
	
	public void setDireccionQuieto() {
		direccion = 0;
	}
	
	public void setDireccionDerecha() {
		direccion = 1;
	}
	
	public void setDireccionIzquierda() {
		direccion = -1;
	}
	
	public void registrarObserver(Observer observer) {
		this.observer=observer;
	}

	public void moverIzquierda() {
		x -= velocidad;
		
		setDireccionIzquierda();
		
		if(observer != null) {
			observer.actualizar();
		}
	}

	public void moverDerecha() {
		x += velocidad;
		
		setDireccionDerecha();
		
		if(observer != null) {
			observer.actualizar();
		}
	}

	@Override
	public void cambiarEstado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lanzarBolasDeFuego() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectar(EntidadLogica e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serAfectado(EntidadLogica e) {
		// TODO Auto-generated method stub
		
	}

	public void moverseHorizontalmente() {
		x = x + (velocidad * direccion);
	}
}
