package PSCATV_1DE;

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double lado, area;

            System.out.println("Digite o valor do lado do quadrado: ");
            lado = scanner.nextDouble();

            area = Math.pow(lado, lado);

            System.out.println("O valor da área do quadrado é: ");

        }

    }
}
