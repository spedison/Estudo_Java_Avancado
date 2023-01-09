// Descritor de Módulo
module br.com.spedison.cursojavaavancado {
    requires java.base;
    requires java.net.http; // suporte para http 2.0 ?
    // requires e exports são as mais usadas.
    // opens -> Permite que membros privados sejam acessados por mecanismo de relection.
    // uses -> Serviço usado per esse módulo
    requires org.graalvm.js.scriptengine;
    requires java.scripting;
}