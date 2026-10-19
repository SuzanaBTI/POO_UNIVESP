public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- BEM VINDO AO BANCO UNIVESP ---");
        
        // Criar uma Conta Corrente com taxa de 0.15
        ContaCorrente minhaCC = new ContaCorrente(12345, 1000, 0.15);
        System.out.println("Saldo inicial da Conta Corrente: " + minhaCC.consultarSaldo());
        
        minhaCC.fazerDeposito(500);
        System.out.println("Saldo após depósito: " + minhaCC.consultarSaldo());
        
        minhaCC.fazerSaque(100);
        System.out.println("Saldo após saque: " + minhaCC.consultarSaldo());
        
        System.out.println("\n----------------------------------");
        
        // Criar uma Conta Poupança
        ContaPoupanca minhaPoupanca = new ContaPoupanca(98765, 5000);
        System.out.println("Saldo inicial da Poupança: " + minhaPoupanca.consultarSaldo());
        
        minhaPoupanca.fazerDeposito(500); // Não cobra taxa
        System.out.println("Saldo da Poupança após depósito: " + minhaPoupanca.consultarSaldo());
    }
}