/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial;

import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.Set;

/**
 *
 * @author franc
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "classe")
public class Celular {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private long numero;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Plano plano;
    @OneToMany
    @JoinColumn(name="celular_id")
    private Set<Ligacao> ligacoes;
    
    public Celular(){
        
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Set<Ligacao> getLigacoes() {
        return ligacoes;
    }

    public void setLigacoes(Set<Ligacao> ligacoes) {
        this.ligacoes = ligacoes;
    }
}
