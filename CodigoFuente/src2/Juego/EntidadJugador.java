package Juego;

import KeyHandler.KeyHandler;

public interface EntidadJugador extends EntidadLogica{
	public int getX();
	public int getY();
	public int getVelocidad();
	public KeyHandler getKeyHandler();
	public String getDireccion();
	public void cambiarEstado();
	public void saltar();
	public void moverIzquierda();
	public void moverDerecha();
	public void lanzarBolasDeFuego();
	public void afectar(EntidadLogica e);
	public void serAfectado(EntidadLogica e);
}
