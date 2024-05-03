import modelo.Pelicula;

public class Main {
        public static void main(String[] args) {
            Pelicula matrix = new Pelicula();
            matrix.setNombre("Matrix");
            matrix.setFechaDeLanzamiento(1999);
            matrix.setTiempoDeDuracionEnMinutos(120);

            matrix.muestraFichaTecnica();



        }
    }
