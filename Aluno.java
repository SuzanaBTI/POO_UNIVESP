public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public String getMatricula() { return this.matricula; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + this.matricula);
    }
}