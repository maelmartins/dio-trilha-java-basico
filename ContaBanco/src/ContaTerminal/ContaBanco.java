package ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
   
   public static void main(String[] args) {
       
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
     System.out.println("Digite o seu numero da sua conta:");
     int conta = scanner.nextInt();
     
     System.out.println("Digite sua agência:");
     int agencia = scanner.nextInt();
     
     System.out.println("Digite o Nome do Cliente");
     String nome = scanner.next();
     
     System.out.println("Seu saldo é");
     double saldo = scanner.nextDouble();
     
     System.out.println("Ola," + nome + "obrigado por criar uma conta em nosso banco");
     System.out.println("Sua agência é:"  + agencia);
     System.out.println("Conta numero :"  + conta);
     System.out.println("Seu saldo já está disponível para saque :" + saldo);
     
     
   }
   
}
