package Juego;

import Sprites.Sprite;
import Vistas.Observer;

public abstract class Entidad implements EntidadLogica{
	
	protected Sprite sprite;
	protected int x;
	protected int y;
	protected Observer observer;
	
	protected Entidad(Sprite sprite, int x, int y) {
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
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void registrarObserver(Observer obs) {
		this.observer = obs;
	}
	

}
