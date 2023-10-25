package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura del rectángulo en metros para calcular su area: ");
    double altura = sc.nextDouble();
    System.out.print("Introduce la base del rectángulo en metros: ");
    double base = sc.nextDouble();
    double area = altura * base;
    System.out.println("El área del rectángulo es: " + area + " m2.");
    sc.close();
  }
}