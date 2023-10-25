package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la cantidad de Mb a convertir: ");
    double mb = sc.nextDouble();
    double kb = mb * 8000;
    System.out.print(mb + " son " + kb);
    sc.close();
  }
}
