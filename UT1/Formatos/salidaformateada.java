package UT1.Formatos;

public class salidaformateada {
  public static void main(String[] args) {
    System.out.printf("El número %d no tiene decimales. \n", 21);
    System.out.printf("El número %f sale con decimales. \n", 21.05);
    System.out.printf("El número %.3f sale con 3 decimales. \n", 21.034);
  }
}
