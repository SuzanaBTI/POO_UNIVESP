public abstract class Conta {
    private int nroConta;
    private double saldo;

    public Conta(int nroConta, double monto) {
        this.nroConta = nroConta;
        this.saldo = monto;
    }

    public void fazerDeposito(double monto) {
        this.saldo += monto;
    }

    public boolean fazerSaque(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }

    public final double consultarSaldo() {
        return this.saldo;
    }

    public int getNroConta() {
        return this.nroConta;
    }

    // Assinatura abstrata obrigatória
    public abstract void imprimeExtrato();
}