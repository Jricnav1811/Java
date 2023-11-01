package UT4.Ejercicios;
import java.util.Scanner;
public class Ejercicio4_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pulse una opción: ");
    System.out.println("1. Ha trabajado 40 horas o menos.");
    System.out.println("2. Ha trabajado 41 horas o más.");
    int seleccion = sc.nextInt();
    switch (seleccion) {
      case 1:
        System.out.print("Seleccione cuantas horas ha trabajado para calcular su sueldo: ");
        int horasTrabajadas = sc.nextInt();
        System.out.println("El sueldo semanal que le corresponde es de " + (horasTrabajadas * 12) + " euros.");
        break;
      case 2:
        System.out.print("Seleccione cuantas horas extra (ej: 5): ");
        int horasExtra = sc.nextInt();
        System.out.println("El sueldo semanal que le corresponde es de " + ((40 * 12) + (horasExtra * 16)) + " euros.");
        break;
      default:
        System.out.print("No ha introducido un número, asegúrese de no ingresar decimales.");
        break;
      }
        sc.close();
    }    
  }