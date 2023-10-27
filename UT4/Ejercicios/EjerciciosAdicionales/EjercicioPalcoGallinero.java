package UT4.Ejercicios.EjerciciosAdicionales;
import java.util.Scanner;
public class EjercicioPalcoGallinero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el precio de la entrada: ");
    double precioEntrada = sc.nextDouble();
    System.out.println("¿Qué entrada desea comprar?: ");
    System.out.println("1. Entrada al palco.");
    System.out.println("2. Entrada al gallinero.");
    int primeraEleccion = sc.nextInt();
    System.out.println("Elija que tipo de público es para aplicar un descuento: ");
    System.out.println("1. Público con invitación.");
    System.out.println("2. Público local.");
    System.out.println("3. Público foráneo.");
    int segundaEleccion = sc.nextInt();
    double palco = (10 * precioEntrada) / 100;
    double gallinero = (5 * precioEntrada) / 100;
    if ((primeraEleccion == 1) && (segundaEleccion == 1)){
      System.out.println("Su precio es: " + (precioEntrada - palco));
    } else if ((primeraEleccion == 2) && (segundaEleccion == 1)) {
      System.out.println("Su precio es: " + (precioEntrada - gallinero));
    } else if ((primeraEleccion == 1) && (segundaEleccion == 2) || (primeraEleccion == 2) && (segundaEleccion == 2)) {
      System.out.println("Su precio es: " + precioEntrada);
    } else if ((primeraEleccion == 1) && (segundaEleccion == 3)) {
      System.out.println("Su precio es: " + (precioEntrada + palco));
    } else if ((primeraEleccion == 2) && (segundaEleccion == 3)) {
      System.out.println("Su precio es: " + (precioEntrada + gallinero));
    }
    sc.close();
  }
}
