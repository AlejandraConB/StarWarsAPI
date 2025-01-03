package api.starwars.general;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeneradorDeArchivo {

	public void guardarJson(Pelicula pelicula) throws IOException {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FileWriter escritura = new FileWriter(fileName: pelicula.title()+".json");
		escritura.write(gson.toJson(pelicula));
		escritura.close();
	}
}
