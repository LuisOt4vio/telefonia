/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia;

import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial.Celular;
import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial.Plano;
import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.Set;

/**
 *
 * @author franc
 */
@Entity
public class Operadora {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    //List - [1, 2, 2, 4]
    //Set - [1, 2, 4]
    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Cliente> clientes;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Celular> celulares;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Plano> planos;
    
    //construtor padrao
    //(é aquele que nao possui parametros)
    public Operadora(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(Set<Celular> celulares) {
        this.celulares = celulares;
    }

    public Set<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(Set<Plano> planos) {
        this.planos = planos;
    }
}
