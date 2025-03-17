package Banco;
// subclasse da conta bancaria
public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 0.997;

    public void cobrarTarifaMensal(){
        setSaldo(getSaldo()*tarifaMensal);
        System.out.println("Tarifa mensal cobrada com sucesso.");
    } // metodo para cobrar uma tarifa mensal em nosso saldo
}
