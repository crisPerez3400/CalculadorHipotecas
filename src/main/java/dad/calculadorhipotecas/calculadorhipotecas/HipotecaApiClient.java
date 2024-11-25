package dad.calculadorhipotecas.calculadorhipotecas;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HipotecaApiClient {
    public static void conexionApi(String host, String capital, String interes, String plazo) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            // URL de ejemplo con parámetros
            String url = "http://localhost:" + host + "/hipoteca?capital=" + capital + "100000&interes=" + interes + "&plazo=" + plazo;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Mostrar respuesta en consola
            System.out.println("Código de estado: " + response.statusCode());
            System.out.println("Respuesta: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
