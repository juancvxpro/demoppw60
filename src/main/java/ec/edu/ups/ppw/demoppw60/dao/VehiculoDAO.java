package ec.edu.ups.ppw.demoppw60.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ppw.demoppw60.model.Vehiculo;

@Stateless
public class VehiculoDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Vehiculo vehiculo ) {
		em.persist(vehiculo);
	}

	public void update(Vehiculo vehiculo ) {
		em.merge(vehiculo);
	}
	
	public Vehiculo read(String placa) {
		Vehiculo vehiculo = em.find(Vehiculo.class, placa);
		return vehiculo;
	}
	
	public Vehiculo delete(String placa  ) {
		em.remove(this.read(placa));		
		return null;	
	}
	
	public List<Vehiculo> list(){
		String jpql = "SELECT v FROM Vehiculo v";
//		Query query = em.createNamedQuery(jpql, Vehiculo.class);
		Query query = em.createQuery(jpql, Vehiculo.class);
		return query.getResultList();
	}
}
