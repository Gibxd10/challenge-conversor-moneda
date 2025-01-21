import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Monedas monedaConversion(String moneda1, String moneda2, long cantidad){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/92f23e3c7c9e011e501c8434/pair/"+moneda1+"/"+moneda2+"/"+cantidad+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();

        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);

        }catch (Exception e){
            throw new RuntimeException("No se pudo hacer la conversion");
        }
    }
}
