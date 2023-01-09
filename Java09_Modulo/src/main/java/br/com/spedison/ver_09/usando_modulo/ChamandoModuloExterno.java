package br.com.spedison.ver_09.usando_modulo;

import br.com.spedison.moduloexterno.Saudacao;
import br.com.spedison.moduloexterno.ola.OlaMundo;
//import br.com.spedison.moduloexterno.tchau.TchauMundo;

public class ChamandoModuloExterno {
    public static void main(String[] args) {

        Saudacao  ola = new OlaMundo();
        ola.diga();


        /***
         * TchauMundo existe e é declado mas não é exportado no módulo.
         */
        //TchauMundo tchau = new TchauMundo();
        //tchau.tchau();

    }
}
