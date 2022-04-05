package AulaProg2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // armazenar varios valores do mesmo tipo
        // tipo[] nomeVariavel = new tipo [5];
        int[] n = new int[100];
 //           "joao","pedro","maria","andre","mario"
        //0,1,2,3,4
        //preenche o Array com um valor
        Arrays.fill(n,-1);

        for (int p = 0;p < n.length; p++){
            System.out.println(n[p]);
        }


        System.out.println(n.length);

    }
}
