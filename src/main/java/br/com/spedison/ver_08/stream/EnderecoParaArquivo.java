package br.com.spedison.ver_08.stream;

import java.io.*;

public class EnderecoParaArquivo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("teste2-endereco.file");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        var obj = new Endereco(10,"teste de endereco");
        oos.writeObject(obj);
        oos.flush();
        oos.close();
        fos.close();
        System.out.println("obj que foi gravado = " + obj);

        FileInputStream fis = new FileInputStream("teste2-endereco.file");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Endereco endereco = (Endereco) ois.readObject();
        System.out.println("Obj que foi lido = "+ endereco);
        ois.close();
    }
}
