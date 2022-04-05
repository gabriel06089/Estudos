package Fundamentos;

public class CoversaoDeTiposPrimitivos {
    public static void main(String[] args) {
        double a = 1; //implicita
        System.out.println(a);

        float b = (float) 1.2345; //explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; //explicita (CAST)
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e; //explicita (CAST)
        System.out.println(f);
    }
}
