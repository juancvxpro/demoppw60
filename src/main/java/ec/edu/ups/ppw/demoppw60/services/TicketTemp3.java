package ec.edu.ups.ppw.demoppw60.services;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class TicketTemp3 {

	@Id
	@GeneratedValue
	private int codigo;	
	private Date fechaIngreso;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "TicketTemp [codigo=" + codigo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
}
