
package br.edu.ifsp.tads.dsw.projeto66.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudo {

    private Long ID;
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
    private String reserva;
    private String pessoas;
    private String amplificadores;
    private String microfones;
    private String cafe;
    private String cliente;

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public String getPessoas() {
        return pessoas;
    }

    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }

    public String getAmplificadores() {
        return amplificadores;
    }

    public void setAmplificadores(String amplificadores) {
        this.amplificadores = amplificadores;
    }

    public String getMicrofones() {
        return microfones;
    }

    public void setMicrofones(String microfones) {
        this.microfones = microfones;
    }

    public String getCafe() {
        return cafe;
    }

    public void setCafe(String cafe) {
        this.cafe = cafe;
    }   

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}
