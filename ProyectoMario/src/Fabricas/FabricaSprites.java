package Fabricas;

public abstract class FabricaSprites {
	protected String rutaACarpeta;
	
	protected FabricaSprites(String rutaACarpeta) {
		this.rutaACarpeta=rutaACarpeta; 
	}
	
	public Sprite getSilueta(int numero) {
		return new Sprite(rutaACarpeta +"/silueta" + numero + ".png");
	}
	
	public Sprite getMario() {
		return new Sprite(rutaACarpeta +"/mario.png");
	}
	
	public Sprite getSuperMario() {
		return new Sprite(rutaACarpeta +"/superMario.png");
	}
	
	public Sprite getBuzzyBeetle() {
		return new Sprite(rutaACarpeta +"/buzzyBeetle.png");
	}
	
	public Sprite getGoomba() {
		return new Sprite(rutaACarpeta +"/goomba.png");
	}
	
	public Sprite getKoopaTroopa() {
		return new Sprite(rutaACarpeta +"/koopaTroopa.png");
	}
	
	public Sprite getLakitu() {
		return new Sprite(rutaACarpeta +"/lakitu.png");
	}
	
	public Sprite getPiranhaPlant() {
		return new Sprite(rutaACarpeta +"/piranhaPlant.png");
	}
	
	public Sprite getSpiny() {
		return new Sprite(rutaACarpeta +"/spiny.png");
	}
	
	public Sprite getBloque() {
		return new Sprite(rutaACarpeta +"/bloque.png");
	}
	
	public Sprite getBloqueDePregunta() {
		return new Sprite(rutaACarpeta +"/bloqueDePregunta.png");
	}
	
	public Sprite getLadrillo() {
		return new Sprite(rutaACarpeta +"/ladrillo.png");
	}
	
	public Sprite getPlataforma() {
		return new Sprite(rutaACarpeta +"/plataforma.png");
	}
	
	public Sprite getTuberia() {
		return new Sprite(rutaACarpeta +"/tuberia.png");
	}
	
	public Sprite getVacio() {
		return new Sprite(rutaACarpeta +"/vacio.png");
	}
	
	public Sprite getChampiñonVerde() {
		return new Sprite(rutaACarpeta +"/champiñonVerde.png");
	}
	
	public Sprite getEstrella() {
		return new Sprite(rutaACarpeta +"/estrella.png");
	}
	
	public Sprite getFlorDeFuego() {
		return new Sprite(rutaACarpeta +"/florDeFuego.png");
	}
	
	public Sprite getMoneda() {
		return new Sprite(rutaACarpeta +"/moneda.png");
	}
	
	public Sprite getSuperChampiñon() {
		return new Sprite(rutaACarpeta +"/superChampiñon.png");
	}
	
	public Sprite getBolaDeFuego() {
		return new Sprite(rutaACarpeta +"/bolaDeFuego.png");
	}
}
