
package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idpais;
    private String estado;
    private String capital;
    private int poblacion;
    private int costas;

    public Estado() {
    }

    
    
    public Estado(String estado, String capital, int poblacion, int costas) {
        this.estado = estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
    
    
}
