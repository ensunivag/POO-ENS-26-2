public class Cap3Exf3 {
    /*
    Imprima todos os múltiplos de 3, entre 1 e 100.
    */
    public static void main(String[] args) {
        
        /* // Forma 1: loop while com contador
        int contador = 1;

        while (contador <= 100) {
            if (contador % 3 == 0) {
                System.out.println(contador + " ");
            }
            contador = contador + 1;
        }
        */
        
        // Forma 2: loop while com incremento de 3 em 3
        /*
        int contador = 3;

        while (contador <= 100) {
            System.out.println(contador + " ");
            contador = contador + 3;
        }
        */

        // Forma 3: loop for com incremento de 3 em 3
        for (int contador = 3 ; contador <= 100 ; contador = contador + 3) {
            System.out.println(contador + " ");
        }
    }
}