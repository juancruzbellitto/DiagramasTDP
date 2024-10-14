package Fabricas;

import Enemigos.*;
import Plataformas.*;
import PowerUps.*;
import Proyectiles.*;

import Juego.Jugador;
import Juego.Silueta;


public class FabricaEntidades {
	
	protected FabricaSprites fabricaSprites;
	
	public FabricaEntidades(FabricaSprites fabricaSprites) {
		this.fabricaSprites = fabricaSprites;
	}

	
	public Silueta getSilueta(int numeroNivel) {
		Sprite siluetaSprite = fabricaSprites.getSilueta(numeroNivel);
		Silueta silueta = new Silueta(siluetaSprite);
		return silueta;
	}
	
	public Jugador getJugador(int x, int y) {
		
		// agregar estados para las sprites
		
		Sprite jugadorSprite = fabricaSprites.getMarioMoviendo();
		Jugador jugador = new Jugador(jugadorSprite,x,y);
		return jugador;
	}
	
	public BuzzyBeetle getBuzzyBeetle(int x, int y) {
		Sprite buzzyBeetleSprite = fabricaSprites.getBuzzyBeetle();
		BuzzyBeetle buzzyBeetle = new BuzzyBeetle(buzzyBeetleSprite, x, y);
		return buzzyBeetle;
	}
	
	public Goomba getGoomba(int x, int y) {
		Sprite goombaSprite = fabricaSprites.getGoomba();
		Goomba goomba = new Goomba(goombaSprite,x , y);
		return goomba;
	}
	
	public KoopaTroopa getKoopaTroopa(int x, int y) {
		Sprite koopaTroopaSprite = fabricaSprites.getKoopaTroopa();
		KoopaTroopa koopaTroopa = new KoopaTroopa(koopaTroopaSprite, x, y);
		return koopaTroopa;
	}
	
	public Lakitu getLakitu(int x, int y) {
		Sprite lakituSprite = fabricaSprites.getLakitu();
		Lakitu lakitu = new Lakitu(lakituSprite, x, y);
		return lakitu;
	}
	
	public PiranhaPlant getPiranhaPlant(int x, int y) {
		Sprite piranhaPlantSprite = fabricaSprites.getPiranhaPlant();
		PiranhaPlant piranhaPlant = new PiranhaPlant(piranhaPlantSprite, x, y);
		return piranhaPlant;
	}
	
	public Spiny getSpiny(int x, int y) {
		Sprite spinySprite = fabricaSprites.getSpiny();
		Spiny spiny = new Spiny(spinySprite, x, y);
		return spiny;
	}
	
	public Bloque getBloque(int x, int y) {
		Sprite bloqueSprite = fabricaSprites.getBloque();
		Bloque bloque = new Bloque(bloqueSprite, x, y);
		return bloque;
	}
	
	public BloqueDePregunta getBloqueDePregunta(int x, int y) {
		Sprite bloqueDePregSprite = fabricaSprites.getBloqueDePregunta();
		BloqueDePregunta bloqueDePreg = new BloqueDePregunta(bloqueDePregSprite, x, y);
		return bloqueDePreg;
	}
	
	public Ladrillo getLadrillo(int x, int y) {
		Sprite ladrilloSprite = fabricaSprites.getLadrillo();
		Ladrillo ladrillo = new Ladrillo(ladrilloSprite, x, y);
		return ladrillo;
	}
	
	public Tuberia getTuberia(int x, int y) {
		Sprite tuberiaSprite = fabricaSprites.getTuberia();
		Tuberia tuberia = new Tuberia(tuberiaSprite, x, y);
		return tuberia;
	}
	
	public ChampiñonVerde getChampiñonVerde(int x, int y) {
		Sprite champiVerdeSprite = fabricaSprites.getChampiñonVerde();
		ChampiñonVerde champiVerde = new ChampiñonVerde(champiVerdeSprite, x, y);
		return champiVerde;
	}
	
	public Estrella getEstrella(int x, int y) {
		Sprite estrellaSprite = fabricaSprites.getEstrella();
		Estrella estrella = new Estrella(estrellaSprite, x, y);
		return estrella;
	}
	
	public FlorDeFuego getFlorDeFuego(int x, int y) {
		Sprite florDeFuegoSprite = fabricaSprites.getFlorDeFuego();
		FlorDeFuego florDeFuego = new FlorDeFuego(florDeFuegoSprite, x, y);
		return florDeFuego;
	}
	
	public Moneda getMoneda(int x, int y) {
		Sprite monedaSprite = fabricaSprites.getMoneda();
		Moneda moneda = new Moneda(monedaSprite, x, y);
		return moneda;
	}
	
	public SuperChampiñon getSuperChampiñon(int x, int y) {
		Sprite superChampiSprite = fabricaSprites.getSuperChampiñon();
		SuperChampiñon superChampi = new SuperChampiñon(superChampiSprite, x, y);
		return superChampi;
	}
	
	public BolaDeFuego getBolaDeFuego(int x, int y) {
		Sprite bolaDeFuegoSprite = fabricaSprites.getBolaDeFuego();
		BolaDeFuego bolaDeFuego = new BolaDeFuego(bolaDeFuegoSprite, x, y);
		return bolaDeFuego;
	}
}
