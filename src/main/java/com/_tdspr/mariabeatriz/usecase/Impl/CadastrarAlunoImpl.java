package com._tdspr.mariabeatriz.usecase.Impl;

import com._tdspr.mariabeatriz.domains.Aluno;
import com._tdspr.mariabeatriz.gateways.AlunoRepository;
import com._tdspr.mariabeatriz.usecase.CadastrarAluno;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*@Component*/
@Service //o service indica regra de negócio
@RequiredArgsConstructor
public class CadastrarAlunoImpl implements CadastrarAluno {

    private final AlunoRepository alunoRepository;

    @Override
    public Aluno executar(Aluno alunoParaCadastrar) {

        Aluno alunoCadastrado = new Aluno();

        alunoCadastrado.setPrimeiroNome(alunoParaCadastrar.getPrimeiroNome());
        alunoCadastrado.setSobrenome(alunoParaCadastrar.getSobrenome());
        alunoCadastrado.setRegistro(alunoParaCadastrar.getRegistro());
        alunoCadastrado.setDocumento(alunoParaCadastrar.getDocumento());

        return alunoCadastrado;
    }
}
