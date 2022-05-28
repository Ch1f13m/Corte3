package Modelo;

import java.util.ArrayList;


public class EmisoraDTO 
{
	private String nombreEm;
	private String mTransmicion;
	private String tipoMusica;
	
	private ArrayList<PistaMusical> pista;
	private PistaMusicalDAO pistaDAO;
	
	public String getNombreEm() {
		return nombreEm;
	}
	public void setNombreEm(String nombreEm) {
		this.nombreEm = nombreEm;
	}
	public String getmTransmicion() {
		return mTransmicion;
	}
	public void setmTransmicion(String mTransmicion) {
		this.mTransmicion = mTransmicion;
	}
	public String getTipoMusica() {
		return tipoMusica;
	}
	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}
	public ArrayList<PistaMusical> getPista() {
		return pista;
	}
	public void setPista(ArrayList<PistaMusical> pista) {
		this.pista = pista;
	}
	public PistaMusicalDAO getPistaDAO() {
		return pistaDAO;
	}
	public void setPistaDAO(PistaMusicalDAO pistaDAO) {
		this.pistaDAO = pistaDAO;
	}
	

}
