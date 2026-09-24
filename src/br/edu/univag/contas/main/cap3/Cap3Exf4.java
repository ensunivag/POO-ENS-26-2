public class Cap3Exf4 {
    //Imprima os fatoriais de 1 a 10.
    public static void main(String[] args) {
        java.math.BigInteger fatorial = java.math.BigInteger.ONE;

        for (int n = 1; n <= 40; n++) {
            fatorial = fatorial.multiply(java.math.BigInteger.valueOf(n));
            System.out.printf("fat(%d) = %d%n", n, fatorial);
        }
    }
}