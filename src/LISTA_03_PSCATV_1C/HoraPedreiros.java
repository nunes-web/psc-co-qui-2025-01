package LISTA_03_PSCATV_1C;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoraPedreiros {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String horasExecStr;
            int pedreiros, horasIn = 72;
            double m2Muro, horasExec;
            LocalTime horasExecLT;
            DateTimeFormatter horasFormat;

            System.out.println("Digite o tamanho do muro em metros quadrados (m²): ");
            m2Muro = scanner.nextDouble();

            System.out.println("\nDigite quantos pedreiros estão disponíveis para a obra: ");
            pedreiros = scanner.nextInt();

            horasExec = pedreiros * horasIn * m2Muro / 10;

            // Convertendo horasExec para horas e minutos
            int horas = (int) horasExec;
            int minutos = (int) ((horasExec - horas) * 60);

            // Criando um objeto LocalTime
            horasExecLT = LocalTime.of(horas, minutos);

            // Formatando a hora
            horasFormat = DateTimeFormatter.ofPattern("HH:mm");
            horasExecStr = horasExecLT.format(horasFormat);

            System.out.println("Com: " + pedreiros
                    + " demorará: " + horasExecStr
                    + " para construir um muro de: " + m2Muro + " m²");
        }
    }

}
