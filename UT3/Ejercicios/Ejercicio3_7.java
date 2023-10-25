package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_7 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Introduzca su base imponible para calcular el total de su factura: ");
   double sueldoBase = sc.nextDouble();
   double operacion = sueldoBase * 1.21;
   System.out.println("El total de su factura a partir de la base imponible introducida es: " + operacion);
   sc.close();
  }
}
