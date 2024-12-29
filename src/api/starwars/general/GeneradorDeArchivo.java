package api.starwars.general;

public class GeneradorDeArchivo {

	public void guardarJson(Pelicula pelicula) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FileWriter escritura = new FileWriter(fileName: pelicula.title()+".json");
		
	}
}
