package com._tdspr.mariabeatriz.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor extends Pessoa {

    private String disciplina;


}
