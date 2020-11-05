package modelo;

import java.sql.Date;

public class Pregasi {
	private char ccveemp;
	private int cnumbio;
	private char cstatus;
	private char cusuins;
	private Date dfecins;
	private char cusumod;
	private Date dfecmod;

	public char getCcveemp() {
		return ccveemp;
	}

	public void setCcveemp(char ccveemp) {
		this.ccveemp = ccveemp;
	}

	public int getCnumbio() {
		return cnumbio;
	}

	public void setCnumbio(int cnumbio) {
		this.cnumbio = cnumbio;
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
