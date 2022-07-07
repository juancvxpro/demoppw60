package ec.edu.ups.ppw.demoppw60.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ppw.demoppw60.model.Servicio;
import ec.edu.ups.ppw.demoppw60.model.Ticket;

@Stateless
public class TicketDAO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
//	Sirve para llevar a la BD no le podemos instanciar ni crear aparte solo necesitamos gestionar del mismo servidor. 
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Ticket ticket ) {
		em.persist(ticket);
		
	}

	public void update(Ticket ticket) {
		em.merge(ticket);
	}

	public Ticket read(int codigo) {
//		solo podemos pasar la clave primaria. 
		Ticket ticket = em.find(Ticket.class, codigo);
//		ticket.getVehiculo().getPlaca();
//		ticket.getServicios().size();
		ticket.getVehiculo();
		ticket.getServicios();
		return ticket;
	}

	public Ticket delete(int codigo) {
		em.remove(this.read(codigo));
		return null;
	}
	

	public List<Ticket> list(){
		String jpql = "SELECT t FROM Ticket t";		
		Query query = em.createQuery(jpql, Ticket.class);
		return query.getResultList();
	}
	
//	public List<Servicio> list1(){
//		String jpql = "SELECT s FROM Servicio s";
////		Query query = em.createNamedQuery(jpql, Ticket.class);
//		Query query = em.createQuery(jpql, Ticket.class);
//		return query.getResultList();
//	}

}
