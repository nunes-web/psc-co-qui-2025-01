package Aula_Bicalho_03_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Comparar3Num {
  public static void main(String[] args) {
    double[] num = new double[3];

    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        try {
          for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = scanner.nextDouble();
          }
          break;
        } catch (InputMismatchException e) {
          System.out.println("Entrada inválida. Por favor, digite um número.");
          scanner.next();
        }
      }
      System.out.printf("O maior número é: %.2f", (Math.max(num[0], Math.max(num[1], num[2]))));

    }

  }

}
