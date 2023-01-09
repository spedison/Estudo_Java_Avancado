package br.com.spedison.javascript;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.List;

public class JavaScript_1_RodaOlaMundo {

    public void rodaScript(String[] args) {
        ScriptEngineManager sem = new ScriptEngineManager();
        List<ScriptEngineFactory> listEngines =  sem.getEngineFactories();
        System.out.println(listEngines.size());
        listEngines.forEach( scriptEngineFactory -> System.out.println(scriptEngineFactory.getEngineName()));

        //var a = 1 + 2 == 2 ? true : false;
        //if (a) return;

        ScriptEngine ee = new ScriptEngineManager().getEngineFactories().get(0).getScriptEngine();
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
        bind.put("hoje", new Date().toString());
        try {
            ee.eval(new FileReader("/home/edisonribeiroaraujo/Document/Curso_Java_Avancado/src/main/java/olamundo.js"));
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JavaScript_1_RodaOlaMundo js = new JavaScript_1_RodaOlaMundo();
        js.rodaScript(args);
    }

}
