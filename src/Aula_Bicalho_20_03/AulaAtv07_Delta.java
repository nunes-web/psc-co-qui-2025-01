package Aula_Bicalho_20_03;

import java.util.Scanner;

public class AulaAtv07_Delta {

    public static void main(String[] args) {

        int a, b, c, delta;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Para calcular um delta de [b² - 4.a.c] digite suas variáveis\nVariável (a): ");
            a = scanner.nextInt();
            System.out.println("\nAgora, digite a Variável (b): ");
            b = scanner.nextInt();
            System.out.println("\nAgora, digite a Variável (c): ");
            c = scanner.nextInt();

            delta = ((b * b) - (4 * a * c));

            System.out.println("Seu delta é igual a: " + delta);

        }
    }

}
