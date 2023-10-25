package UT3.Apuntes;
import java.util.Scanner;
public class LeerDatosScannerMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu nombre ");
    String nombre = sc.nextLine();
    int numero = Integer.parseInt(sc.nextLine());
    System.out.println("Tu nombre es: " + nombre + numero);
    sc.close();
  }
}
