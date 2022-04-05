package Fundamentos.exerciciosCap1;

import java.util.Scanner;

public class DesafioBhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita seu A: ");
        int a = input.nextInt();
        System.out.println("Digita seu B: ");
        int b = input.nextInt();
        System.out.println("Digita seu C: ");
        int c = input.nextInt();

        double delta = Math.pow(b,2) - (4*a*c);

        double bhaskara1 = (-b + Math.sqrt(delta))/(2*a);
        double bhaskara2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("a sua equaçao é a seguinte: " +a+"x²+"+b+"x"+c+"=0"+"\nO seu delta é: "+delta+"\nx1: "+bhaskara1+"\nx2: "+bhaskara2 );


        input.close();
    }
}
