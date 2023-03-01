package ejercicio_2;

import java.util.Scanner;

public class iva {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        int numero = num.nextInt();

        double iva = numero * 0.21;

        double suma = numero + iva;

        System.out.println("El precio con IVA es: " + suma);
    }
}
