import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int clieorfunc;
        int coroupoup;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja abrir uma conta ou é novo funcionário? Digite 1 para conta, 2 para funcionário e 3 para cancelar: ");
        clieorfunc = scanner.nextInt();

        if (clieorfunc == 1) {
            Cliente cliente = new Cliente("Ygor", 37661697010L, LocalDate.of(1996, 04, 25), 45027119852L);
            cliente.cadastrarsenha();
            System.out.println("Deseja abrir uma conta corrente ou poupança? Digite 1 para corrente e 2 para poupança e 3 para cancelar:");
            coroupoup = scanner.nextInt();


            if (coroupoup == 1){
                if (cliente.validarsenha() == true) {
                    ContaCorrente conta = new ContaCorrente(93L, 18454);
                    conta.deposita(BigDecimal.valueOf(8));
                    System.out.println("O saldo da conta corrente é " + conta.getSaldo());
                    conta.saque(BigDecimal.valueOf(12000));
                    conta.transferencia(BigDecimal.valueOf(5));
                    System.out.println("O saldo da conta corrente é " + conta.getSaldo());
                    conta.pedirLimiteCredito();
                } else {
                    System.out.println("Acesso negado! ");
                }

            } else if (coroupoup == 2) {
                if (cliente.validarsenha() == true) {
                    ContaPoupanca contapoup = new ContaPoupanca(930L, 184540);
                    contapoup.deposita(BigDecimal.valueOf(100));
                    System.out.println("O saldo da conta poupança é " + contapoup.getSaldo());
                    contapoup.saque(BigDecimal.valueOf(10));
                    contapoup.transferencia(BigDecimal.valueOf(500));
                    contapoup.renderJuros(1.10);
                    System.out.println("O saldo da conta poupança é " + contapoup.getSaldo() + "Após render juros");

                } else {
                    System.out.println("Acesso negado! ");
                }

            } else if (coroupoup == 3){
                System.out.println("Cancelei a execução! ");
            } else {
                System.out.println("Você ERRROOU! não te quero como cliente ");
            }
        } else if (clieorfunc == 2) {
            Funcionario funcionario = new Funcionario();
            funcionario.cadastrarsenha();
            if (funcionario.validarsenha() == true) {
                funcionario.setNome();
                funcionario.cadastrarsal();
                System.out.println("Sua PLR é de: " + funcionario.calcularplrfunc());
                System.out.println("Valor de suas férias: " + funcionario.calcularferias() + " exceto impostos");

            }
        } else if (clieorfunc == 3){
            System.out.println("Cancelei a execução! ");
        } else {
            System.out.println("Você errou! ");
        }




        }
    }
