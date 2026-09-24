/*
Na classe de teste dentro do bloco main, construa duas contas
com o new e compare-as com o ==. E se eles tiverem os mesmos
atributos?
*/

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;
import br.edu.univag.contas.modelo.ContaPoupanca;

class Cap4Ex4 {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();     
        c1.setTitular("Danilo");
        c1.setSaldo(100);
        System.out.println(c1);
    
        Conta c2 = new ContaPoupanca();     
        c2.setTitular("Danilo");
        c2.setSaldo(100);
        System.out.println(c2);
    
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");       
        }
    }
}