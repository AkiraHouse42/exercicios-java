import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Voçê é menor de idade");
        } else {
            System.out.println("Voçê é maior de idade");
        }

        sc.close();
    }
}