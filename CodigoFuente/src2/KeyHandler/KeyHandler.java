package KeyHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	
	public boolean arribaPresionado, izquierdaPresionado, derechaPresionado, abajoPresionado;

	public void keyTyped(KeyEvent e) {		
	}

	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		
		switch(codigo) {
			case KeyEvent.VK_W: arribaPresionado = true;
			case KeyEvent.VK_S: abajoPresionado = true;
			case KeyEvent.VK_A: izquierdaPresionado = true;
			case KeyEvent.VK_D: derechaPresionado = true;
			
		}
	}

	public void keyReleased(KeyEvent e) {
		int codigo = e.getKeyCode();
		
		switch(codigo) {
			case KeyEvent.VK_W: arribaPresionado = false;
			case KeyEvent.VK_S: abajoPresionado = false;
			case KeyEvent.VK_A: izquierdaPresionado = false;
			case KeyEvent.VK_D: derechaPresionado = false;
			
		}		
	}

}
