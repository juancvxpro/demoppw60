package ec.edu.ups.ppw.demoppw60.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ppw.demoppw60.model.Servicio;

@Stateless
public class ServicioDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Servicio servicio ) {
//		
		em.persist(servicio);
	}

	public void update(Servicio servicio ) {
		em.merge(servicio);
	}
	
	public Servicio read(String codigo) {
		Servicio servicio = em.find(Servicio.class, codigo);
		return servicio;
	}
	
	public Servicio delete(String codigo) {
		em.remove(this.read(codigo));		
		return null;	
	}
	
	public List<Servicio> list(){
		String jpql = "SELECT s FROM Servicio s";
//		Query query = em.createNamedQuery(jpql, servicio.class);
		Query query = em.createQuery(jpql, Servicio.class);
		return query.getResultList();
	}

}
