package Fundamentos.exerciciosCap1;

import java.util.Scanner;

public class DesafioConverssao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu primeiro salario!");
        String salario1 = input.next().replace(",", ".");

        System.out.println("Digite seu segundo salario!");
        String salario2 = input.next().replace(",", ".");

        System.out.println("Digite seu terceiro salario!");
        String salario3 = input.next().replace(",", ".");

        double v1 = Double.parseDouble(salario1);
        double v2 = Double.parseDouble(salario2);
        double v3 = Double.parseDouble(salario3);

        System.out.println("A media salarial é: " + (v1 + v2 + v3)/3);

        input.close();
    }
}
