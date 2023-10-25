package UT4.Apuntes;
import java.util.Scanner;
public class SentenciaIf03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la nota que has sacado: ");
    double nota = sc.nextDouble();
    if (nota >= 5) {
      System.out.print("¡Enhorabuena, has aprobado!");
    }
    else {
      System.out.print("Lo lamento amigo/a has suspendido, tendrás que repetir el examen en septiembre, una lastima.");
    }
    sc.close();
  }
}