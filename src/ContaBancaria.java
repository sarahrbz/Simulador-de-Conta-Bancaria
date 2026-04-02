public class ContaBancaria {
    private double saldo; // variavel saldo

    private double chequeEspecial; // variavel cheque especial

    private double limiteChequeEspecial;// variavel do limite do cheque

    private boolean usandoCheque; // variavel que verifica o uso do cheque


    public ContaBancaria(double depositoInicial){ //constructor da conta bancária
        this.saldo = depositoInicial; // "este saldo é referente ao deposito inicial

        if(depositoInicial <= 500){ //se o deposito inicial for menor que R$500,00
            this.limiteChequeEspecial = 50;//o valor do cheque especial será de R$50,00
        }
        else{ // se não
            this.limiteChequeEspecial = depositoInicial * 0.5; //o valor do cheque será referente a 50% do valor inicial depositado
        }

        this.chequeEspecial = limiteChequeEspecial; // o valor do cheque especial se inicia com o valor inteiro do limite estabelecido no primeiro deposito
        this.usandoCheque = false; // é falso pois a pessoa ainda não está usando o cheque
    }

    public void consultarSaldo(){ // metodo que consulta o saldo
        System.out.println("Saldo: R$ " + saldo);
    }

    public void consultarChequeEspecial(){ // metodo que consulta o limite e o valor disponível no cheque especial
        System.out.println("Limite do cheque especial: R$ " + limiteChequeEspecial);
        System.out.println("Limite disponível do cheque especial: R$ " + chequeEspecial);
    }

    public void depositar(double valor){ // metodo para depositar o valor que a pessoa deseja depositar
        saldo += valor; // o valor depositado é somado ao saldo já existente

        if(usandoCheque){ // caso o cheque especial esteja sendo usado (se true)
            double taxa = (limiteChequeEspecial - chequeEspecial) * 0.2; // vai ser calculado a taxa referente ao uso do cheque especial
            saldo -= taxa; // debita da conta o valor da taxa
            chequeEspecial = limiteChequeEspecial; // cheque especial volta a ter o valor inteiro do limite
            usandoCheque = false; // passa a ser falso pois já foi paga a taxa do uso do cheque especial

            System.out.println("Taxa de cheque especial cobrada: R$ " + taxa); // exibe o valor da taxa
        }

    }

    public void sacar(double valor){ // metodo sacar
        if(valor <= saldo){ //se o valor for menor ou igual ao saldo disponível, irá ser debitado da conta o valor desejado
            saldo -= valor;
        } else { // se não
            double restante = valor - saldo; // calcula quanto falta depois de já utilizar o saldo disponível

            if(restante <= chequeEspecial){ // se o restante for menor ou igual ao cheque
                chequeEspecial -= restante; // vai debitar do cheque o valor que falta
                usandoCheque = true; // a utilização do cheque passa a ser true, visto que precisou utilizar o cheque
            } else {
                System.out.println("Saldo insuficiente!"); // caso o valor seja maior que o cheque
            }
        }

    }

    public void pagarBoleto(double valor){ // metodo pagar boleto
        sacar(valor); //chama o metodo sacar
    }

    public void verificarUsoChequeEspecial(){ // metodo verifica o uso do cheque
        if(usandoCheque){
            System.out.println("Está usando cheque especial.");
        } else{
            System.out.println("Não está usando cheque especial.");
        }
    }



}
