package ContaBancaria;

public interface ContaBancaria {
    void consultarSaldo();
    void consultarChequeEspecial();
    void depositar(double valor);
    void sacar(double valor);
    void pagarBoleto(double valor);
}
