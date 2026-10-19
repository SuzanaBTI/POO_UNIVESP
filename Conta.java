public class Conta {
    private int nroConta;
    private double saldo;

    public Conta(int nroConta, double monto) {
        this.nroConta = nroConta;
        this.saldo = monto;
    }

    public void fazerDeposito(double monto) {
        saldo += monto;
    }

    public boolean fazerSaque(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    // Usando final para impedir que o método seja alterado (Regra da aula)
    public final double consultarSaldo() {
        return saldo;
    }
}