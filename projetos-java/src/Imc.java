import java.util.Locale;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.US); //determina a medida de acordo com o país escolhido
        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;

        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        double imc = (peso/(altura*altura));

        System.out.printf("Seu IMC é : " + "%.2f",imc);

        sc.close();
    }
}