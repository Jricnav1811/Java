package UT3.Ejercicios;
import java.util.Scanner;
public class EjercicioCafe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Vamos a calcular la diferencia de intensidad que hay entre dos cafés en diferentes escalas.");
    System.out.print("Introduce la intensidad del primer café: ");
    double valorIntensidad = sc.nextDouble();
    System.out.print("Introduce la escala del primer café: ");
    double notaPrimeraEscala = sc.nextDouble();
    System.out.print("Ahora introduce la intensidad del segundo café: ");
    double valorIntensidad2 = sc.nextDouble();
    System.out.print("Ahora introduce la escala del segundo café: ");
    double valorSegundaEscala = sc.nextDouble();
    double operacion = 
    
    double notaEx2 = ((notaQuieresSacar - 0.4*notaPrimerExamen) / 0.6);
    System.out.printf("Para tener un %.1f en el trimestre necesitas sacar un %.1f en el segundo examen.\n", notaQuieresSacar, notaEx2);
    sc.close();
  }
}
