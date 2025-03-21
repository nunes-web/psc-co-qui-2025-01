package Aula_Bicalho_20_03;

import java.util.Scanner;

public class AulaAtv06_IMC {

    public static void main(String[] args) {

        Double peso, altura, imc;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Qual é o seu peso em quilos (Kg): ");
            peso = scanner.nextDouble();

            System.out.println("Qual é sua altura em metros (m) ");
            altura = scanner.nextDouble();

            imc = peso / altura * altura;

            System.out.println("O seu IMC é: " + imc);

        }
    }

}
