import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Desafio- controle de gastos diarios em um e-commerce");
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int purchaseCount = entrada.nextInt();
        double media;
        double totalSpent = 0.0;
        double valorCompra;

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {

                for(int cont=1; cont <= purchaseCount; cont++){ //itera na quantidade de compras
                    valorCompra = entrada.nextDouble();
                    //lendo os valores das compras
                    totalSpent +=valorCompra ;

                }
            media = totalSpent/purchaseCount;

            System.out.printf("%.2f%n", totalSpent);
            System.out.printf("%.2f%n", media); // TODO: Imprima a média
        }

        entrada.close();
    }
}
