/*
Faça com que sua classe Conta possa receber, opcionalmente, o nome
do titular da Conta durante a criação do objeto.
*/

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;

class Cap5Ex4 {
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