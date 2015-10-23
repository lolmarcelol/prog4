
package br.pucpr.prog4.lojaoldschool.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Modelo {
      
    @Id
    @GeneratedValue()
    
    private long id;
    private String nome;
    private int anoCriacao;
    
}
