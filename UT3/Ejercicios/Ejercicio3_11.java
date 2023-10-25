package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la cantidad de Kb a convertir: ");
    double kb = sc.nextDouble();
    double mb = kb / 1000;
    System.out.printf("%.3f Kb son %.2f Mb \n", kb, mb);
    sc.close();
  }
}
