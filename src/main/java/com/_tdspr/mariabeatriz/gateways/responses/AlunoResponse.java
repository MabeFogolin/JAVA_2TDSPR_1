package com._tdspr.mariabeatriz.gateways.responses;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AlunoResponse {

    private String primeiroNome;
    private String sobrenome;
    private String documento;
    private String registro;
}
