package modelo;

import java.sql.Date;

public class Mdiasnl {
	private Date dfechnl;
	private String cmotivo;
	private char cstatus;
	private Date dfecins;
	private char cusumod;
	private Date dfecmod;

	public Date getDfechnl() {
		return dfechnl;
	}

	public void setDfechnl(Date dfechnl) {
		this.dfechnl = dfechnl;
	}

	public String getCmotivo() {
		return cmotivo;
	}

	public void setCmotivo(String cmotivo) {
		this.cmotivo = cmotivo;
	}

	public char getCstatus() {
		return cstatus;
	}

	public void setCstatus(char cstatus) {
		this.cstatus = cstatus;
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
