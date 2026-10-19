public class ContaCorrente extends Conta { // Uso da Herança
    private double taxaMovimentacao;

    public ContaCorrente(int nroConta, double monto, double taxaMovimentacao) {
        super(nroConta, monto); // Chama o construtor da classe mãe
        this.taxaMovimentacao = taxaMovimentacao;
    }

    // Polimorfismo: Sobrescrever o método de depósito para incluir a taxa
    @Override
    public void fazerDeposito(double monto) {
        System.out.println("Será cobrada uma taxa de depósito: " + taxaMovimentacao);
        super.fazerDeposito(monto - taxaMovimentacao); 
    }

    @Override
    public boolean fazerSaque(double monto) {
        System.out.println("Será cobrada uma taxa de saque: " + taxaMovimentacao);
        return super.fazerSaque(monto + taxaMovimentacao);
    }
}