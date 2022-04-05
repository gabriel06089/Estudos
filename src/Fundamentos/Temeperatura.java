package Fundamentos;

import java.util.Scanner;

public class Temeperatura {
    public static void main(String[] args) {

        Scanner temperaturaF = new Scanner(System.in);
        System.out.println("Digite a Temperatura em Farenheit: ");
        double valor = temperaturaF.nextDouble();

        double converter = (valor - 32) / 1.8;

        System.out.println("O valor em Celcius é: " + converter);
    }
}
