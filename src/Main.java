import java.util.Scanner;

void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // criamos um objeto para ler os valores digitados pelo user

    System.out.println("Digite o depósito inicial: ");
    double depositoInicial = scanner.nextDouble(); // vai ler o valor digitado pelo user

    ContaBancaria conta = new ContaBancaria(depositoInicial); // cria uma conta com base no depósito inicial

    int opcao;

    do{ //vai executar todo o codigo abaixo enquanto a condição do final for verdadeira
        System.out.println("\n=== MENU ==="); //aqui é apresentada as opções
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Pagar boleto");
        System.out.println("6 - Verificar uso do cheque especial");
        System.out.println("0 - Sair");

        opcao = scanner.nextInt(); // lê a opção digitada pelo usuário

        switch (opcao){ // de acordo com a opção digitada pelo usuário, vai entrar em um case
            case 1:
                conta.consultarSaldo(); // chama o metodo consultar saldo
                break;
            case 2:
                conta.consultarChequeEspecial();
                break;
            case 3:
                System.out.println("Valor: "); // colocamos um println para que o usuario entenda que é para ele inserir o valor
                conta.depositar(scanner.nextDouble()); // chama o método depositar da classe conta e lê o valor digitado pelo usuário
                break;
            case 4:
                System.out.println("Valor: ");
                conta.sacar(scanner.nextDouble());
                break;
            case 5:
                System.out.println("Valor: ");
                conta.pagarBoleto(scanner.nextDouble());
                break;
            case 6:
                conta.verificarUsoChequeEspecial();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    } while (opcao != 0); // condição que faz o codigo continuar rodadando, quando ela for falsa, para a execução

    scanner.close();
}
