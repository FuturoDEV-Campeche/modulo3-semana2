package br.com.futurodev.modulo3semana2.service;

import br.com.futurodev.modulo3semana2.model.Aluno;
import br.com.futurodev.modulo3semana2.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

}
