package br.edu.univag.contas;

import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaCorrente;
import br.edu.univag.contas.modelo.ContaPoupanca;

public class ManipuladorDeContas {

    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void criaConta(){
        criaConta("Batman", 56789, "1234", "ContaCorrente");
    }

    public void criaConta(String titular, int numero, String agencia, String tipo){
        if ("ContaCorrente".equals(tipo)) {
            this.conta = new ContaCorrente();
        } else {
            this.conta = new ContaPoupanca();
        }
        this.conta.setTitular(titular);
        this.conta.setAgencia(agencia);
        this.conta.setNumero(numero);
    }
    
    public void deposita(double valor){
        this.conta.depositar(valor);
    }
    
    public boolean saca(double valor){
        return this.conta.sacar(valor);
    }
    
    public void transfere(Conta destino, double valor) {
        conta.transferir(destino, valor);
    }
}