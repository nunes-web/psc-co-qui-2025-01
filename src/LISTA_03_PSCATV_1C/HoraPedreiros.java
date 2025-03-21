package LISTA_03_PSCATV_1C;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoraPedreiros {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String horasExecStr;
            int horasExecInt, minExecInt;
            double m2Muro, horasExec, pedreiros, horasBase = 1.152;
            LocalTime horasExecLT;
            DateTimeFormatter horasFormat;

            // Entradas do usuário
            System.out.println("Digite o tamanho do muro em metros quadrados (m²): ");
            m2Muro = scanner.nextDouble();

            System.out.println("\nDigite quantos pedreiros estão disponíveis para a obra: ");
            pedreiros = scanner.nextInt();

            // Calculo de horas para executar o muro
            horasExec = m2Muro / pedreiros * horasBase;

            // Convertendo horasExec para horas e minutos
            horasExecInt = (int) horasExec;
            minExecInt = (int) ((horasExec - horasExecInt) * 60);

            // Criando um objeto LocalTime
            horasExecLT = LocalTime.of(horasExecInt, minExecInt);

            // Formatando a hora
            horasFormat = DateTimeFormatter.ofPattern("HH:mm");
            horasExecStr = horasExecLT.format(horasFormat);

            System.out.println("Com: " + pedreiros
                    + " demorará: " + horasExecStr
                    + " para construir um muro de: " + m2Muro + " m²");

        }
    }

}
