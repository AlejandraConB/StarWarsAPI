package api.starwars.general;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultaPelicula {

	Pelicula buscaPelicula(int numeroDePelicula) {
		URI direccion = URI.create("https://swapi.py4e.com/api/films/"+numeroDePelicula);
		
//      Documentación httpRequest en la página de JavaDocs
	     HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(direccion)
	                .build();

	                try {
//	                  Documentación en la página de JavaDocs
	                    HttpResponse<String> response = client
	                            .send(request, HttpResponse.BodyHandlers.ofString());
	                    return new Gson().fromJson(response.body(), Pelicula.class);
	                } catch (Exception e) {
	                    throw new RuntimeException("No encontré esa película.");
	                }
	}
}
