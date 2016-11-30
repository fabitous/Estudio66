package br.edu.ifsp.tads.dsw.projeto66.controller;

import br.edu.ifsp.tads.dsw.projeto66.dao.ClienteDAO;
import br.edu.ifsp.tads.dsw.projeto66.model.Cliente;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @Autowired
    private ClienteDAO clienteDAO;
    
    @RequestMapping("/")
    public String index() {
        return "redirect:welcome";
    }
    
    @RequestMapping("welcome")
    public String welcome() {
        return "home";
    }
    
    @RequestMapping("login")
    public String login() {
        return "adm/login";
    }
    
    @RequestMapping("logar")
    public String logar(String username, String password, HttpSession session) {  
        session.setMaxInactiveInterval(360);
        if(clienteDAO.findUser(username, password, session)) {
            session.setAttribute("usuariologado", username);
            return "redirect:welcome";
        } else {
           session.setAttribute("mensagem", "senha inválida");
           return "redirect:login";            
        }
    }
    
    @RequestMapping("reservas")
    public String reserva() {
        return "reservas/salas";
    }
    
    @RequestMapping("agenda")
    public String agenda() {
        return "adm/form";
    }
    
    @RequestMapping("sorry")
    public String sorry() {
        return "adm/sorry";
    }
    
    @RequestMapping("logue")
    public String logue() {
        return "adm/logue";
    }
    
}
