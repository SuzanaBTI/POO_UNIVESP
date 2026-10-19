import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int nroConta, double monto) {
        super(nroConta, monto);
    }

    @Override
    public void imprimeExtrato() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        System.out.println("Conta: " + getNroConta());
        System.out.println("Data-base: " + sdf.format(new Date()));
        System.out.println("Saldo Total: R$ " + consultarSaldo());
        System.out.println("==============================");
    }
}