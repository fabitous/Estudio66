package br.edu.ifsp.tads.dsw.projeto66.dao;

import br.edu.ifsp.tads.dsw.projeto66.model.Ensaio;
import br.edu.ifsp.tads.dsw.projeto66.model.Estudo;
import br.edu.ifsp.tads.dsw.projeto66.model.Gravacao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ReservaDAO {
    
    @PersistenceContext
    private EntityManager em;
    
    public void addEnsaio(Ensaio reserva) {
       em.persist(reserva);
    }
    public void addEstudo(Estudo reserva) {
       em.persist(reserva);
    }
    public void addGravacao(Gravacao reserva) {
       em.persist(reserva);
    }
}
