package UT4.Ejercicios;
import java.util.Scanner;
public class Ejercicio4_6 {
  final static double gravedad = 9.81;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vamos a calcular a que velocidad cae un objeto.");
    System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
    double altura = sc.nextDouble();
    double tiempo = Math.sqrt((2 * altura) / gravedad);
    System.out.printf("El objeto tarda %.2f segundos en caer. \n", tiempo);
    sc.close();
  }
}
