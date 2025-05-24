import java.util.Scanner;

public class Segurata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dime tu nombre: ");
        String nombre = scan.nextLine();

        System.out.println("Dime tu edad: ");
        int edad = scan.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes pasar.");
        } else {
            System.out.println("No puedes pasar.");
        }
    }
}
