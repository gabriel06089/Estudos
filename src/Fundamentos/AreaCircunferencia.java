package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        int raio = 3;
        double raio1 =3.4;
        final double pi = 3.14159;

        double area = pi * raio1 * raio1;

        raio = 10;
        area = pi * raio1 * raio1;
        System.out.println("Area =" + area + "m2.");

        System.out.println(area);
    }

}
