package Aula_Bicalho_20_03;

import java.util.Scanner;

public class AulaAtv05 {

    public static void main(String[] args) {

        int num1, numExp, numX;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite um número: ");
            num1 = scanner.nextInt();

            System.out.println("Seleciona o expoente: ");
            numExp = scanner.nextInt();

            numX = (int) Math.pow(num1, numExp);

            System.out.println("A sua potenciação é: " + numX);

        }
    }

}
