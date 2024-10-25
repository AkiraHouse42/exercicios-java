package caneta;

import java.util.ArrayList;
import java.util.Scanner;

public class CanetaTesteVetor {
    public static void main(String[] args) {
        ArrayList<Caneta> canetas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem vindo a Bic!");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Exibir todas as canetas");
            System.out.println("3 - Exibir quantidade de canetas cadastradas");
            System.out.println("4 - Consultar quantidade de canetas de uma determinada cor");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o nome da marca:");
                String marcaCaneta = sc.next();
                System.out.println("Digite a cor da caneta:");
                String corCaneta = sc.next();
                System.out.println("Digite o tamanho da caneta:");
                String tamanhoCaneta = sc.next();

                Caneta caneta = new Caneta(marcaCaneta, corCaneta, tamanhoCaneta);
                canetas.add(caneta);
            } else if (escolha == 2) {
                System.out.println(canetas);
            } else if (escolha == 3) {
                System.out.println("Quantidade de canetas cadastradas: "+canetas.size());
            } else if (escolha == 4) {
                System.out.println("Digite a cor da caneta que você deseja consultar:");
                String corCaneta = sc.next();

                int quantidade = 0;
                for (Caneta caneta : canetas) {
                    if (caneta.getCor().equals(corCaneta)) {
                        quantidade++;
                    }
                }

                System.out.println("A quantidade de canetas da cor " + corCaneta + " é " + quantidade);
            } else {
                System.out.println("Encerrando o programa...");
                break;
            }
        }

        sc.close();
    }
}

