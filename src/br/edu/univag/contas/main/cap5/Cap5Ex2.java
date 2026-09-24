/*
Após deixar os atributos da classe Conta com acesso restrito (privado),
tente criar uma Conta na classe TestaConta dentro do main e modificar ou
ler os atributos da conta criada. O que acontece?
R.: Ocorre erro de compilação dizendo que os atributos possuem acesso privado.

Crie apenas os getters e setters necessários na sua classe Conta.
Pense sempre se é preciso criar cada um deles.

Não copie e cole! Aproveite para praticar a sintaxe. Logo, passaremos
a usar o Eclipse e aí, sim, teremos procedimentos mais simples destinados
a esse tipo de tarefa.

Repare que o método calculaRendimento parece também um getter. Aliás,
seria comum alguém nomeá-lo de getRendimento. Getters não precisam
apenas retornar atributos, eles podem trabalhar com esses dados.
*/

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;

class Cap5Ex2 {
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