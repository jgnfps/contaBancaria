package ContaBancaria;

public class ContaImplements implements ContaBancaria {
    private double saldo;
    private double ChequeEspecial;

    //construtor

    public ContaImplements(double saldoInicial) {
        this.saldo = saldoInicial;
        CalcularChequeEspecial(saldoInicial);
    }

    //getters
    public double getSaldo() {
        return saldo;
    }
    public double getChequeEspecial() {

        return ChequeEspecial;
    }


    private double CalcularChequeEspecial(double saldoInicial) {
        if(saldo <= 500){
            ChequeEspecial = 50.0;
        }
        else{
            ChequeEspecial = saldo * 0.5;
        }
        return saldoInicial;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    @Override
    public void consultarChequeEspecial() {
        System.out.println("Cheque Especial: " + ChequeEspecial);
    }

    @Override
    public void depositar(double valor) {
    if(valor > 0){
        saldo += valor;
        System.out.println("Saldo: " + saldo);

    }
    else {
        System.out.println("Valor invalido");
    }
    }

    @Override
    public void sacar(double valor) {
    if(valor > 0 && (saldo + ChequeEspecial) >= valor){
        saldo -= valor;
        System.out.println("Saque de " + valor +" realizado com sucesso");
    }
    else {
        System.out.println("Saldo insuficiente");
    }
    }

    @Override
    public void pagarBoleto(double valor) {
        sacar(valor);
        System.out.println("Boleto de R$ " + valor + " pago com sucesso!");
    }
}
