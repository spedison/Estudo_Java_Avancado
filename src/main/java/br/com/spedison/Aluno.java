package br.com.spedison;

import java.util.Optional;

public class Aluno {
    String nome;
    Optional<Matricula> matricula;

    public Aluno() {
    }

    public Aluno(String nome, Optional<Matricula> matricula) {
        this.nome = nome;
        this.matricula = matricula;;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Optional<Matricula> getMatricula() {
        return matricula;
    }

    public void setMatricula(Optional<Matricula> matricula) {
        this.matricula = matricula;
    }
}
