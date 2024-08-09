package com._tdspr.mariabeatriz.usecase.Impl;

import com._tdspr.mariabeatriz.domains.Aluno;
import com._tdspr.mariabeatriz.usecase.CadastrarAluno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CadastrarAlunoImplTest {

    //Como a classe impl está implementando, ela é tambpem a outra
    CadastrarAluno cadastraAluno = new CadastrarAlunoImpl();

    @Test
    @DisplayName("Testa as informações do objeto aluno a ser cadastrado foram corretamente copiadas para um novo objeto")
    void testeExecutaDeCadastrarAluno(){

        //Dado uma condicao, Arrange, Expected
        Aluno alunoParaCadastrar = new Aluno();
        alunoParaCadastrar.setPrimeiroNome("Maria");
        alunoParaCadastrar.setSobrenome("Fogolin");
        //Quando algo acontecer, Act, Actual
        Aluno alunoCadastrado = cadastraAluno.executar(alunoParaCadastrar);

        //Verifique uma determinada info, Asser
        Assertions.assertEquals(alunoParaCadastrar.getPrimeiroNome(), alunoCadastrado.getPrimeiroNome(), "Deve copiar o primeiroNome do objeto 1 para o segundo objeto");
        Assertions.assertEquals(alunoParaCadastrar.getSobrenome(), alunoCadastrado.getSobrenome(), "Deve copiar o Sobrenome do objeto 1 para o segundo objeto");


    }

}