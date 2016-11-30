package br.edu.ifsp.tads.dsw.projeto66.dao;

import br.edu.ifsp.tads.dsw.projeto66.model.Agenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class AgendaDAO {

    private Connection conn;
    private String sqlStmt;
    
    @PersistenceContext
    private EntityManager em;
    
    public AgendaDAO() {
        try {
            this.conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/db66",
                    "adm",
                    "six");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addAgenda(Agenda agenda) {
       em.persist(agenda);
    }

    public List<Agenda> DispEnsaio() {
        List<Agenda> list = new ArrayList<>();
        try {
            System.out.print("tentou");
            this.sqlStmt = "Select dia, horario from Agenda where sala like 'en'";
            PreparedStatement stmt = this.conn.prepareStatement(sqlStmt);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Agenda a = new Agenda();
                a.setDia(rs.getString("dia"));
                System.out.print(rs.getString("dia"));
                a.setHorario(rs.getString("horario"));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<Agenda> DispEstudo() {
        List<Agenda> list = new ArrayList<>();
        try {
            System.out.print("tentou");
            this.sqlStmt = "Select dia, horario from Agenda where sala like 'es'";
            PreparedStatement stmt = this.conn.prepareStatement(sqlStmt);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Agenda a = new Agenda();
                a.setDia(rs.getString("dia"));
                System.out.print(rs.getString("dia"));
                a.setHorario(rs.getString("horario"));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<Agenda> DispGravacao() {
        List<Agenda> list = new ArrayList<>();
        try {
            System.out.print("tentou");
            this.sqlStmt = "Select dia, horario from Agenda where sala like 'gr'";
            PreparedStatement stmt = this.conn.prepareStatement(sqlStmt);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Agenda a = new Agenda();
                a.setDia(rs.getString("dia"));
                System.out.print(rs.getString("dia"));
                a.setHorario(rs.getString("horario"));
                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
