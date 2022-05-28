package Modelo;

public class PistaMusical 
{
	private String genero;
	private String nomCancion;
	private String nomArtista;
	private int cancion;
	
	public PistaMusical(String genero, String nomCancion, String nomArtista, int cancion) {
		super();
		this.genero = genero;
		this.nomCancion = nomCancion;
		this.nomArtista = nomArtista;
		this.cancion = cancion;
	}
	
	

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNomCancion() {
		return nomCancion;
	}

	public void setNomCancion(String nomCancion) {
		this.nomCancion = nomCancion;
	}

	public String getNomArtista() {
		return nomArtista;
	}

	public void setNomArtista(String nomArtista) {
		this.nomArtista = nomArtista;
	}

	public int getCancion() {
		return cancion;
	}

	public void setCancion(int cancion) {
		this.cancion = cancion;
	}
	
	
	public String toString() {
		return "\nGenero: " + genero
			+  "\nNombre Cancion: " + nomCancion
			+  "\nNombre Artista: " + nomArtista
			+  "\nCancion: " + cancion;
	}

	
}
