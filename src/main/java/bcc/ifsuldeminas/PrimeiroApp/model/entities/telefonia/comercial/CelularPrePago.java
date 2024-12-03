/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

/**
 *
 * @author franc
 */
@Entity
@DiscriminatorValue(value="CelularPrePago")
public class CelularPrePago extends Celular{
    private double saldo;
    @Temporal(TemporalType.DATE)
    private Date dataDeValidade;
    
    public CelularPrePago(){
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
