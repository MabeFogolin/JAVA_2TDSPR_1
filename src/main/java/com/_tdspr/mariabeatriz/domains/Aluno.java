package com._tdspr.mariabeatriz.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluno extends Pessoa{

    @Id
    @GeneratedValue
    private String registro;

    private String rm;

    public Aluno(String primeiroNome, String sobrenome, String documento, String registro, String rm) {
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
        this.rm = rm;
    }


    public Aluno(String primeiroNome, String sobrenome, String documento, String registro){
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
    }
}