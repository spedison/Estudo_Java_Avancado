package br.com.spedison.ver_09.http2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class TesteHttp {

    private static final String USER_AGENT = "Mozilla/5.0";
    public static void main(String[] args) {
        HttpClient hp = HttpClient
                .newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(20))
           .build();

        HttpRequest httpRequest =
                HttpRequest
                        .newBuilder(URI.create("https://www.google.com/search?q=Edison%20Ribeiro%20Araújo%20USP&oq=Edison%20Ribeiro%20Araújo%20USP"))
                        .setHeader("User-Agent", USER_AGENT)
                        .build();

        HttpResponse<String> response = null;
        try {
            response = hp.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(response.statusCode());
        System.out.println(response.body());

        //System.out.println(hp.send(

        //.proxy(ProxySelector.of(new InetSocketAddress("proxy.example.com", 80)))
        //        .authenticator(Authenticator.getDefault())       .build();



    }
}
