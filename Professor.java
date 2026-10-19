public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, String cpf, int idade, String disciplina, double salario) {
        super(nome, cpf, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() { return this.disciplina; }
    public double getSalario() { return this.salario; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + this.disciplina + " | Salário: R$ " + this.salario);
    }
}