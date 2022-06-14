import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente(54353L, 455);
        System.out.println("O limite de credito da conta é " + conta.getLimiteCredito());
        conta.deposita(BigDecimal.valueOf(8));
        conta.pedirLimiteCredito();
        System.out.println("O saldo da conta corrente  é " + conta.getSaldo());
        ContaPoupanca contaPoupanca = new ContaPoupanca(7856L, 43);
        contaPoupanca.deposita(BigDecimal.valueOf(100));
        System.out.println("O saldo da minha conta poupança é: " + contaPoupanca.getSaldo());
        contaPoupanca.renderJuros(1.1);
        System.out.println("O saldo da minha conta poupança é: " + contaPoupanca.getSaldo());

        Cliente cliente = new Cliente();
        cliente.setConta(contaPoupanca);
        cliente.setConta(conta);

        System.out.println(cliente.getConta().getClass(0).getNumeroConta());
        System.out.println(cliente.getConta().getClass(1).getNumeroConta());

        cliente.getContaCorrente().getLimiteCredito();

    }
}
