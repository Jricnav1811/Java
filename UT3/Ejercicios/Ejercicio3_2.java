package UT3.Ejercicios;
import java.util.Scanner;
/**
 * Ejercicio3_2
 */
public class Ejercicio3_2 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Introduce la cantidad de euros que quieres convertir a pesetas: ");
  Double euros = sc.nextDouble();
  double operacion = euros * 166.386;
  System.out.println(euros + " son " + operacion + " pesetas.");
  sc.close();
}  
}
