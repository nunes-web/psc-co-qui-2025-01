package PSCATV_2C;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATV2 {

  // Metodo para formatação do tempo em milissegundos para o formato MM:SS:SSS.
  private static String formatarTempo(long tempoMilissegundos) {
    long minutos = tempoMilissegundos / (60 * 1000);
    long segundos = (tempoMilissegundos % (60 * 1000)) / 1000;
    long milissegundos = tempoMilissegundos % 1000;
    return String.format("%02d:%02d:%03d", minutos, segundos, milissegundos);
  }

  // Metodo para calcular a velocidade media
  private static double calculoVelocidadeMedia(double distanciaTotal, double tempoTotalMilissegundos) {
    double tempoTotalHoras = tempoTotalMilissegundos / (60 * 60 * 1000);
    return distanciaTotal / tempoTotalHoras;
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Declaração de variáveis
      int numeroVoltas = 0;
      int numeroPilotos = 0;
      double distanciaPercurso = 0;
      String pilotoMaisRapido = "";
      String nomePiloto = "";
      double tempoTotal = 0;
      double menorTempo = Double.MAX_VALUE;
      double distanciaTotal;
      double velocidadeMedia;
      String tempoVoltaS;
      String[] partes;
      int minutos, segundos, milesimos;

      // Entrada da distância do percurso
      while (true) {
        try {
          System.out.print("Digite a distância do percurso (em km): ");
          distanciaPercurso = scanner.nextDouble();
          if (distanciaPercurso <= 0) {
            throw new IllegalArgumentException("A distância deve ser maior que zero.");
          }
          break;
        } catch (InputMismatchException | IllegalArgumentException e) {
          System.out.println("Erro ao ler a distância do percurso. Digite um valor numérico válido.");
          scanner.nextLine();
        }
      }

      // Entrada do número de voltas da corrida
      while (true) {
        try {
          System.out.print("Digite o número de voltas: ");
          numeroVoltas = scanner.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Erro ao ler o número de voltas. Digite apenas números inteiros.");
          scanner.nextLine();
        }
      }

      // Entrada da quantidade de pilotos na corrida
      while (true) {
        try {
          System.out.print("Digite o número de pilotos: ");
          numeroPilotos = scanner.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Erro ao ler o número de pilotos. Digite apenas números inteiros.");
          scanner.nextLine();
        }
      }

      // Entrada das IDs dos pilotos na corrida
      for (int i = 1; i <= numeroPilotos; i++) {
        while (true) {
          System.out.print("\nDigite o nome do piloto " + i + ": ");
          nomePiloto = scanner.next();
          if (nomePiloto.matches(".*\\d.*")) {
            System.out.println(
                "Erro ao ler o nome do piloto " + i + ", O nome do piloto não pode conter números. Tente novamente.");
          } else {
            break;
          }
        }

        // Entrada do tempo de volta dos pilotos na corrida
        for (int j = 1; j <= numeroVoltas; j++) {
          while (true) {
            try {
              System.out
                  .print("Digite o tempo da volta " + j + " do piloto " + nomePiloto + " (formato MM:SS:SSS): ");
              tempoVoltaS = scanner.next();
              partes = tempoVoltaS.split(":");
              if (partes.length != 3) {
                throw new IllegalArgumentException("Formato inválido. Digite apenas como MM:SS:SSS.");
              }
              minutos = Integer.parseInt(partes[0]);
              segundos = Integer.parseInt(partes[1]);
              milesimos = Integer.parseInt(partes[2]);
              if (minutos < 0 || segundos < 0 || segundos >= 60 || milesimos < 0 || milesimos >= 1000) {
                throw new IllegalArgumentException(
                    "Valores inválidos para minutos, segundos ou milissegundos. Tente novamente");
              }
              tempoTotal += (minutos * 60 * 1000) + (segundos * 1000) + milesimos;
              break;
            } catch (IllegalArgumentException e) {
              System.out.println("Erro ao ler o tempo da volta. Digite apenas como MM:SS:SSS.");
              scanner.nextLine();
            }
          }
        }

        // Cálculo da velocidade média
        distanciaTotal = distanciaPercurso * numeroVoltas;
        velocidadeMedia = calculoVelocidadeMedia(distanciaTotal, tempoTotal);

        System.out.println("\nTempo total do piloto " + nomePiloto + ": " + formatarTempo((long) tempoTotal));
        System.out.printf("Velocidade média do piloto %s: %.2f km/h%n", nomePiloto, velocidadeMedia);

        if (tempoTotal < menorTempo) {
          menorTempo = tempoTotal;
          pilotoMaisRapido = nomePiloto;
        }
      }

      // Exibição do piloto mais rápido e tempo
      System.out.println("\nO piloto mais rápido foi " + pilotoMaisRapido + " com um tempo total de "
          + formatarTempo((long) menorTempo) + " e uma velocidade média de "
          + String.format("%.2f km/h", calculoVelocidadeMedia(distanciaPercurso * numeroVoltas, menorTempo)) + ".");
    }
  }
}
