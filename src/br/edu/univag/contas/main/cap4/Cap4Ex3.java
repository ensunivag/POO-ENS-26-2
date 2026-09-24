import br.edu.univag.contas.modelo.Conta;
import br.edu.univag.contas.modelo.ContaPoupanca;

class Cap4Ex3 {
    public static void main(String[] args) {
        Conta conta = new ContaPoupanca();
        conta.setTitular("Duke");
        conta.setNumero(852);
        conta.setAgencia("1234-X");
        conta.setSaldo(1500);
        conta.setDataAbertura("27/08/2026");

        conta.depositar(50);
        System.out.println(conta.recuperarDadosParaImpressao());

        conta.sacar(45);
        System.out.println("Saldo atual: " + conta.getSaldo());

        double rendimento = conta.calcularRendimento();
        System.out.println("Rendimento: " + rendimento);
    }
}