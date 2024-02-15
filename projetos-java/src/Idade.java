import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Voçê é uma criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Voçê é um adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Voçê é um adulto");
        } else {
            System.out.println("Voçê é um idoso");
        }

        sc.close();
    }
    
}