package PSCATV_1DE;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HoraMin {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int minEntradaInt;
            String horasEntradaS, horasEntradaF;
            LocalTime horasEntradaLT;
            DateTimeFormatter horasFormat = DateTimeFormatter.ofPattern("HH:mm");

            // Entradas do usuário com validação
            while (true) {
                System.out.println("Digite o horário formatado (HH:mm): ");
                horasEntradaS = scanner.nextLine();
                try {
                    // Convertendo String para LocalTime
                    horasEntradaLT = LocalTime.parse(horasEntradaS, horasFormat);
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de horário inválido. Por favor, use HH:mm.");
                }
            }

            // Transformando Horas em Minutos
            minEntradaInt = horasEntradaLT.getHour() * 60 + horasEntradaLT.getMinute();

            // Formatando a hora
            horasEntradaF = horasEntradaLT.format(horasFormat);

            System.out.println("Seu horário é: " + horasEntradaF
                    + " o que equivale a: " + minEntradaInt + " minutos");

        }
    }

}
