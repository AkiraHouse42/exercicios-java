import java.util.Locale;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("O primeiro numero é maior que o segundo numero");
        } else {
            System.out.println("O segundo numero é maior que o primeiro numero");
        }

        sc.close();
    }
}