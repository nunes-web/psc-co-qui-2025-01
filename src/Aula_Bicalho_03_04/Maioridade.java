package Aula_Bicalho_03_04;

import java.util.Scanner;

public class Maioridade {

  public static void main(String[] args) {
    int idade;
    String nome;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite seu nome: ");
      nome = scanner.nextLine();
      System.out.println("Digite sua idade: ");
      idade = scanner.nextInt();

      if (idade >= 18) {
        System.out.println(nome + " é " + "Maior de idade");
      } else {
        System.out.println(nome + " é " + "Menor de idade");
      }
    }
  }
}
