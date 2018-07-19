package com.api.rest.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.model.Aluno;
import com.api.rest.repository.Alunos;

@RestController
@RequestMapping("/alunos")
public class AlunosResource {
	
	@Autowired
	private Alunos alunos;
	
	@GetMapping
	public List<Aluno> listar(){
		return this.alunos.findAll();
	}

}
