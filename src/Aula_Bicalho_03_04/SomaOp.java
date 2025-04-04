package Aula_Bicalho_03_04;

import java.util.Scanner;

public class SomaOp {
  public static void main(String[] args) {
    int num1, num2;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro valor: ");
    num1 = scanner.nextInt();
    System.out.println("Digite o segundo valor: ");
    num2 = scanner.nextInt();

    System.out.println("A soma é: " + (num1 + num2));

    scanner.close();

  }
}
