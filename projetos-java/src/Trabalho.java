import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        double f;
        double d;

        System.out.println("Digite o tamanho da força: ");
        f = sc.nextDouble();
        System.out.println("Digite a distancia pecorrida: ");
        d = sc.nextDouble();

        double t = f*d;

        System.out.println("O Trabalho realizado será: " + t);

        sc.close();

    }
}