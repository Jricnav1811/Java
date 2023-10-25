package UT3.Apuntes;
import java.util.Scanner;

public class CalcularNúmerosDecimales {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double primero;
    double segundo;
    double tercero;
    System.out.print("Introduce tres números para calcular su media: ");
    primero = sc.nextDouble();
    segundo = sc.nextDouble();
    tercero = sc.nextDouble();
    System.out.println((primero + segundo + tercero) / 3);
    sc.close();
  }
}
