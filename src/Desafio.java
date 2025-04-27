import java.util.Scanner;
public class Desafio {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      System.out.print("Digite o seu nome:");
      String nome = entrada.nextLine();

      System.out.println("Conta corrente ou poupança?:");
      String tipoDeConta = entrada.nextLine();
      double saldoConta = 500;
      System.out.println("***********************************************************************************");
      System.out.println("Dados iniciais do cliente:");
      System.out.println("Nome:" + nome);
      System.out.println("Tipo de conta:" + tipoDeConta);
      System.out.println("Saldo disponível: R$:" + saldoConta);
      System.out.println("***********************************************************************************");

      int opcao = 0; // armazenar a escolha
      while (opcao != 4) { //looping das opções

         //Mostrar o menu
         System.out.println("Operações");
         System.out.println("1 - Consultar saldos");
         System.out.println("2 - Receber valor");
         System.out.println("3 - Transferir valor");
         System.out.println("4 - Sair");
         System.out.println("Digite a opção desejada:");
         opcao = entrada.nextInt(); // captura a escolha (um número inteiro)

         if (opcao == 1) {
            System.out.println("O saldo atual é R$:" + saldoConta);

         } else if (opcao == 2) {
            System.out.println("Digite o valor que deseja receber: R$:");
            double valorRecebido = entrada.nextDouble(); // Armazena o valor recebido
            saldoConta += valorRecebido; // atualiza o valor;
            System.out.println("Novo saldo:" + saldoConta);
         } else if (opcao == 3) {
            System.out.print("Digite o valor que deseja transferir: R$: ");
            double valorTransferido = entrada.nextDouble();
            entrada.nextLine(); // <-- Aqui é crucial para limpar o buffer

            if (valorTransferido > saldoConta) {
               System.out.println("Saldo insuficiente para realizar a transferência.");
            } else {
               saldoConta -= valorTransferido;
               System.out.println("Transferência realizada com sucesso.");
               System.out.println("Novo saldo: R$" + saldoConta);
            }
         } else if (opcao == 4) {
            System.out.println("Encerrando o programa. Obrigado por utilizar os nossos serviços!");
         } else {
            System.out.println("Opção inválida. Tente novamente.");
         }
      }
   }
}