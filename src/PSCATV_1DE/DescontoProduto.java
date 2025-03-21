package PSCATV_1DE;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DescontoProduto {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String vTotalF, vDsctF, vPagoF;
            double p1, p2, p3, p4, vDsct, vTotal, vPago;
            double dsct = 0.8;

            Locale country = Locale.getDefault();
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(country);

            // Leitura dos valores dos produtos
            System.out.println("Digite o valor do primeiro produto: ");
            p1 = scanner.nextDouble();
            System.out.println("Digite o valor do segundo produto: ");
            p2 = scanner.nextDouble();
            System.out.println("Digite o valor do terceiro produto: ");
            p3 = scanner.nextDouble();
            System.out.println("Digite o valor do quarto produto: ");
            p4 = scanner.nextDouble();

            // Calculo do desconto de 20%
            vTotal = (p1 + p2 + p3 + p4);
            vDsct = vTotal * 0.2;
            vPago = vTotal * dsct;

            // Formatação dos valores em moeda
            vTotalF = currencyFormat.format(vTotal);
            vDsctF = currencyFormat.format(vDsct);
            vPagoF = currencyFormat.format(vPago);

            System.out.println("a) O valor total da compra sem desconto é: " + vTotalF
                    + "\n b) O valor do desconto é: " + vDsctF
                    + "\n c) Você deverá pagar: " + vPagoF);

        }

    }
}
