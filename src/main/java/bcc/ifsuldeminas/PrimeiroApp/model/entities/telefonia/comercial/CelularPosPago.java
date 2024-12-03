/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 *
 * @author franc
 */
@Entity
@DiscriminatorValue(value = "CelularPosPago")
public class CelularPosPago extends Celular{
    private int diaDeVencimento;
    
    public CelularPosPago(){
        
    }

    public int getDiaDeVencimento() {
        return diaDeVencimento;
    }

    public void setDiaDeVencimento(int diaDeVencimento) {
        this.diaDeVencimento = diaDeVencimento;
    }
}
