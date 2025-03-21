package PSCATV_1DE;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GratSalario {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Variáveis declaradas da classe
            String payBaseF, payBonusF, payTaxF, payTotalF;
            Double payBase, payBonus, payTax, payTotal;
            Double bonus = 0.05, tax = 0.07;

            Locale country = Locale.getDefault();
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(country);

            // Entrada de dados
            System.out.println("Digite o seu salário: ");
            payBase = scanner.nextDouble();

            // Calculo do salário
            payBonus = payBase * bonus;
            payTax = payBase * tax;
            payTotal = payBase - payBonus - payTax;

            // Formatação dos valores em moeda
            payBaseF = currencyFormat.format(payBase);
            payBonusF = currencyFormat.format(payBonus);
            payTaxF = currencyFormat.format(payTax);
            payTotalF = currencyFormat.format(payTotal);

            // Resultados
            System.out.println("Seu salário é: "
                    + "\nSeu Bonus é: " + payBonusF
                    + "\nsua taxado é: " + payTaxF
                    + "\nSeu salário total é: " + payTotalF);

        }

    }
}
