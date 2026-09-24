/*
Agora, crie duas referências para a mesma conta e compare-as
com o ==. Tire suas conclusões. A fim de criar duas referências
para a mesma conta.

O que acontece com o if do exercício anterior?
*/

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;

class Cap4Ex5 {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();     
        c1.setTitular("Danilo");
        c1.setSaldo(100);
        System.out.println(c1);
    
         Conta c2 = c1;
         c2.setSaldo(200);
         System.out.println(c2);

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");       
        }
    }
}