package Aula_Bicalho_20_03;

import java.util.Scanner;

public class AulaAtv01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Bem-vindo: " + nome);

        scanner.close();

    }
}
