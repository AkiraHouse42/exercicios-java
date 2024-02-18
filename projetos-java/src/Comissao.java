import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        double comissao = 0.05;
        
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o codigo: ");
        int codigo = sc.nextInt();
        System.out.println("Digite o nome do produto: ");
        String produto = sc.next();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.println("Digite a quantidade vendida: ");
        double quantidade = sc.nextDouble();

        double parte = (valor*quantidade*comissao);

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome do produto: " + produto);
        System.out.println("Numero do codigo: " + codigo);
        System.out.println("Quantidade vendida: " + quantidade);
        System.out.println("A comissão recebida foi R$: " + parte);

        sc.close();

    }
}