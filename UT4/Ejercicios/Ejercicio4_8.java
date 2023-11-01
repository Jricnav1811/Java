package UT4.Ejercicios;
import java.util.Scanner;
public class Ejercicio4_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vamos a calcular la media de tres notas.");
    System.out.print("Introduce la primera nota: ");
    double nota1 = sc.nextDouble();
    System.out.print("Introduce la segunda nota: ");
    double nota2 = sc.nextDouble();
    System.out.print("Introduce la tercera nota: ");
    double nota3 = sc.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.printf("La media de las tres notas es %.1f", media);
    if (media < 5) {
      System.out.print(" (tienes un insuficiente).");
    } else if ((media == 5) || (media == 6)) {
      System.out.print(" (tienes un suficiente).");
    } else if ((media == 7) || (media == 8)) {
      System.out.print(" (tienes un notable).");
    } else if ((media == 9) || (media == 10)) {
      System.out.print(" (tienes un sobresaliente).");
    }
    sc.close();
  }
}
