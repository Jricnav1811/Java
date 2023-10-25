package UT4.Apuntes;
import java.util.Scanner;
public class SentenciaIf02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número para calcular si es positivo o negativo: ");
    int num = sc.nextInt();
    if (num > 0) {
      System.out.print("El número es positivo.");
    }
    else {
      if (num == 0) {
      System.out.print("El número es cero.");
      }
      else {
        System.out.print("El número es negativo.");
      }
    }
    sc.close();
  }
}
