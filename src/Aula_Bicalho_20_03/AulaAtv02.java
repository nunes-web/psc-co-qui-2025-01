package Aula_Bicalho_20_03;

import java.util.Scanner;

public class AulaAtv02 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {;
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("\nDigite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("\nDigite a cidade em que mora: ");
            String cidade = scanner.next();

            System.out.println("\nOlá, meu nome é: " + nome
                    + ", tenho: "
                    + idade
                    + " e moro em: " + cidade);

        }

    }
}
