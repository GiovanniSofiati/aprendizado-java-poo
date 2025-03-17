package Banco;
// classe pai da aplicacao
public class ContaBancaria {
    private double saldo;

    public void sacar(double valor){
        saldo -= valor;
    } // metodo para sacar um valor que será reduzido no saldo.

    public void depositar(double valor){
        saldo += valor;
    } // metodo para depositar um valor que será adicionado no saldo.

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } // setter para receber e retornar um valor no saldo.

    public double getSaldo() {
        return saldo;
    } // getter para visualizar o saldo protegido.

    public void consultarSaldo(){
        System.out.printf("Saldo = %.2f", saldo);
    } // metodo para consultar saldo.
}
