package com._tdspr.mariabeatriz.domains;

import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno extends Pessoa{
    private String registro;
    private String rm;

    public Aluno(String primeiroNome, String sobrenome, String documento, String registro, String rm) {
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
        this.rm = rm;
    }

}