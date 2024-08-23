package com._tdspr.mariabeatriz.usecase;

import com._tdspr.mariabeatriz.domains.Aluno;
import org.springframework.stereotype.Service;

@Service
public interface CadastrarAluno {

    Aluno executa(Aluno alunoParaSerCadastrar);
}