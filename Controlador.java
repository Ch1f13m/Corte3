package Controlador;

import Modelo.EmisoraDTO;
import Vista.VistaConsola;

public class Controlador {
	private EmisoraDTO emisora;
	private VistaConsola vista;
	
	public Controlador() {
		emisora = new EmisoraDTO();
		vista = new VistaConsola();
		funcionar();
	}
	
	public void funcionar() {
		
		String aux_g = vista.leerDato("Ingrese el genero de la cancion: ");
		String aux_nc = vista.leerDato("Ingrese el nombre de la cancion: ");
		String aux_na = vista.leerDato("Ingrese el nombre del artista: ");
		int aux_c = vista.leerDatoEntero("Ingrese numero de cancion: ");
		
		
		emisora.getPistaDAO().agregarPista(aux_g, aux_nc,aux_na,aux_c, emisora.getPista());
		
		vista.mostrarInformacion(emisora.getPistaDAO().verPista(emisora.getPista()));
		/*
		if(emisora.getPistaDAO().eliminarPista("Danger", veterinaria.getMascotas())) {
			vista.mostrarInformación(veterinaria.getMascotaDAO().verMascotas(veterinaria.getMascotas()));
		}else {
			vista.mostrarInformacion("Las mascota no se encuentra en la BD");
		}
		
		if(veterinaria.getMascotaDAO().modificarMascota("Juliana", "Tigre" , veterinaria.getMascotas())) {
			vista.mostrarInformación(veterinaria.getMascotaDAO().verMascotas(veterinaria.getMascotas()));
		}else {
			vista.mostrarInformacion("Las mascota no se encuentra en la BD");
		}
		*/
	}

}
