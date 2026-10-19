public class Carro {
    protected int velocidade;

    public Carro(int velocidadeInicial) {
        this.velocidade = velocidadeInicial;
    }

    public void acelera() {
        this.velocidade += 1;
    }

    public int getVelocidade() {
        return this.velocidade;
    }
}