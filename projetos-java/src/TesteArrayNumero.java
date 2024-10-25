import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayNumero {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros:");
        
        for(int i = 0; i <= 10; i++){
            int digito = sc.nextInt();
            numeros.add(digito);
        }

        if (numeros.contains(10) || numeros.contains(100) || numeros.contains(1000)) {
            System.out.println("Acaba de ganhar um bonus de 50 reais");
        }

        sc.close();
    }
}