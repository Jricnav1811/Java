package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura del cono: ");
    double alturaCono = sc.nextDouble();
    System.out.print("Introduce el radio de la base del cono: ");
    double baseCono = sc.nextDouble();
    //double formula = (1 / 3) * (3.14) * (Math.pow(baseCono, 2)) * (alturaCono);
    double formula2 = ((Math.pow(baseCono, 2)) / 3) * Math.PI * alturaCono;
    System.out.printf("El volumen del cono es: %.3f",formula2);
    sc.close();
  }
}
