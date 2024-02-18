import java.util.Scanner;

public class Tipo {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n1 = sc.nextInt();

        if (n1 > 0) {
            System.out.println("Esse valor é positivo");
        } else if (n1 == 0) {
            System.out.println("Esse valor é nulo");
        } else {
            System.out.println("Esse valor é negativo");
        }

        sc.close();
    }
}