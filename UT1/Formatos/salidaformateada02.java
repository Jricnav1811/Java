package UT1.Formatos;

public class salidaformateada02 {
  public static void main(String[] args) {
    System.out.println("  Artículo  Precio/caja  Nº Cajas");
    System.out.println("-------------------------------------");
    System.out.printf("%-10s  %8.2f   %6d\n",  "Manzanas", 4.5, 10);
    System.out.printf("%-10s  %8.2f   %6d\n",  "Peras", 2.75, 120);
    System.out.printf("%-10s  %8.2f   %6d\n", "Aguacates", 10.0, 6);
  }
}
