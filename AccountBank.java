import java.util.Scanner;

public class AccountBank {
    public static void main(String[] args) {
        // visualizar dados do cliente
        String nome = "Pedro Matheus Lima da Cruz";
        String cpf = "08407116386";
        int idade = 22;
        String tipoConta = "Corrente";
        double saldo = 2500;

        System.out.println("****************************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Documento: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("****************************************");

        // menu de opções

        String Menu = """
                Operações:

                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;
        System.out.println(Menu);

        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha sua opção: ");
        int opcao = leitura.nextInt();

        while (opcao > 4) {
            System.out.println("Opção Inválida");
            System.out.println(Menu);
            opcao = leitura.nextInt();
        }

        // logica
        if (opcao == 1) {
            System.out.println(saldo);
        } else if (opcao == 2) {
            System.out.println("Qual valor que vai receber? ");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("Esse é seu valor atualizado " + saldo);
        } else if (opcao == 3) {
            System.out.println("Qual a quantia que quer transferir? ");
            double valor = leitura.nextDouble();
            if (valor > saldo) {
                System.out.println("Saldo insuficiente");
                System.out.println("Seu saldo atual é: " + saldo);
            } else {
                saldo -= valor;
                System.out.println("Esse é seu valor atualizado: " + saldo);
            }
        } else if (opcao == 4) {
            System.exit(0);
        }

    }
}
