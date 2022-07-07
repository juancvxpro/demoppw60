package ec.edu.ups.ppw.demoppw60.model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ticket implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="codigo")
	private int codigo;	
	@Column(name="fechaIngreso")
	private String fechaIngreso;
	@Column(name="fechaSalida")
	private String fechaSalida;
	@Column(name="Total")
	private double Total;



	//	onetoone trae datos de forma automatica el eager viene por defecto en el onetoone 
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="placa_vehiculo")
	private Vehiculo vehiculo;

	
	/**
	 *cuando tenemos dos onotomany solo uno tiene que ser de tipo eager y los otros tenemos que hacer de forma forsoza la recuperacion de datos.
	 *el cascade se usa en el one tu many 
	 *Onetomany trae datos de forma retardada pero se le debe de agregar el fetch para decirle
	 */	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="id_ticket")
	private List<Servicio> servicios;
	


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public List<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	@Override
	public String toString() {
		return "Ticket [codigo=" + codigo + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida
				+ ", Total=" + Total + ", vehiculo=" + vehiculo + ", servicios=" + servicios + "]";
	}
	
	

	
}
