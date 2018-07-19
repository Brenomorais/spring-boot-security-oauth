package com.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.model.Aluno;

public interface Alunos extends JpaRepository<Aluno, Long>{

}
