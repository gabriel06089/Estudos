package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNota = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){ //!= difenrente de menos 1
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >=0) {
                total += nota;
                quantidadeDeNota++;
            }
        }
        //calcular a media

        double media = total/quantidadeDeNota;
        System.out.println("Media= " + media);

        entrada.close();
    }
}
