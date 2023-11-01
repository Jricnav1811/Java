package UT4.Ejercicios;
import java.util.Scanner;
public class Ejercicio4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana en minúsculas y te digo la asignatura que tienes a primera hora: ");
        String dia = sc.nextLine();
        switch (dia) {
            case "lunes":
                System.out.print("Sistemas informáticos.");
                break;
            case "martes":
                System.out.print("Sistemas informáticos.");
                break;
            case "miércoles":
                System.out.print("Bases de datos.");
                break;
            case "jueves":
                System.out.print("Lenguajes de marcas.");
                break;
            case "viernes":
                System.out.print("Bases de datos.");
                break;
            default:
            System.out.print("No has introducido el día correcto, asegúrate de ponerlo todo en minúsculas.");
                break;
        }

        sc.close();
    }
}
