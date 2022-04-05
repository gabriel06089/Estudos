package Controle;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        int z = 0;
        double x = 0;
        double y = 0;
        Scanner teste = new Scanner(System.in);




        while (x != -1){

            System.out.println("(digite -1 para sair) Informe a nota: ");
            x = teste.nextDouble();
            if( x <= 10 && x >= 0){
                y += x;
                z++;
            }else if(x != -1){
                System.out.println("Nota invalida!");
            }
        }
        System.out.println("Media: " + y + " " + "Quantidade de notas: " + z );
    }
}
