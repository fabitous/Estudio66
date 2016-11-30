package br.edu.ifsp.tads.dsw.projeto66.controller;

import br.edu.ifsp.tads.dsw.projeto66.dao.AgendaDAO;
import br.edu.ifsp.tads.dsw.projeto66.dao.ReservaDAO;
import br.edu.ifsp.tads.dsw.projeto66.model.Agenda;
import br.edu.ifsp.tads.dsw.projeto66.model.Ensaio;
import br.edu.ifsp.tads.dsw.projeto66.model.Estudo;
import br.edu.ifsp.tads.dsw.projeto66.model.Gravacao;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgendaController {
    
    @Autowired
    private ReservaDAO reservaDAO;
    
    @Autowired
    private AgendaDAO agendaDAO;
    
    @RequestMapping("opcoes_ensaio")
    public String opcaoEnsaio(String escolha, HttpSession session) {  
        session.setAttribute("escolha", escolha);
        return "reservas/opcoes_ensaio";
    }

    @RequestMapping("opcoes_estudo")
    public String opcaoEstudo(String escolha, HttpSession session) {  
        session.setAttribute("escolha", escolha);
        return "reservas/opcoes_ensaio";
    }
    
    @RequestMapping("opcoes_gravacao")
    public String opcaoGravacao(String escolha, HttpSession session) {  
        session.setAttribute("escolha", escolha);
        return "reservas/opcoes_ensaio";
    }
    
    @RequestMapping("agenda_ensaio")
    public String DispEnsaio(HttpSession session) {  
        List<Agenda> agenda = agendaDAO.DispEnsaio();
        session.setAttribute("agenda", agenda);
        return "reservas/agenda_ensaio";
    }
    
    @RequestMapping("agenda_estudo")
    public String DispEstudo(HttpSession session) {
        List<Agenda> agenda = agendaDAO.DispEstudo();
        session.setAttribute("agenda", agenda);
        return "reservas/agenda_estudo";
    }
    
    @RequestMapping("agenda_gravacao")
    public String DispGravacao(HttpSession session) {
        List<Agenda> agenda = agendaDAO.DispGravacao();
        session.setAttribute("agenda", agenda);
        return "reservas/agenda_gravacao";
    }
    
    @RequestMapping(value="/ensaio", method=RequestMethod.POST)
    public String add(Ensaio reserva) {   
        reservaDAO.addEnsaio(reserva);      
        return "/reservas/ok";
    }
    @RequestMapping(value="/estudo", method=RequestMethod.POST)
    public String add(Estudo reserva) {   
        reservaDAO.addEstudo(reserva);      
        return "/reservas/ok";
    }
    @RequestMapping(value="/gravacao", method=RequestMethod.POST)
    public String add(Gravacao reserva) {   
        reservaDAO.addGravacao(reserva);      
        return "/reservas/ok";
    }
    
    @RequestMapping(value="/agenda", method=RequestMethod.POST)
    public String add(Agenda agenda) {     
        agendaDAO.addAgenda(agenda); 
        return "/adm/ok";
    }
    
}
