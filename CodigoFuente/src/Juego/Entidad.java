package Juego;

import Fabricas.Sprite;
import Grafica.Observer;
import Visitor.*;

public abstract class Entidad implements EntidadVisitable, EntidadLogica{
	protected int x;
	protected int y;
	protected Sprite sprite;
	Observer observer;
	
	protected Entidad(Sprite sprite, int x, int y) {
		this.x=x;
		this.y=y;
		this.sprite=sprite;
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
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void registrarObserver(Observer observer) {
		this.observer=observer;
	}
	
	public void accept(Visitor v) {
		// to do
	}
	
}
