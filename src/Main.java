import Banco.ContaCorrente;
public class Main {
    public static void main(String[] args) {
    ContaCorrente pessoa = new ContaCorrente();
    pessoa.setSaldo(3742);
    pessoa.depositar(12258);
    pessoa.sacar(5300);
    pessoa.cobrarTarifaMensal();
    pessoa.consultarSaldo();
    }
}
