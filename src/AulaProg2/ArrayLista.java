package AulaProg2;

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Ana");
        System.out.println(nomes.get(0));
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.contains("Carlos"));
        System.out.println(nomes.contains("Ana"));
        System.out.println(nomes.indexOf("Ana"));
    }
}

