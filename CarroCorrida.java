public class CarroCorrida extends Carro {

    public CarroCorrida(int velocidadeInicial) {
        super(velocidadeInicial); // Repassa o valor inicial para o construtor da mãe
    }

    // Polimorfismo: Sobrescrita do método para acelerar com mais potência
    @Override
    public void acelera() {
        this.velocidade += 5;
    }
}