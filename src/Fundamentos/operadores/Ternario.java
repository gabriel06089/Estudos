package Fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 3.6;
//        String resultadaoParcial = ;
        String resultadoFinal = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "em recuperaçao" : "reprovado";
        System.out.println("O akluno esta " +resultadoFinal);

        double nota = 9.6;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >=7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "sim" : "nao";

        System.out.println("Tem desconto? " + "\n" +resultado);
    }
}
