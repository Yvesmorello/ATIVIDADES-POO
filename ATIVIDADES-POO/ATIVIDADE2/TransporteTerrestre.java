public class TransporteTerrestre extends Transportadora {

    @Override
    public double calculaFrete(int altura, int largura) {
        return (double) (0.2 * (altura / largura));
    }
}
