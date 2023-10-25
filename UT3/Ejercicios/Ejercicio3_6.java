package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura nº1 del triángulo en metros para calcular su área: ");
    double altura = sc.nextDouble();
    System.out.print("Introduce la altura nº2 del triángulo en metros para calcular su área: ");
    double altura2 = sc.nextDouble();
    System.out.print("Ahora introduce la base del triángulo en metros: ");
    double base = sc.nextDouble();
    double operacion = (altura + altura2 + base) / 2;
    System.out.println("El área del triángulo es: " + operacion);
    sc.close();
  }
}
