package Juego;

public interface EntidadJugador extends EntidadLogica{
	public void cambiarEstado();
	public void saltar();
	public void moverIzquierda();
	public void moverDerecha();
	public void lanzarBolasDeFuego();
	public void afectar(EntidadLogica e);
	public void serAfectado(EntidadLogica e);
}
