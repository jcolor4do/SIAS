package modelo;

import java.sql.Date;

public class Cjusasi {
	private int nidtoju;
	private String cdesjus;
	private char cstatus;
	private char cusuins;
	private Date dfecins;
	private char cusumod;
	private Date dfecmod;
	public int getNidtoju() {
		return nidtoju;
	}
	public void setNidtoju(int nidtoju) {
		this.nidtoju = nidtoju;
	}
	public String getCdesjus() {
		return cdesjus;
	}
	public void setCdesjus(String cdesjus) {
		this.cdesjus = cdesjus;
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
