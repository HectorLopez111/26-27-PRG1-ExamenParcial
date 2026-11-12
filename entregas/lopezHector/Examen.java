package entregas.lopezHector;
import java.util.Scanner;

public class Examen {
    Scanner scanner = new Scanner(System.in);
    final int MAYOR_EDAD=18;
    System.out.println("¿Es mayor de edad?: ");
    int edad = scanner.nextInt();

    if (edad <= MAYOR_EDAD){
        System.out.println("es mayor de edad");

    }else{
        System.out.println("es menor de edad");
    }
}

    



