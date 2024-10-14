package KeyHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Juego.EntidadJugador;
import Juego.Jugador;

public class KeyHandler implements KeyListener {
    protected Jugador jugador;

    public KeyHandler(EntidadJugador jugador) {
        this.jugador = (Jugador) jugador;
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    	int codigo = e.getKeyCode();
    	
    	if(codigo == KeyEvent.VK_W) {
    		jugador.saltar();
    	}
    	
    	if(codigo == KeyEvent.VK_A) {
    		jugador.setDireccionIzquierda();
    	}
    	
    	if(codigo == KeyEvent.VK_D) {
    		jugador.setDireccionDerecha();
    	}
    }

    public void keyReleased(KeyEvent e) {
    	int codigo = e.getKeyCode();
    	
    	if(codigo == KeyEvent.VK_W) {
    		jugador.setDireccionQuieto();
    	}
    	
    	if(codigo == KeyEvent.VK_A) {
    		jugador.setDireccionQuieto();
    	}
    	
    	if(codigo == KeyEvent.VK_D) {
    		jugador.setDireccionQuieto();
    	}	
    }
}