package modelo;

import java.sql.Date;

public class Chorars {
	private int nidhora;
	private String cdeschr;
	private char cstatus;
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

	public String getCdeschr() {
		return cdeschr;
	}

	public void setCdeschr(String cdeschr) {
		this.cdeschr = cdeschr;
	}

	public char getCstatus() {
		return cstatus;
	}

	public void setCstatus(char cstatus) {
		this.cstatus = cstatus;
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
