package pruebaConObserver;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ObserverGrafico extends JLabel implements Observer{


	private static final long serialVersionUID = 1L;
	private Jugador jugadorObservado;
	
	protected ObserverGrafico(Jugador jugadorObservado) {
		super();
		this.jugadorObservado = jugadorObservado;
	}

	public void actualizar() {
		actualizarImagen();
		actualizarPosicionTamano();
	}
	
	protected void actualizarImagen() {
		String rutaImagen = jugadorObservado.getSprite().getRutaImagen();
		ImageIcon icono = new ImageIcon(getClass().getClassLoader().getResource(rutaImagen));
		setIcon(icono);
	}
	
	protected void actualizarPosicionTamano() {
		int x = AdaptadorPosicionPixel.transformarX(jugadorObservado.getX());
		int y = AdaptadorPosicionPixel.transformarY(jugadorObservado.getY());
		int ancho = this.getIcon().getIconWidth();
		int alto = this.getIcon().getIconHeight();
		setBounds(x, y, ancho, alto);
	}
	
	
}
