package Aula_Bicalho_03_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AntSucNum {
  public static void main(String[] args) {
    int num;

    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        try {
          System.out.println("Digite um número: ");
          num = scanner.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
          scanner.next();
        }
      }
    }
    System.out.println("O número anterior é: " + (num - 1));
    System.out.println("O número sucessor é: " + (num + 1));
  }

}
