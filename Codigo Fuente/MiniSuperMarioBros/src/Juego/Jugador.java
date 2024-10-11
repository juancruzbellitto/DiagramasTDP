package Juego;

import Sprites.Sprite;
import Vistas.Observer;

public class Jugador extends Entidad implements EntidadJugador {
	
	protected int vidas;
	/*protected Estado estado;*/
	protected Usuario usuario;
	protected Observer observer;
	
	public Jugador(Sprite sprite, int x, int y) {
		super(sprite, x, y);
	}
	

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void registrarObserver(Observer obs) {
		this.observer = obs;
	}
	
}
