import java.util.Scanner;

public class CD {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cor desejada: ");
        String cor = sc.nextLine();

        switch (cor) {
            case "verde":
            System.out.println("Voçê deve pagar R$ 10");        
                break;
            case "azul":
            System.out.println("Voçê deve pagar R$ 20");        
                break;
            case "amarelo":
            System.out.println("Voçê deve pagar R$ 30");        
                break;
            case "vermelho":
            System.out.println("Voçê deve pagar R$ 40");        
                break;
            default:
            System.out.println("Não existe essa cor");
                break;
        }

        sc.close();
    }
}