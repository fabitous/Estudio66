package br.edu.ifsp.tads.dsw.projeto66.dao;

import br.edu.ifsp.tads.dsw.projeto66.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ClienteDAO {

    private Connection conn;
    private String sqlStmt;
    
    @PersistenceContext
    private EntityManager em;
    
    public ClienteDAO() {
        try {
            this.conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/db66",
                    "adm",
                    "six");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void add(Cliente cliente) {
       em.persist(cliente);
    }

    public boolean findUser(String user, String pass, HttpSession session) {
        try {
            this.sqlStmt = "Select username, password, level from cliente where username like '"+user+"'";

            PreparedStatement stmt = this.conn.prepareStatement(sqlStmt);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.print(rs.getString("password"));
                if (pass.equalsIgnoreCase(rs.getString("password"))) {
                    session.setAttribute("level", rs.getString("level"));
                    return true;
                } else {               
                    return false;              
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
