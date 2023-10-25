package UT3.Apuntes;

public class LeeNumeros {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número: ");
    int primerNumero = Integer.parseInt((System.console().readLine()));
    System.out.print("Introduce otro número: ");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    int total = (2 * primerNumero) + segundoNumero;
    System.out.print("El primer número introducido es: " + primerNumero);
    System.out.print(" y el segundo es: " + segundoNumero);
    System.out.print(" el doble del primer número más el segundo es: ");
    System.out.print(total + ".");
  }
}
