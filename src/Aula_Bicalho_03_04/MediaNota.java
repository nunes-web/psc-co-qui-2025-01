package Aula_Bicalho_03_04;

import java.util.Scanner;

public class MediaNota {
  public static void main(String[] args) {
    double[] nota = new double[2];
    double media = 0;

    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 0; i < nota.length; i++) {
        System.out.println("Digite a nota " + (i + 1) + ": ");
        nota[i] = scanner.nextDouble();
        media += nota[i];
      }

      media = (nota[0] + nota[1]) / nota.length;

      System.out.println("A média das notas é: " + media);
    }

  }
}
