import java.util.Scanner;
import java.text.NumberFormat;

public class Operadores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;

        System.out.println("Digite o primeiro valor!");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor!");
        b = scan.nextDouble();

        double verificacaoDeResto = verificacaoDeResto(a, b);

        System.out.println("Sobra: " + NumberFormat.getCurrencyInstance().format(verificacaoDeResto));
        System.out.println("Hello world!");
    }
    public static double verificacaoDeResto(double a, double b) {
        return a % b;
    }
}