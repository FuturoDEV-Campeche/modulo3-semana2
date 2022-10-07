package br.com.futurodev.modulo3semana2.controller;

import br.com.futurodev.modulo3semana2.model.Aluno;
import br.com.futurodev.modulo3semana2.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public String get() {
        return "Get de alunos";
    }

    @PostMapping
    public Aluno post(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

}
