package lampada;

import java.util.ArrayList;
import java.util.Scanner;

public class LampadaTesteValor {
    public static void main(String[] args) {
        ArrayList<Lampada> lampadas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem vindo a Ferreira Costa!");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Exibir todas as lampadas");
            System.out.println("3 - Exibir quantidade de lampadas cadastradas");
            System.out.println("4 - Consultar quantidade de lampadas de uma determinada potência");
            System.out.println("5 - Exibir a quantidade de lâmpadas acesas e apagadas");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o tipo da lampada:");
                String tipoLampada = sc.next();
                System.out.println("Digite a voltagem da lampada:");
                String voltagemLampada = sc.next();
                System.out.println("Digite a cor da lampada:");
                String corLampada = sc.next();
                System.out.println("Digite a marca da lampada:");
                String marcaLampada = sc.next();
                System.out.println("Digite o preço da lampada:");
                String precoLampada = sc.next();
                System.out.println("Digite a potência da lampada:");
                String potenciaCaneta = sc.next();
                System.out.println("Digite o status da lampada (acessa/apagada):");
                String statusLampada = sc.next();

                Lampada lampada = new Lampada(tipoLampada, voltagemLampada, corLampada, marcaLampada, precoLampada, potenciaCaneta, statusLampada);
                lampadas.add(lampada);                
            } else if (escolha == 2) {
                System.out.println(lampadas);
            } else if (escolha == 3) {
                System.out.println("Quantidade de lampadas cadastradas: "+lampadas.size());
            } else if (escolha == 4) {
                System.out.println("Digite a potência da lampada que você deseja consultar:");
                String potenciaLampada = sc.next();

                int quantidade = 0;
                for (Lampada lampada : lampadas) {
                    if (lampada.getCor().equals(potenciaLampada)) {
                        quantidade++;
                    }
                }

                System.out.println("A quantidade de lampadas de potencia " + potenciaLampada + " é " + quantidade);
                
            } else if(escolha == 5){
                System.out.println("Digite o status da lampada que você deseja consultar:");
                String statusLampada = sc.next();

                int quantidade = 0;
                for (Lampada lampada : lampadas) {
                    if (lampada.getCor().equals(statusLampada)) {
                        quantidade++;
                    }
                }

                System.out.println("A quantidade de lampadas com o status " + statusLampada + " é " + quantidade);
            
            } else {
                System.out.println("Encerrando o programa...");
                break;
            }
        }

        sc.close();
    }
}