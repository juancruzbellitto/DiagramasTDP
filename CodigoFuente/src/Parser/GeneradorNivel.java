package Parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import Fabricas.FabricaEntidades;
import Juego.Nivel;

public class GeneradorNivel {
	
	protected File archivo;
	protected FabricaEntidades fabricaEntidades;
	
	public static final int ESPACIO_ENTIDAD = 0;
	public static final int ESPACIO_POSICION_X = 1;
	public static final int ESPACIO_POSICION_Y = 2;
	
	
	public GeneradorNivel(FabricaEntidades fabricaEntidades) {
		this.fabricaEntidades = fabricaEntidades;
		archivo = new File("formateoNiveles.txt");
	}
	
	public Nivel generarNivel() {
		Nivel nivel = new Nivel();
		
		List<char []> listaDeDatos = leerDatosNivel(archivo);
		
		for(char[] arregloDeDatosNivel : listaDeDatos) {
			nivel.agregarEntidad(arregloDeDatosNivel[ESPACIO_ENTIDAD], arregloDeDatosNivel[ESPACIO_POSICION_X], arregloDeDatosNivel[ESPACIO_POSICION_Y]);
		}
		
		return nivel;
	}
	
	public List<char []> leerDatosNivel(File archivo) {
		
		String datosNivel;
		char[] arregloDeDatos = new char [3];
		List<char []> listaDeArreglosDeDatos = new LinkedList<char []>();
		int posArreglo = 0;
		
		try {
			FileReader lector = new FileReader(archivo);
			BufferedReader lectura = new BufferedReader(lector);
			
			datosNivel = lectura.readLine();
			
			while(datosNivel != null) {
				for(int i = 0; i < datosNivel.length(); i++) {
					if(datosNivel.charAt(i) != ' ') {
						arregloDeDatos[posArreglo] = datosNivel.charAt(i);
						posArreglo++;
					}
					
					listaDeArreglosDeDatos.add(arregloDeDatos);
					posArreglo = 0;
				}
			}
			
		} catch (IOException exception){
			exception.printStackTrace();
		}
		
		return listaDeArreglosDeDatos;
	}
	
	
}
