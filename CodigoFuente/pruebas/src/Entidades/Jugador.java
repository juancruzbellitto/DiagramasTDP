package Entidades;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.KeyHandler;
import main.PanelJuego;

public class Jugador extends Entidad{
	
	protected PanelJuego panelJuego;
	protected KeyHandler keyHandler;
	
	public Jugador(PanelJuego panelJuego, KeyHandler keyHandler) {
		this.panelJuego = panelJuego;
		this.keyHandler = keyHandler;

		
		setValoresDefault();
		getImagenJugador();
	}
	
	public void setValoresDefault() {
		x = 100;
		y = 100;
		velocidad = 4;
		direccion = "derecha";
	}
	
	public void getImagenJugador() {
		try {
			marioInmovilDerecha = ImageIO.read(getClass().getResourceAsStream("/jugador/marioInmovil.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		if(keyHandler.arribaPresionado) {
			direccion = "derecha";
			y -= velocidad;
		}
		else if (keyHandler.abajoPresionado) {
			direccion = "derecha";
			y += velocidad;
		}
		else if(keyHandler.izquierdaPresionado) {
			direccion = "derecha";
			x -= velocidad;
		}
		else if(keyHandler.derechaPresionado) {
			direccion = "derecha";
			x += velocidad;
		}
	}
	
	public void draw(Graphics2D graficos2D) {
//		graficos2D.setColor(Color.white);
//		graficos2D.fillRect(x, y, PanelJuego.TAMANO_CALCULADO_ENTIDAD, PanelJuego.TAMANO_CALCULADO_ENTIDAD);
		
		BufferedImage imagen = null;
		switch(direccion) {
		case "derecha": imagen = marioInmovilDerecha;
		}
		
		graficos2D.drawImage(imagen, x, y, PanelJuego.TAMANO_CALCULADO_ENTIDAD, PanelJuego.TAMANO_CALCULADO_ENTIDAD, null);
	}
}
