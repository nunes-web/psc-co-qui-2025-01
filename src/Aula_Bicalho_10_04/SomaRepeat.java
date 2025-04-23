package Aula_Bicalho_10_04;

import java.util.Scanner;

public class SomaRepeat {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int soma = 0;
      int num;
      String continuar = "S";
      while (continuar.equalsIgnoreCase("S")) {
        System.out.println("Digite um número para ser somado:");
        num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Deseja continuar a soma? [S/N]");
        continuar = scanner.nextLine();
        soma += num;
        System.out.println("A soma dos números digitados é: " + soma);
      }

    }
  }

}
