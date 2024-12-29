package api.starwars.general;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

	Pelicula buscaPelicula(int numeroDePelicula) {
		URI direction = URI.create("https://swapi.py4e.com/api/films/"+numeroDePelicula);
		
		
	     HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(direction))
	                .build();

	        HttpResponse<String> response = client
	                 .send(request, HttpResponse.BodyHandlers.ofString());
	        
	        return new Gson().fromJson(response.body(), Pelicula.class);
	}
}
