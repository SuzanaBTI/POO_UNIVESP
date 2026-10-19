public class App {
    public static void main(String[] args) {
        // ==========================================
        // 1. SISTEMA BANCÁRIO (CLASSES ABSTRATAS)
        // ==========================================
        System.out.println("--- 1. TESTE DO SISTEMA BANCÁRIO ---");
        
        Conta cc = new ContaCorrente(101, 1000.0, 0.15);
        Conta cp = new ContaPoupanca(202, 5000.0);

        cc.fazerDeposito(500.0);
        cc.fazerSaque(100.0);
        cp.fazerDeposito(500.0);

        cc.imprimeExtrato();
        System.out.println();
        cp.imprimeExtrato();

        // ==========================================
        // 2. SIMULADOR AUTOMOTIVO (POLIMORFISMO)
        // ==========================================
        System.out.println("\n--- 2. TESTE DOS AUTOMÓVEIS ---");

        Carro carroComum = new Carro(0);
        carroComum.acelera();
        carroComum.acelera();
        System.out.println("Velocidade do Carro Comum: " + carroComum.getVelocidade() + " km/h");

        CarroCorrida formula1 = new CarroCorrida(0);
        formula1.acelera();
        formula1.acelera();
        System.out.println("Velocidade do Carro de Corrida: " + formula1.getVelocidade() + " km/h");

        // ==========================================
        // 3. HIERARQUIA ESCOLAR (SUPER E CONSTRUTORES)
        // ==========================================
        System.out.println("\n--- 3. TESTE DA HIERARQUIA ESCOLAR ---");

        Aluno aluno = new Aluno("Suzana", "123.456.789-00", 25, "UNIVESP-BTI-2026");
        Professor professor = new Professor("Júlio Estrella", "987.654.321-11", 45, "COM230 - POO", 8500.0);

        aluno.exibirDados();
        System.out.println();
        professor.exibirDados();
    }
}