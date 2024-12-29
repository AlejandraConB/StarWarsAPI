package api.starwars.general;

public class Principal {
    public static void main(String[] args) {
	
    	ConsultaPelicula consulta = new ConsultaPelicula();
    	Pelicula pelicula = consulta.buscaPelicula( numeroDePelicula: 1);
    	System.out.print(pelicula);
    	
    }
}
