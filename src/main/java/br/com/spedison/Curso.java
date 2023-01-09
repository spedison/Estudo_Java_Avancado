package br.com.spedison;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    List<Aluno> listaAlunos;

    public Curso(String nome) {
        this.nome = nome;
        listaAlunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
