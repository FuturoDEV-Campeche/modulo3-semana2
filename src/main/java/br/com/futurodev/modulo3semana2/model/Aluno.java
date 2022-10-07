package br.com.futurodev.modulo3semana2.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Aluno {

    private Integer id;
    private String nome;
    private String sobrenome;

}
