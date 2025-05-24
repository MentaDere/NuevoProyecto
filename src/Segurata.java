import java.util.Scanner;

public class Segurata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dime tu nombre: ");
        String nombre = scan.nextLine();

        System.out.println("Dime dónde quieres ir: ");
        String discoteca = scan.nextLine();

        System.out.println("Dime tu edad: ");
        int edad = scan.nextInt();

        if (discoteca.equals("Cocoloco") && edad >= 18) {
            System.out.println("Puedes pasar a Cocoloco.");
        } else if (discoteca.equals("Coquitoloquito") && edad >= 13 && edad < 18) {
            System.out.println("Puedes pasar a Coquitoloquito");
        } else {
            System.out.println("No puedes pasar.");
        }
    }
}
