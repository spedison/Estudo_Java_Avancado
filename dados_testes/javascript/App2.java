package br.com.spedison.javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;


public class App2 {

    static public void  println(String var){
        System.out.println(var);
    }
    public static void main(String[] args) {
        println (System.getProperty("java.runtime.version"));
        println ("---------------------------------");
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine nashorn = manager.getEngineByName("nashorn");
        if (nashorn != null) {
            println ("Nashorn is present.");
            println ("---------------------------------");
            printEngineInfo ( nashorn.getFactory());
        } else {
            println ("Nashorn is not present.");
        }
        for (ScriptEngineFactory f : manager.getEngineFactories()) {
            printEngineInfo(f);
        }

    }

    static void printEngineInfo(ScriptEngineFactory factory) {
        println( "engine name=" + factory.engineName);
        println( "engine version=" + factory.engineVersion);
        println( "language name=" + factory.languageName);
        println( "extensions=" + factory.extensions);
        println( "language version=" + factory.languageVersion);
        println( "names=" + factory.names);
        println( "mime types=" + factory.mimeTypes);
        println( "---------------------------------");
    }
}
