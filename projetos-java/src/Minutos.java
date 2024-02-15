import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int minutos;

        System.out.println("Digite os minutos gastos: ");
        minutos = sc.nextInt();

        if (minutos == 100) {
            System.out.println("Voçê continua dentro do plano basico");
        } else {
            int dinheiro = (((minutos - 100)*2))+50;
            System.out.println("Voçê deverá pagar " + "R$ " + dinheiro);
        }

        sc.close();

    }
}