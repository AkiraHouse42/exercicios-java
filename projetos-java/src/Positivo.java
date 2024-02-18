import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("Encerrando o programa...");
                break;
                
            }
        }

        sc.close();
    }
}