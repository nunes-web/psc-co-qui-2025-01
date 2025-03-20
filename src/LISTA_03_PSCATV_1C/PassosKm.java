package LISTA_03_PSCATV_1C;

import java.util.Scanner;

public class PassosKm {

    public static void main(String[] args) {

        Double km, passos;
        long rpassos;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a distância em quilometros Km:");
            km = scanner.nextDouble();

            passos = km * 1000 / 0.82;
            rpassos = (long) Math.ceil(passos);

            System.out.println("A quantidade de passos para percorrer " + km + " Km, são: " + rpassos + " passo(s)");
        }
    }
}
