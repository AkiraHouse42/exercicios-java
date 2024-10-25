package controle;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
ArrayList<String> ar = new ArrayList<>();
Scanner sc = new Scanner(System.in);
while (true) {
System.out.println("\nBem vindo as Casas Bahia!");
System.out.println("1 - Cadastro");
System.out.println("2 - Relatório");
System.out.println("3 - Sair");
System.out.println("Escolha uma opção:");
int escolha = sc.nextInt();
if (escolha == 1) {
System.out.println("Qual o modelo escolhido (Splinter ou Portatil):");

String modelos = sc.next();
if (modelos.equalsIgnoreCase("Splinter")) {
System.out.println("Digite o codigo:");
String codSplinter = sc.next();
System.out.println("Digite a marca:");
String marcaSplinter = sc.next();
System.out.println("Digite o BTU:");
String btuSplinter = sc.next();
System.out.println("Existem Defeito?(S/N)");
String defeitoSplinter = sc.next();
System.out.println("Se sim, qual o defeito? (Resuma em uma palavra)");

String tipodefeitoSplinter = sc.next();
System.out.println("Digite o tipo:");
String tipoSplinter = sc.next();
System.out.println("Digite o tamanho:");
String tamanhoSplinter = sc.next();

Splinter splinter = new Splinter(codSplinter,
marcaSplinter, btuSplinter, defeitoSplinter, tipodefeitoSplinter,
tipoSplinter, tamanhoSplinter);

System.out.println("Informações do produto:");
splinter.toString();
ar.add(splinter.toString());

} else{
System.out.println("Digite o codigo:");
String codSplinter = sc.next();
System.out.println("Digite a marca:");
String marcaSplinter = sc.next();
System.out.println("Digite o BTU:");
String btuSplinter = sc.next();
System.out.println("Existem Defeito?(S/N)");
String defeitoSplinter = sc.next();
System.out.println("Se sim, qual o defeito? (Resuma em uma palavra)");

String tipodefeitoSplinter = sc.next();
System.out.println("Digite a voltagem:");
String voltagemSplinter = sc.next();
System.out.println("Digite a cor:");
String corSplinter = sc.next();

Portatil portatil = new Portatil(codSplinter,
marcaSplinter, btuSplinter, defeitoSplinter, tipodefeitoSplinter,
voltagemSplinter, corSplinter);

System.out.println("Informações do produto:");
portatil.toString();
ar.add(portatil.toString());

}
} else if(escolha==2) {
System.out.print(ar);
} else{
System.out.println("Encerrando o programa...");
break;
}
}
sc.close();
}
}
