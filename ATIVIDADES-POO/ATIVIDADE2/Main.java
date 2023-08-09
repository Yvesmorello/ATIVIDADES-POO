import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("Digite a altura: ");
        int altura = scanner.nextInt();

        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();

        Transportadora transporteNautico = new TransporteNautico();
        double freteNautico = transporteNautico.calculaFrete(altura, largura);
        System.out.println("Frete Transporte Náutico: R$" + formatDouble(freteNautico));

        Transportadora transporteTerrestre = new TransporteTerrestre();
        double freteTerrestre = transporteTerrestre.calculaFrete(altura, largura);
        System.out.println("Frete Transporte Terrestre: R$" + formatDouble(freteTerrestre));

        scanner.close();
    }
    private static String formatDouble(double value) {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(value);
    }
}


