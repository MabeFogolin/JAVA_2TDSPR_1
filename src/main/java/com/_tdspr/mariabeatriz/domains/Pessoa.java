package com._tdspr.mariabeatriz.domains;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private String primeiroNome;
    private String sobrenome;
    private String documento;

//    public Pessoa(String primeiroNome, String sobrenome, String documento) {
//        this.primeiroNome = primeiroNome;
//        this.sobrenome = sobrenome;
//        this.documento = documento;
//    }
//
//    public Pessoa() {
//    }
}
