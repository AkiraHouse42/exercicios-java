import java.util.Locale;
import java.util.Scanner;

public class Juros {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Juros simples(JS) // Juros compostos(JC): ");
        String tipo = sc.next();

        if (tipo.equals("JS")) {
            System.out.println("Capital inicial: ");
            double c = sc.nextDouble();
            System.out.println("Taxa de juros(%): ");
            double i = sc.nextDouble();
            System.out.println("Tempo: ");
            double t = sc.nextDouble();

            double porcentagem = i / 100;

            double calculoUm = (c * porcentagem * t);

            double montanteUm = (c + calculoUm);

            System.out.printf("A taxa de juros simples foi de: " + "%.2f",calculoUm);
            System.out.printf(", O Montante foi de: " + "%.2f",montanteUm);
            
        } else {
            System.out.println("Capital inicial: ");
            double c = sc.nextDouble();
            System.out.println("Taxa de juros(%): ");
            double i = sc.nextDouble();
            System.out.println("Tempo: ");
            double t = sc.nextDouble();

            double porcentagem = i / 100;

            double calculoDois = c * Math.pow(1 + porcentagem, t);

            double montanteDois = (c + calculoDois);

            System.out.printf("A taxa de juros simples foi de: " + "%.2f",calculoDois);
            System.out.printf(", O Montante foi de: " + "%.2f",montanteDois);            
        }

        sc.close();

    }
}