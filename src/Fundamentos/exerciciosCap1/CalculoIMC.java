package Fundamentos.exerciciosCap1;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura em cm: ");
        double alt = input.nextDouble();

        System.out.println(("Digite seu peso: "));
        double peso = input.nextDouble();

        double IMC = peso / (alt*alt);

        System.out.println("Seu IMC é: " +IMC);


    }
}
