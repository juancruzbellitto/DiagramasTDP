package Juego;

import Fabricas.Sprite;
import Grafica.Observer;
import Grafica.ObserverJugador;
import KeyHandler.KeyHandler;

public interface EntidadJugador extends EntidadLogica{
<<<<<<< HEAD
	public Sprite getSprite();
	public int getX();
	public int getY();
	public int getVelocidad();
	public int getDireccion();
	public void setVelocidad(int velocidad);
	public void setX(int x);
	public void setY(int y);
	public void setDireccionQuieto();
	public void setDireccionDerecha();
	public void setDireccionIzquierda();
	public void registrarObserver(Observer observer);
	public void moverIzquierda();
	public void moverDerecha();
	public void saltar();
	public void cambiarEstado();
	public void lanzarBolasDeFuego();
	public void afectar(EntidadLogica e);
	public void serAfectado(EntidadLogica e);
	public void moverseHorizontalmente();
	public int getPuntaje();
	public int getVidas();
	public int getMonedas();
=======
	public void cambiarEstado();
	public void saltar();
	public void mover();
	public void lanzarBolasDeFuego();
	public void afectar(EntidadLogica e);
	public void serAfectado(EntidadLogica e);
	public void setDireccion(int n);
>>>>>>> ec553c65807c2556bb3679fc73ca09ab269ff1b3
}
