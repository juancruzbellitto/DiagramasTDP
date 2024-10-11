package Juego;

import java.util.LinkedList;
import java.util.List;

import Enemigos.*;
import PowerUps.*;
import Plataformas.*;

import Fabricas.FabricaSprites;
import Fabricas.FabricaSpritesModo1;


public class Nivel {

	protected List<Enemigo> listaEnemigos;
	protected List<PowerUp> listaPowerUps;
	protected List<Plataforma> listaPlataformas;
	protected Jugador jugador;
	
	protected FabricaSprites fabricaSprites;
	
	
	public Nivel() {
		this.listaEnemigos = new LinkedList<Enemigo>();
		this.listaPowerUps = new LinkedList<PowerUp>();
		this.listaPlataformas = new LinkedList<Plataforma>();
		
		this.fabricaSprites = new FabricaSpritesModo1();
	}
	
	public Jugador getJugador() {
		return this.jugador;
	}
	
	public List<Enemigo> getListaEnemigos() {
		return this.listaEnemigos;
	}
	
	public List<PowerUp> getListaPowerUps() {
		return this.listaPowerUps;
	}
	
	public List<Plataforma> getListaPlataforma() {
		return this.listaPlataformas;
	}
	
	public void agregarJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public void agregarEnemigo(Enemigo enemigo) {
		listaEnemigos.addLast(enemigo);
	}
	
	public void agregarPowerUp(PowerUp powerUp) {
		listaPowerUps.addLast(powerUp);
	}
	
	public void agregarPlataforma(Plataforma plataforma) {
		listaPlataformas.addLast(plataforma);
	}
	
	public void agregarEntidad(int idEntidad, int posX, int posY) {
			
		switch(idEntidad) {
			case 2: agregarEnemigo(new Goomba(fabricaSprites.getGoomba(), posX, posY));
			case 3: agregarEnemigo(new KoopaTroopa(fabricaSprites.getKoopaTroopa(), posX, posY));
			case 4: agregarEnemigo(new BuzzyBeetle(fabricaSprites.getBuzzyBeetle(), posX, posY));
			case 5: agregarEnemigo(new Lakitu(fabricaSprites.getLakitu(), posX, posY));
			case 7: agregarEnemigo(new PiranhaPlant(fabricaSprites.getPiranhaPlant(), posX, posY));
			case 8: agregarEnemigo(new Spiny(fabricaSprites.getSpiny(), posX, posY));
			
			case 9: agregarPlataforma(new Bloque(fabricaSprites.getBloque(), posX, posY));
			case 10: agregarPlataforma(new BloqueDePregunta(fabricaSprites.getBloqueDePregunta(), posX, posY));
			case 11: agregarPlataforma(new Ladrillo(fabricaSprites.getLadrillo(), posX, posY));
			case 12: agregarPlataforma(new Tuberia(fabricaSprites.getTuberia(), posX, posY));
			case 13: agregarPlataforma(new Vacio(fabricaSprites.getVacio(), posX, posY));
			
			case 14: agregarPowerUp(new ChampiñonVerde(fabricaSprites.getChampiñonVerde(), posX, posY));
			case 15: agregarPowerUp(new Estrella(fabricaSprites.getEstrella(), posX, posY));
			case 16: agregarPowerUp(new FlorDeFuego(fabricaSprites.getFlorDeFuego(), posX, posY));
			case 17: agregarPowerUp(new Moneda(fabricaSprites.getMoneda(), posX, posY));
			case 18: agregarPowerUp(new SuperChampiñon(fabricaSprites.getSuperChampiñon(), posX, posY));
		}
	}
}
