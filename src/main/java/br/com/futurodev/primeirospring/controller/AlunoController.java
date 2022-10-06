package br.com.futurodev.primeirospring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @GetMapping
    public String getAluno() {
        return "Get de aluno";
    }

    @PostMapping
    public String postAluno(String nome) {
        return "Post de aluno \n - " + nome;
    }

    @PutMapping
    public String putAluno() {
        return "Put de aluno";
    }

    @DeleteMapping
    public String deleteAluno() {
        return "Delete de aluno";
    }

}
