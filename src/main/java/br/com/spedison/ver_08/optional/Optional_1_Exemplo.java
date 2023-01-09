package br.com.spedison.ver_08.optional;

import br.com.spedison.Aluno;
import br.com.spedison.Curso;
import br.com.spedison.Matricula;

import java.util.Optional;

public class Optional_1_Exemplo {
    public static void main(String[] args) {

        Curso cursoAdm = new Curso("Administração");
        Aluno jose = new Aluno("José", Optional.of(new Matricula("112233")));
        cursoAdm.getListaAlunos().add(jose);

        Aluno maria = new Aluno("Maria", Optional.of(new Matricula("223344")));
        cursoAdm.getListaAlunos().add(maria);

        Aluno ana = new Aluno("Ana", Optional.empty()); // Sem matrícula
        cursoAdm.getListaAlunos().add(ana);

        Aluno paulo = new Aluno("Paulo", Optional.of(new Matricula("334455")));
        cursoAdm.getListaAlunos().add(paulo);

        System.out.println("=================");

        cursoAdm
                .getListaAlunos()
                .stream()
                .map(a ->
                        "%s - %s"
                                .formatted(
                                        a.getNome(),
                                        a.getMatricula().orElse(new Matricula("Sem-Matricula")).getNumero()))
                .forEach(System.out::println);

        System.out.println("=================");

        cursoAdm
                .getListaAlunos()
                .stream()
                .filter(a -> a.getMatricula().isPresent())
                .map(a ->
                        "%s - %s"
                                .formatted(
                                        a.getNome(),
                                        a.getMatricula().get().getNumero()))
                .forEach(System.out::println);

    }
}
