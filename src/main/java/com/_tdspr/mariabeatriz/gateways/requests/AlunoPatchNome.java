package com._tdspr.mariabeatriz.gateways.requests;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AlunoPatchNome {

    @NotEmpty
    private String primeiroNome;
    private String sobrenome;
}