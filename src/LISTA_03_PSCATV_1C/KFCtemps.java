package LISTA_03_PSCATV_1C;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KFCtemps {

    public static void main(String[] args) throws Exception {

        double k = 0, f = 0, c = 0;
        long tempScanner;
        int entrada;
        DecimalFormat df = new DecimalFormat("#.##");
        String fk, ff, fc;
        fk = df.format(k) + " °K";
        ff = df.format(f) + " °F";
        fc = df.format(c) + " °C";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nBem-vindo ao Conversor KFC de temperatura");
            do {
                System.out.println("\n========================================\n\n"
                        + "Unidades disponíveis para conversão:\n\n"
                        + "[1] Kelvin Kº\n"
                        + "[2] Fahrenheit Fº\n"
                        + "[3] Celsius Cº\n"
                        + "\n========================================\n"
                        + "Selecione a temperatura de entrada [1 - 3]");
                entrada = scanner.nextInt();

                if (entrada < 0 || entrada > 3) {
                    System.out.println("Unidade inválida, tente novamente:");
                }

            } while (entrada < 0 || entrada > 3);

            System.out.println("Digite o valor da temperatura:");
            tempScanner = scanner.nextLong();

            switch (entrada) {
                case 1: // Kelvin
                    k = tempScanner;
                    c = k - 273.15;
                    f = (k - 273.15) * 9 / 5 + 32;
                    System.out.println("\nA conversão de: " + fk + " é:\n"
                            + "Celsius: " + fc + "\n"
                            + "Fahrenheit: " + ff + "\n");
                    break;
                case 2: // Fahrenheit
                    f = tempScanner;
                    c = (f - 32) * 5 / 9;
                    k = (f - 32) * 5 / 9 + 273.15;
                    System.out.println("\nA conversão de: " + ff + " é:\n"
                            + "Celsius: " + fc + "\n"
                            + "Kelvin: " + fk + "\n");
                    break;
                case 3: // Celsius
                    c = tempScanner;
                    k = c + 273.15;
                    f = (c * 9 / 5) + 32;
                    System.out.println("\nA conversão de: " + fc + " é:\n"
                            + "Fahrenheit: " + ff + "\n"
                            + "Kelvin: " + fk + "\n");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
            System.out.println("Fim do programa...\n");
        }

    }
}
