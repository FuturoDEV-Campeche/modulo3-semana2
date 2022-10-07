package br.com.futurodev.modulo3semana2.repository;

import br.com.futurodev.modulo3semana2.model.Aluno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlunoRepository {

    private static int indice = 1;
    private static List<Aluno> alunos = new ArrayList<>();

    public Aluno save(Aluno aluno) {
        if (aluno.getId() == null) {
            aluno.setId(gerarId());
            alunos.add(aluno);
        }
        return aluno;
    }

    private int gerarId() {
        return indice++;
    }

}
