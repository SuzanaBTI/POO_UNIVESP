public class App {
    public static void main(String[] args) {
        // ==========================================
        // 1. TESTE DO SISTEMA BANCÁRIO (SEMANA 3)
        // ==========================================
        System.out.println("--- BEM VINDO AO BANCO UNIVESP ---");

        // Conta Corrente: número (1), saldo (1000.0) e taxa (0.15)
        ContaCorrente cc = new ContaCorrente(1, 1000.0, 0.15);
        System.out.println("Saldo inicial da Conta Corrente: " + cc.consultarSaldo());
        cc.fazerDeposito(500.0);
        System.out.println("Saldo após depósito: " + cc.consultarSaldo());
        cc.fazerSaque(100.0);
        System.out.println("Saldo após saque: " + cc.consultarSaldo());

        System.out.println("----------------------------------");

        // Conta Poupança: número (2) e saldo (5000.0)
        ContaPoupanca cp = new ContaPoupanca(2, 5000.0);
        System.out.println("Saldo inicial da Poupança: " + cp.consultarSaldo());
        cp.fazerDeposito(500.0);
        System.out.println("Saldo da Poupança após depósito: " + cp.consultarSaldo());

        // ==========================================
        // 2. TESTE DOS CARROS (HERANÇA E POLIMORFISMO)
        // ==========================================
        System.out.println("\n=== TESTE DE ACELERAÇÃO: CARROS ===");

        // Carro comum: acelera de 1 em 1 km/h
        Carro carroComum = new Carro(0);
        carroComum.acelera();
        carroComum.acelera();
        System.out.println("Velocidade do Carro Comum: " + carroComum.getVelocidade() + " km/h");

        // Carro de corrida: acelera de 5 em 5 km/h
        CarroCorrida formula1 = new CarroCorrida(0);
        formula1.acelera();
        formula1.acelera();
        System.out.println("Velocidade do Carro de Corrida: " + formula1.getVelocidade() + " km/h");
    }
}