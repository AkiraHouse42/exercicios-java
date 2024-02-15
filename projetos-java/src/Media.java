import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Digite dois numeros para o calculo: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        double media = (x + y) / 2;

        System.out.println("A media aritmetica: " + media);

        sc.close();
    }
}