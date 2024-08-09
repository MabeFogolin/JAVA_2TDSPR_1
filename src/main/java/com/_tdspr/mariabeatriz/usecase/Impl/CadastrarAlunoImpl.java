package com._tdspr.mariabeatriz.usecase.Impl;

import com._tdspr.mariabeatriz.domains.Aluno;
import com._tdspr.mariabeatriz.usecase.CadastrarAluno;

public class CadastrarAlunoImpl implements CadastrarAluno {
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
