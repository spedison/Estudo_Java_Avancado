package br.com.spedison.ver_13_14;

class Animal {
    private int idade;

    public Animal() {
    }

    public Animal(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Pet extends Animal {
    private String name;

    public Pet(String name, int idade) {
        super(idade);
        this.name = name;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }
}

class Cachorro extends Pet {
    public Cachorro(String name, int idade) {
        super(name, idade);
    }
    public void latir(){
        System.out.println("Au Au");
    }
}
public class InstanceOfExemplo {
    public static void main(String[] args) {

        Animal a = new Pet("Tomaz", 5);
        Animal c = new Cachorro("Tomaz Terceiro", 7);
        Animal b = new Animal(7);

        if (a instanceof Pet p) {
            System.out.println(p.getName());
        }
        if (a instanceof Animal) {
            System.out.println(a.getIdade());
        }
        if (b instanceof Pet p) {
            System.out.println(p.getName());
        }

        if (b instanceof Animal) {
            System.out.println(b.getIdade());
        }

        if (c instanceof Pet  c1) {
            System.out.println(c1.getName());
        }

        if (c instanceof Cachorro c1) {
            c1.latir();
        }

    }
}
