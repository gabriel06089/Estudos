package Fundamentos.exerciciosCap1;

public class DesafioLogico {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1^trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        // Opredor Unario
        boolean maisSaudavel = !comprouSorvete;

        //Operador Binario
        System.out.println("comprou tv 50\"?" + comprouTv50);
        System.out.println("comprou tv 32\"?" + comprouTv32);
        System.out.println("comprou tv 32\"Sorvete?" + comprouSorvete);

        System.out.println("Mais Saudavel? " + !comprouSorvete);
    }
}
