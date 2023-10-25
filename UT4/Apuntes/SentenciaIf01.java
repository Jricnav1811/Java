package UT4.Apuntes;
import java.util.Scanner;
public class SentenciaIf01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Cuál es la capital de Kiribati? ");
    String respuesta = sc.nextLine();
    if(respuesta.equals("Tarawa")) {
      System.out.println("¡La respuesta es correcta!");
    }
    else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
    sc.close();
  }
}
