package LISTA_03_PSCATV_1C;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AnosDias {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataNascIn;
            int idadeDias;
            LocalDate dataNasc;
            LocalDate dataAtual = LocalDate.now();
            Period idade;

            while (true) {
                System.out.print("Digite o ano de nascimento (DD/MM/YYYY): ");
                dataNascIn = scanner.nextLine();
                try {
                    dataNasc = LocalDate.parse(dataNascIn, dataFormat);
                    break;
                } catch (DateTimeParseException e) {

                    System.out.println("Formato de data inválido. Por favor, use DD/MM/YYYY...");
                }

            }

            idade = Period.between(dataNasc, dataAtual);
            idadeDias = (int) ChronoUnit.DAYS.between(dataNasc, dataAtual);

            System.out.println("\nVocê tem: " + idade.getYears() + " ano(s) desde que nasceu!\n"
                    + "Isso significa que você tem: " + idadeDias + " dias desde que nasceu!");

        }
    }
}
