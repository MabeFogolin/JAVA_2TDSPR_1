package com._tdspr.mariabeatriz.gateways;

import com._tdspr.mariabeatriz.domains.Aluno;
import com._tdspr.mariabeatriz.gateways.requests.AlunoPatchNome;
import com._tdspr.mariabeatriz.gateways.requests.AlunoPostRequests;
import com._tdspr.mariabeatriz.gateways.responses.AlunoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/fiap")
    public ResponseEntity<String> getAlunoss() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/fiap/{alunoId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> getAlunos(@PathVariable String alunoId) {
        return ResponseEntity.ok("Hello World o id é " + alunoId);
    }

    @PostMapping("/fiap")
    public ResponseEntity<AlunoResponse> postAluno(@RequestBody AlunoPostRequests aluno) {
        Aluno alunoAtualizado = new Aluno(aluno.primeiroNome(), aluno.sobrenome(), aluno.documento(), aluno.registro(), aluno.rm());

        AlunoResponse alunoResponse = AlunoResponse.builder()
                        .primeiroNome(alunoAtualizado.getPrimeiroNome())
                                .sobrenome(alunoAtualizado.getSobrenome())
                                        .documento(alunoAtualizado.getDocumento())
                                                .build();

        return ResponseEntity.ok(alunoResponse);
    }

    @PatchMapping("/{alunoRm}/nome")
    public ResponseEntity<AlunoResponse> atualizaNome(@PathVariable String alunoRm, @RequestBody AlunoPatchNome nome){

    }

}
