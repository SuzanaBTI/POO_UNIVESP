public class CarroCorrida extends Carro {

    public CarroCorrida(int velocidadeInicial) {
        super(velocidadeInicial);
    }

    @Override
    public void acelera() {
        this.velocidade += 5;
    }
}