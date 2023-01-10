package br.com.spedison.ver_08.stream;

import java.io.Serializable;

public class Endereco implements Serializable {
    private static final long serialVersionUID = 2L;

    private int numero;
    private String descricao;

    public Endereco(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "numero=" + numero +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
