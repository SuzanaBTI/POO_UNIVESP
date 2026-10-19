public class Carro {
    // Usamos protected para permitir o acesso direto pela classe filha
    protected int velocidade;

    public Carro(int velocidadeInicial) {
        this.velocidade = velocidadeInicial;
    }

    public void acelera() {
        this.velocidade++;
    }

    public void freia() {
        this.velocidade--;
    }

    public int getVelocidade() {
        return this.velocidade;
    }
}