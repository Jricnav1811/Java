package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un primer número: ");
    double primerNumero = sc.nextDouble();
    System.out.print("Introduce un segundo número: ");
    double segundoNumero = sc.nextDouble();
    double suma = primerNumero + segundoNumero;
    double resta = primerNumero - segundoNumero;
    double multiplicacion = primerNumero * segundoNumero;
    double division = primerNumero / segundoNumero;
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicación es: " + multiplicacion);
    System.out.println("La división es: " + division);
    sc.close();
  }
}
