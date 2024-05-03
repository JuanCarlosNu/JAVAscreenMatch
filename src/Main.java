import modelo.Pelicula;

public class Main {
        public static void main(String[] args) {
            Pelicula matrix = new Pelicula();
            matrix.nombre = "Matrix";
            matrix.tiempoDeDuracionEnMinutos = 120;
            matrix.fechaDeLanzamiento = 1999;
            System.out.println(matrix.nombre);
            System.out.println(matrix.fechaDeLanzamiento);
            System.out.println(matrix.tiempoDeDuracionEnMinutos);

            Pelicula encanto = new Pelicula();
            encanto.nombre = "Encanto";
            encanto.tiempoDeDuracionEnMinutos = 120;
            encanto.fechaDeLanzamiento = 2022;
            encanto.muestraFichaTecnica();
        }
    }
