import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Declaración de variables con values de distintos tipos.
        int fechaDeLanzamiento = 1999; //camel case
        double evaluacion = 4.5;
        boolean incluidoEnElplanbasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del año, una de acción de todos los tiempos""";
        double mediaEvaluacionUsuario = 0;

        System.out.println("Película: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElplanbasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3)/3;
        System.out.println("estrellas : "+ mediaEvaluacion);

        if (fechaDeLanzamiento < 2023)
        {
            System.out.println("Una película retro para volver a ver..");
        }else {
            System.out.println("nuevos lanzanmientos");
        };

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa la nota que le darías a Matrix");
            double notaMatrix = teclado.nextDouble();
             mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix ;

        }
        System.out.println("la nota que sacó Matrix es : " + mediaEvaluacionUsuario / 3);




    }
}