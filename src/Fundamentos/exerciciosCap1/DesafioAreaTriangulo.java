package Fundamentos.exerciciosCap1;

import java.util.Scanner;

public class DesafioAreaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a base do triangulo? ");
        double base = input.nextDouble();

        System.out.println("Qual a altura do triangulo? ");
        double alt = input.nextDouble();

        double area = (base * alt) /2;

        System.out.println("A area desse triangulo é: "+area);

    }
}
