package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la cantidad de pesetas que quieres convertir a euros: ");
    double pesetas = sc.nextDouble();
    double euros = pesetas / 166.386;
    System.out.printf("%.3f pesetas son %.2f euros \n", pesetas, euros);
    sc.close();
  }
}