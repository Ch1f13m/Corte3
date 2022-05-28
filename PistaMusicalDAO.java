package Modelo;

import java.util.ArrayList;


public class PistaMusicalDAO 
{
	public PistaMusicalDAO() {
		
	}
	
	// CRUD
	public String verPista(ArrayList<PistaMusical> datos) {
		ArrayList<PistaMusical> pista = datos;
		String texto = "";
		for (int i = 0; i < pista.size(); i++) {
			texto = texto.concat(pista.get(i) + "\n");
		}
		return texto;
	}

	public PistaMusical buscarPista(String nomCancion, ArrayList<PistaMusical> pista) {
		PistaMusical encontrado = null;
		
		if (!pista.isEmpty()) {
			for (int i = 0; i < pista.size(); i++) {
				if (pista.get(i).getNomCancion().equals(nomCancion)) {
					encontrado = pista.get(i);
				}
			}
		}
		
		return encontrado;
	}

	public boolean agregarPista(String genero,String nomCancion, String nomArtista,int cancion, ArrayList<PistaMusical> pista) {

		PistaMusical nuevo = new PistaMusical(genero,nomCancion, nomArtista,cancion);

		if (buscarPista(nomCancion, pista) == null) {
			pista.add(nuevo);
			return true;
		} else {
			return false;
		}

	}

	public boolean eliminarPista(String nomCancion, ArrayList<PistaMusical> pista) {
		boolean resp=false;
		PistaMusical e = buscarPista(nomCancion, pista);
		if(e!=null) {
			pista.remove(e);
			resp= true;
		}
		return resp;
	}
	
	public boolean modificarPista(String genero,String nomCancion, String nomArtista,int cancion, ArrayList<PistaMusical> pista) {
		boolean resp=false;
		PistaMusical e = buscarPista(nomCancion, pista);
		if(e!=null) {
			pista.remove(e);
			e.setNomCancion(nomCancion);
			e.setGenero(genero);
			e.setCancion(cancion);
			e.setNomArtista(nomArtista);
			pista.add(e);
			resp= true;
		}
		return resp;
	}
	
}
