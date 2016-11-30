package br.edu.ifsp.tads.dsw.projeto66.controller;

import br.edu.ifsp.tads.dsw.projeto66.dao.ClienteDAO;
import br.edu.ifsp.tads.dsw.projeto66.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ClienteController {
    
    @Autowired
    private ClienteDAO pessoaDAO;
    
    @RequestMapping("cadastro")
    public String cadastro() {
        return "cadastro/form";
    }
    
    @RequestMapping(value="/cadastro", method=RequestMethod.POST)
    public String add(Cliente cliente) {
        cliente.setLevel("usr");
        pessoaDAO.add(cliente);      
        return "/cadastro/ok";
    }
}
