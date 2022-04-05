package Fundamentos.exerciciosCap1;

import java.util.Scanner;

public class ProgamaQuadradoCubo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor: ");
        double x = input.nextDouble();

        double exp = Math.pow(x,2);
        double exp2 = Math.pow(x,3);

        System.out.println("O valor de x ao quadrado é: " + exp + " e o seu valor ao cubo é: " +exp2);
    }
}
