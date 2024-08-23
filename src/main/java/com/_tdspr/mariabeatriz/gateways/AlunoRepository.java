package com._tdspr.mariabeatriz.gateways;

import com._tdspr.mariabeatriz.domains.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}