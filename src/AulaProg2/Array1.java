package AulaProg2;

import javax.swing.*;

public class Array1 {
    public static void main(String[] args) {
        String[] op = new String[]{
                "Anime HxH",
                "Serie Game of Thrones",
                "Filme Vingadores",
                "Sair",
        };
        int opescolhida = 0;
        while (opescolhida != 3){
            opescolhida = JOptionPane.showOptionDialog(
                    null,
                    "o que voce deseja assistir?",
                    "Devflix",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    op,
                    0

            );
            System.out.println("Opçao escolhida "+ opescolhida);
        }
    }
}
