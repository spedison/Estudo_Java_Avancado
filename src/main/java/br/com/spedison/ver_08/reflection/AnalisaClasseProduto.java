package br.com.spedison.ver_08.reflection;

import br.com.spedison.Produto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/***
 * Classes usadas para reflection
 * Constructor
 * Field
 * Method
 * Parameter
 * Modifier
 */
public class AnalisaClasseProduto {


    public static void main(String[] args) {


        Produto p = new Produto("Geladeira", 3000.);

        Class cl = p.getClass();

        Constructor<Produto>[] constructor = cl.getConstructors();
        Method[] methods = cl.getMethods();
        Field[] campos = cl.getFields();


        for (Method m : methods) {
            System.out.println("Método => " + m.getName() + " - Modificador: " + m.getModifiers());
            Parameter[] params = m.getParameters();
            for(Parameter param : params) {
                System.out.println("   Parâmetro  -> " + param.getName() + " - Tipo " + param.getType().getSimpleName());
            }
            System.out.println("-------------");
        }


    }

}
