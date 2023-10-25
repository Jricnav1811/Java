package UT3.Ejercicios;
import java.util.Scanner;

public class Ejercicio3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int primero;
    int segundo;
    System.out.print("Introduce dos números separados por un espacio: ");
    primero = sc.nextInt();
    segundo = sc.nextInt();
    int operacion = primero * segundo;
    System.out.println("La operación de los dos números es: " + operacion);
    sc.close();
  }
}
