package UT4.Ejercicios.EjerciciosAdicionales;
import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce una hora entre 0 y 23: ");
    int hora = sc.nextInt();
    if ((hora >= 6) && (hora <= 12)) {
      System.out.print("Buenos días.");
    } else if ((hora >= 12) && (hora <= 19)) {
      System.out.print("Buenas tardes.");
    } else if ((hora >= 19) && (hora <= 24)) {
      System.out.print("Buenas noches.");
    } else if ((hora >= 24) && (hora <= 6 )) {
      System.out.print("Buenas noches.");
    }  
    else {
      System.out.print("No has introducido una hora correcta.");
    }
    sc.close();
  }
}
