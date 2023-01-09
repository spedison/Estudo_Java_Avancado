package br.com.spedison.ver_13_14;

class Aluno{

    public Aluno() {
    }

    String nome = null;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
public class NullPointerExemplo {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        //aluno.setNome("Aluno");
        System.out.println(aluno.getNome().charAt(0));
        /***
         * Mensagem de erro a partir do Java14 está muito mais detalhada.
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because the return value of "br.com.spedison.ver_13_14.Aluno.getNome()" is null
         * 	at br.com.spedison.cursojavaavancado/br.com.spedison.ver_13_14.NullPointerExemplo.main(NullPointerExemplo.java:22)
         */
    }
}
