package pruebaConObserver;

public class Jugador{
	
	protected Sprite sprite;
	protected int x;
	protected int y;
	protected int velocidad;
	protected Observer observer;
	
	private static final int VELOCIDAD_JUGADOR_DEFAULT = 4;
	
	public Jugador(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		this.velocidad = VELOCIDAD_JUGADOR_DEFAULT;
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
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
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
}