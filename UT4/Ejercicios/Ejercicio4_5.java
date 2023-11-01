package UT4.Ejercicios;
import java.util.Scanner;
public class Ejercicio4_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    Double a = sc.nextDouble();
    System.out.print("Ahora introduzca el valor de b: ");
    Double b = sc.nextDouble();
    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
    sc.close();
  }
}

