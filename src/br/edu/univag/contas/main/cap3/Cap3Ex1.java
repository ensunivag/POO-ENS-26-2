public class Cap3Ex1 {
    /*
    Na empresa em que trabalhamos, há tabelas com o gasto de cada mês.
    Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
    Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e,
    em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no
    trimestre e a média mensal de gastos.
    */
    public static void main(String[] args) {
        // Muda a localização e idioma para Português Brasileiro
        java.util.Locale.setDefault(java.util.Locale.of("pt", "BR"));

        int gastoTotal; // Preciso calcular
        double mediaMensal; // Preciso calcular também

        // Inicialização (Entrada) dos dados para processar
        int gastoJaneiro = 15_000;
        int gastoFevereiro = 23_000;
        int gastoMarco = 17_000;
        
        // Processamento dos dados
        gastoTotal = gastoJaneiro + gastoFevereiro + gastoMarco;
        mediaMensal = gastoTotal / 3.0;
        
        // Saída dos dados
        System.out.println("Despesa total trimestre: " + gastoTotal);
        System.out.printf("Média mensal de gastos: %.2f", mediaMensal);
    }
}