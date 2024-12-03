/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial;

import jakarta.persistence.*;

import java.util.Date;

/**
 *
 * @author franc
 */
@Entity
public class Ligacao {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private int duracao;
    
    public Ligacao(){
        
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
