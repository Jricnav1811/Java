package UT3.Ejercicios;
import java.util.Scanner;
public class Ejercicio3_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce que nota sacaste en el primer examen: ");
    double notaPrimerExamen = sc.nextDouble();
    System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
    double notaQuieresSacar = sc.nextDouble();
    double notaEx2 = ((notaQuieresSacar - 0.4*notaPrimerExamen) / 0.6);
    System.out.printf("Para tener un %.1f en el trimestre necesitas sacar un %.1f en el segundo examen.\n", notaQuieresSacar, notaEx2);
    sc.close();
  }
}
