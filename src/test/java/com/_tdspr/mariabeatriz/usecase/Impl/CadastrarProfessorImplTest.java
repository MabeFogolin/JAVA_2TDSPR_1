package com._tdspr.mariabeatriz.usecase.Impl;

import com._tdspr.mariabeatriz.domains.Professor;
import com._tdspr.mariabeatriz.usecase.CadastrarProfessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarProfessorImplTest {

    CadastrarProfessor cadastrarProfessor = new CadastrarProfessorImpl();

    @Test
    @DisplayName("Testa as informações do objeto aluno a ser cadastrado foram corretamente copiadas para um novo objeto")
    void testeExecutaDeCadastrarProfessor() {

        //Dado uma condicao, Arrange, Expected
        Professor professorParaCadastrar = new Professor();
        professorParaCadastrar.setPrimeiroNome("Maria");
        //Quando algo acontecer, Act, Actual
        Professor professorCadastrado = cadastrarProfessor.executar(professorParaCadastrar);
        //Verifique uma determinada info, Asser
        Assertions.assertEquals(professorParaCadastrar.getPrimeiroNome(), professorCadastrado.getPrimeiroNome(), "Deve copiar o primeiroNome do objeto 1 para o segundo objeto");

    }
}