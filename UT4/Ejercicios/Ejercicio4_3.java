package UT4.Ejercicios;
import java.util.Scanner;
public class Ejercicio4_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número para devolver un día de la semana: ");
    int num = sc.nextInt();
    switch (num) {
      case 1:
      System.out.print("Lunes.");
      break;
      case 2:
      System.out.print("Martes.");
      break;
      case 3:
      System.out.print("Miércoles.");
      break;
      case 4:
      System.out.print("Jueves.");
      break;
      case 5:
      System.out.print("Viernes.");
      break;
      case 6:
      System.out.print("Sábado.");
      break;
      case 7:
      System.out.print("Domingo.");
      break;
      default:
      System.out.print("No has introducido un número correcto.");
    }
    sc.close();
  }
}
