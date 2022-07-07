package ec.edu.ups.ppw.demoppw60.services;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import ec.edu.ups.ppw.demoppw60.model.Servicio;
import ec.edu.ups.ppw.demoppw60.model.Vehiculo;

@Entity
public class TicketTemp implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigo;	
	private String fechaIngreso;
	private String fechaSalida;
	private double Total;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String string) {
		this.fechaIngreso = string;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida =fechaSalida;
	}
	
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	@Override
	public String toString() {
		return "TicketTemp2 [codigo=" + codigo + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida
				+ ", Total=" + Total + "]";
	}
	
	
}
