package com._tdspr.mariabeatriz.gateways;

import com._tdspr.mariabeatriz.domains.Aluno;
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
    public ResponseEntity<String> getAlunos(@PathVariable String alunoId) {
        return ResponseEntity.ok("Hello World o id é " + alunoId);
    }

    @PostMapping("/fiap")
    public ResponseEntity<Aluno> postAluno(@RequestBody Aluno aluno) {
        Aluno alunoAtualizado = new Aluno();
        alunoAtualizado.setRm("123456");
        alunoAtualizado.setRegistro(aluno.getRegistro());
        return ResponseEntity.ok(alunoAtualizado);
    }

}
