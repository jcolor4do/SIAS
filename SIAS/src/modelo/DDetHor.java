package modelo;

import java.sql.Date;

//Date detalle horario
public class DDetHor {
	// id horario
	private int nidhora;
//dia de la semana 
	private int ndiasem;
//hora entrada
	private char chrent;
//hora salida
	private char status;
	private char cusuins;
	private Date dfecins;
	private char cusumod;
	private Date dfecmod;

	public int getNidhora() {
		return nidhora;
	}

	public void setNidhora(int nidhora) {
		this.nidhora = nidhora;
	}

	public int getNdiasem() {
		return ndiasem;
	}

	public void setNdiasem(int ndiasem) {
		this.ndiasem = ndiasem;
	}

	public char getChrent() {
		return chrent;
	}

	public void setChrent(char chrent) {
		this.chrent = chrent;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public char getCusuins() {
		return cusuins;
	}

	public void setCusuins(char cusuins) {
		this.cusuins = cusuins;
	}

	public Date getDfecins() {
		return dfecins;
	}

	public void setDfecins(Date dfecins) {
		this.dfecins = dfecins;
	}

	public char getCusumod() {
		return cusumod;
	}

	public void setCusumod(char cusumod) {
		this.cusumod = cusumod;
	}

	public Date getDfecmod() {
		return dfecmod;
	}

	public void setDfecmod(Date dfecmod) {
		this.dfecmod = dfecmod;
	}

}
