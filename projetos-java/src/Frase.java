import java.util.Scanner;

public class Frase {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        String frase;

        System.out.println("Digite sua frase: ");
        frase = sc.next();

        System.out.println(frase.replace("a", "e")); //replace troca a letra

        sc.close();
    }
}