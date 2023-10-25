package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el número de horas trabajadas para calcular su salario semanal: ");
    double horas = sc.nextDouble();
    double precioHoras = 12;
    double salarioSemanal = horas * precioHoras;
    System.out.println("El salario semanal que le corresponde es de: " + salarioSemanal + " euros.");
    sc.close();
  }
}
