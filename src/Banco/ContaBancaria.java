package Banco;
// classe pai da aplicacao
public class ContaBancaria {
    private double saldo;

    public double sacar(double valor){
        return saldo -= valor;
    } // metodo para sacar um valor que será reduzido no saldo.

    public double depositar(double valor){
        return saldo += valor;
    } // metodo para depositar um valor que será adicionado no saldo.

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } // setter para receber e retornar um valor no saldo.

    public double getSaldo() {
        return saldo;
    } // getter para visualizar o saldo protegido.

    public void consultarSaldo(){
        System.out.println(saldo);
    } // metodo para consultar saldo.
}
