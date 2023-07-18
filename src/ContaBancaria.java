import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Gustavo Macedo";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("******************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
        System.out.println("\n******************");


        int opcao = 0;
        double saldoAtualizado = saldoInicial;

        while(opcao != 4){
            System.out.println("\nOperações");
            System.out.println("1 - Consultar Valor");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("\nDigite a opção Desejada: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    opcao = 1;
                    System.out.println("O Saldo atual é R$" + saldoAtualizado);
                    break;
                case 2:
                    opcao = 2;
                    System.out.println("Informe o valor a receber: ");
                    int deposito = sc.nextInt();
                    saldoAtualizado += deposito;
                    System.out.println("\nSaldo atualizado: R$" + saldoAtualizado);
                    break;
                case 3:
                    opcao = 3;
                    System.out.println("Informe o valor que deseja transferir: ");
                    int transferencia = sc.nextInt();
                    if (saldoAtualizado < transferencia){
                        System.out.println("Não há saldo para fazer a transferência");
                    }else {
                        saldoAtualizado -= transferencia;
                        System.out.println("\nSaldo atualizado: R$ " + saldoAtualizado);
                        break;
                    }
            }
        }





    }
}