package UT4.EjerciciosAdicionales;
import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a y b separadas por un espacio: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = ((-1)*b) / a;
    System.out.print("x = " + x);
    sc.close();
  }
}
