package UT4.Ejercicios;
import java.util.Scanner;
public class Ejercicio4_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el valor de a: ");
    int a = sc.nextInt();
    System.out.print("Introduce el valor de b: ");
    int b = sc.nextInt();
    System.out.print("Introduce el valor de c: ");
    int c = sc.nextInt();
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecucación tiene soluciones infinitas.");
    } else if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    } else if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    } else if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    } else  if ((a != 0) && (b != 0) && (c != 0)) {
      double independiente = b*b - (4 * a * c);
      if (independiente < 0) {
        System.out.println("La ecuación no tiene soluciones reales");
      } else {
        System.out.println("x1 = " + (-b + Math.sqrt(independiente))/(2 * a));
        System.out.println("x1 = " + (-b - Math.sqrt(independiente))/(2 * a));
      }
    }

    sc.close();
  }
}
