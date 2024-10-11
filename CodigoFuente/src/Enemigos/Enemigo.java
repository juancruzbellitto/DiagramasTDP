package Enemigos;

import Fabricas.Sprite;
import Juego.Entidad;

public abstract class Enemigo extends Entidad{

	public Enemigo(Sprite sprite, int x, int y) {
		super(sprite, x, y);
	}
}
