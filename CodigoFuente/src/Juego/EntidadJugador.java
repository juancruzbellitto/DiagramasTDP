package Juego;

public interface EntidadJugador extends EntidadLogica{
	public void cambiarEstado();
	public void saltar();
	public void mover();
	public void lanzarBolasDeFuego();
	public void afectar(EntidadLogica e);
	public void serAfectado(EntidadLogica e);
	public void setDireccion(int n);
}
