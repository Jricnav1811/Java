package UT4.Ejercicios;
import java.util.Scanner;
public class CalcularNotaMapa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la escala de evaluación: ");
    double escala = sc.nextDouble();
    System.out.print("Introduce la nota de tu tarea: ");
    double notaTarea = sc.nextDouble();
    double operacion = (notaTarea * 10) / escala;
    System.out.printf("La nota de tu tarea sobre 10 es: %.1f", operacion);
    sc.close();
  }
}
