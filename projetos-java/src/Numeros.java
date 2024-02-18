import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int n3 = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        int n4 = sc.nextInt();

        int n5 = n1*n1;
        int n6 = n2*n2;
        int n7 = n3*n3;
        int n8 = n4*n4;

        int n9 = (n5+n6+n7+n8);

        System.out.println("Quadrado do primeiro valor: " + n5);
        System.out.println("Quadrado do segundo valor: " + n6);
        System.out.println("Quadrado do terceiro valor: " + n7);
        System.out.println("Quadrado do quarto valor: " + n8);
        System.out.println("Soma dos quadrados: " + n9);

        sc.close();
    }
}