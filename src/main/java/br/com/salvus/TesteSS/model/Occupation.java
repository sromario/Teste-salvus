package br.com.salvus.TesteSS.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@Entity
@NoArgsConstructor
public class Occupation implements Serializable {
    public Occupation(String profissao, Long numeroRegistro) {
        this.profissao = profissao;
        this.numeroRegistro = numeroRegistro;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String profissao;
    private Long numeroRegistro;
}