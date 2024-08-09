package com._tdspr.mariabeatriz.usecase.Impl;

import com._tdspr.mariabeatriz.domains.Professor;
import com._tdspr.mariabeatriz.usecase.CadastrarProfessor;

public class CadastrarProfessorImpl implements CadastrarProfessor {
    @Override
    public Professor executar(Professor professorParaCadastrar) {
        Professor professorCadastrado = new Professor();

        professorCadastrado.setPrimeiroNome(professorParaCadastrar.getPrimeiroNome());
        professorCadastrado.setSobrenome(professorParaCadastrar.getSobrenome());
        professorCadastrado.setDocumento(professorParaCadastrar.getDocumento());
        professorCadastrado.setDisciplina(professorParaCadastrar.getDisciplina());

        return professorCadastrado;

    }
}
