package Juego;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MoverMario extends KeyAdapter implements Runnable {
	protected Jugador mario;
	protected boolean moverDerecha = false;  
    protected boolean moverIzquierda = false;
    
    public MoverMario(Jugador j) {
    	this.mario=j;
    }
	
	public void teclaPresionada(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            moverIzquierda = true; 
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            moverDerecha = true; 
        }
    }
	
	public void teclaSoltada(KeyEvent e) { 
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            moverIzquierda = false; 
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            moverDerecha = false; 
        }
    }
	
	public void run() {
		while (true) {
            if (moverIzquierda) {
                mario.moverIzquierda();
            }
            if (moverDerecha) {
                mario.moverDerecha();    
            }
     

            try {
                Thread.sleep(20);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
	}

}
