import modelo.Pelicula;
import modelo.Serie;

public class Main {
        public static void main(String[] args) {
            Pelicula matrix = new Pelicula();
            matrix.setNombre("Matrix");
            matrix.setFechaDeLanzamiento(1999);
            matrix.setTiempoDeDuracionEnMinutos(120);

            matrix.muestraFichaTecnica();

            Serie friends = new Serie();
            friends.setNombre("Friends");
            friends.getFechaDeLanzamiento(1999);





        }
    }
