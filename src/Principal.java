import modelo.Pelicula;

import java.util.Scanner;

public class Principal {
    public void muestaElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            String menu = """
                    Bienvenido a secreenmatch
                    1) Registrar una nueva película""";
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el nombre de la película");
                    teclado.nextLine();
                    String nombre = teclado.nextLine();
                    System.out.println("ingrese el año de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("ingrese la duración de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
            }
        }
    }
}


