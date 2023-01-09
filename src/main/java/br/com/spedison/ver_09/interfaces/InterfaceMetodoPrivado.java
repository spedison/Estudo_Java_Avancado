package br.com.spedison.ver_09.interfaces;


interface Inter {
    private void inicializa() { // Este médodo só pode ser acessada pela própria interface. Somente para o Java 9
        System.out.println("Inicializando....");
    }

    default void inicializa(String v1) {
        inicializa();
        System.out.println(v1);
    }
}

class InterImpl implements Inter {
    public InterImpl() {
    }

    @Override
    public void inicializa(String v1) {
        System.out.println("Dentro da Impl..." + v1);
    }
}

public class InterfaceMetodoPrivado {

    public static void main(String[] args) {

        Inter a = new Inter() {
            @Override
            public void inicializa(String v1) {
                System.out.println("Inicializando....No código." + v1);
            }
        };
        a.inicializa("x");

        a = new InterImpl();
        a.inicializa("x");


        a = new Inter() {
        };

        a.inicializa("x");

    }
}
