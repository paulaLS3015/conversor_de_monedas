import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {
    private static String key = "18d6dbb67c015587b338228b";

    public Badge getBadge(String badge){
        URI direction = URI.create("https://v6.exchangerate-api.com/v6/"+this.key+"/latest/"+badge);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Badge.class);
        } catch (Exception e) {
            throw new RuntimeException("404\nNOT FOUND\n" + e.getMessage());
        }
    }
}
