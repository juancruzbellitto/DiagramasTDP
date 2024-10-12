package Fabricas;

public abstract class FabricaSprites {
	protected String rutaACarpeta;
	
	protected FabricaSprites(String rutaACarpeta) {
		this.rutaACarpeta=rutaACarpeta; 
	}
	
	public Sprite getSilueta(int numero) {
		return new Sprite(rutaACarpeta +"/silueta" + numero + ".png");
	}
	
	public Sprite getMarioInmovil() {
		return new Sprite(rutaACarpeta +"/marioInmovil.png");
	}
	
	public Sprite getMarioMoviendo() {
		return new Sprite(rutaACarpeta +"/marioMoviendose.gif");
	}
	
	public Sprite getMarioSaltando() {
		return new Sprite(rutaACarpeta +"/marioSaltando.png");
	}
	
	public Sprite getSuperMarioInmovil() {
		return new Sprite(rutaACarpeta +"/superMarioInmovil.png");
	}
	
	public Sprite getSuperMarioMoviendo() {
		return new Sprite(rutaACarpeta +"/superMarioMoviendose.gif");
	}
	
	public Sprite getSuperMarioSaltando() {
		return new Sprite(rutaACarpeta +"/superMarioSaltando.png");  
	}
	
	public Sprite getSuperMarioBolaDeFuegoInmovil() {
		return new Sprite(rutaACarpeta +"/marioBolaDeFuegoInmovil.png");
	}
	
	public Sprite getSuperMarioBolaDeFuegoMoviendo() {
		return new Sprite(rutaACarpeta +"/marioBolaDeFuegoMoviendose.gif");
	}
	
	public Sprite getSuperMarioBolaDeFuegoSaltando() {
		return new Sprite(rutaACarpeta +"/marioBolaDeFuegoSaltando.png");
	}
	
	public Sprite getSuperMarioInvencibleInmovil() {
		return new Sprite(rutaACarpeta +"/marioInvencibleInmovil.gif");
	}
	
	public Sprite getBuzzyBeetle() {
		return new Sprite(rutaACarpeta +"/buzzyBeetle.gif");
	}
	
	public Sprite getGoomba() {
		return new Sprite(rutaACarpeta +"/goomba.gif");
	}
	
	public Sprite getKoopaTroopa() {
		return new Sprite(rutaACarpeta +"/koopaTroopa.gif");
	}
	
	public Sprite getLakitu() {
		return new Sprite(rutaACarpeta +"/lakitu.gif");
	}
	
	public Sprite getPiranhaPlant() {
		return new Sprite(rutaACarpeta +"/piranhaPlant.gif");
	}
	
	public Sprite getSpiny() {
		return new Sprite(rutaACarpeta +"/spiny.gif");
	}
	
	public Sprite getBloque() {
		return new Sprite(rutaACarpeta +"/bloque.png");
	}
	
	public Sprite getBloqueDePregunta() {
		return new Sprite(rutaACarpeta +"/bloqueDePregunta.gif");
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
		return new Sprite(rutaACarpeta +"/estrella.gif");
	}
	
	public Sprite getFlorDeFuego() {
		return new Sprite(rutaACarpeta +"/florDeFuego.gif");
	}
	
	public Sprite getMoneda() {
		return new Sprite(rutaACarpeta +"/moneda.gif");
	}
	
	public Sprite getSuperChampiñon() {
		return new Sprite(rutaACarpeta +"/superChampiñon.png");
	}
	
	public Sprite getBolaDeFuego() {
		return new Sprite(rutaACarpeta +"/bolaDeFuego.gif");
	}
	
	public Sprite getBolaDeFuegoHit() {
		return new Sprite(rutaACarpeta +"/bolaDeFuegoHit.gif");
	}
}
