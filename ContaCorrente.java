import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {
    private double taxaMovimentacao;

    public ContaCorrente(int nroConta, double monto, double taxaMovimentacao) {
        super(nroConta, monto);
        this.taxaMovimentacao = taxaMovimentacao;
    }

    @Override
    public void fazerDeposito(double monto) {
        super.fazerDeposito(monto - this.taxaMovimentacao);
    }

    @Override
    public boolean fazerSaque(double monto) {
        return super.fazerSaque(monto + this.taxaMovimentacao);
    }

    @Override
    public void imprimeExtrato() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        System.out.println("Conta: " + getNroConta());
        System.out.println("Data: " + sdf.format(new Date()));
        System.out.println("Taxa: R$ " + this.taxaMovimentacao);
        System.out.println("Saldo Líquido: R$ " + consultarSaldo());
        System.out.println("==============================");
    }
}