package Aula_Bicalho_20_03;

import java.util.Scanner;

public class AulaAtv03 {

    public static void main(String[] args) {
        Double C, K, F;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a temepratura em Celsius Cº: ");
            C = scanner.nextDouble();

            K = C + 273;
            F = 1.8 * C + 32;

            System.out.println(C + "Cº em Celsius Cº é igual a:\n"
                    + K + " Kº em Kelvin Kº\n"
                    + F + " Fº em Fahrenheint Fº");

        }
    }
}
