package UT4.Ejercicios.EjerciciosAdicionales;
import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entre 1 y 12: ");
    int num = sc.nextInt();
    switch (num) {
      case 1:
        System.out.print("enero.");
        break;
      case 2:
        System.out.print("febrero.");
        break;
      case 3:
        System.out.print("marzo.");
        break;
      case 4:
        System.out.print("abril.");
        break;
      case 5:
        System.out.print("mayo.");
        break;
      case 6:
        System.out.print("junio.");
        break;
      case 7:
        System.out.print("julio.");
        break;
      case 8:
        System.out.print("agosto.");
        break;
      case 9:
        System.out.print("septiembre.");
        break;
      case 10:
        System.out.print("octubre.");
        break;
      case 11:
        System.out.print("noviembre.");
        break;
      case 12:
        System.out.print("diciembre.");
        break;
      default:
        System.out.print("no existe ese mes.");
    }
    sc.close();
  }
}
