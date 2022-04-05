package Fundamentos.exerciciosCap1;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu primeiro numero: ");
        double n1 = input.nextDouble();

        System.out.println("Digite seu segundo numero: ");
        double n2 = input.nextDouble();

        System.out.println("Digite qual sua operaçao +, -, / ou *: ");
        String op = input.next();
        double soma = n1 + n2;
        double sub = n1 - n2;
        double mult = n1 * n2;
        double div = n1 / n2;


        double resultado =  "+".equals(op) ? soma : "-".equals(op) ? sub : "*".equals(op) ? mult : "/".equals(op) ? div : 0;
        System.out.println(n1+" "+op+" "+n2+" "+"= "+resultado);

    }
}
