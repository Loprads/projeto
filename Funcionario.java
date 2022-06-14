import java.math.BigDecimal;
import java.util.Scanner;

public class Funcionario extends Usuario {
    protected String nome;
    protected Long cpf;
    protected String funcional;
    protected int salario;

    public int cadastrarsal () {
        int salario;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu salário atual");
        this.salario = scanner.nextInt();
        return this.salario;
    }

    public int calcularplrfunc (){
        int salario;
        salario = this.salario;
        salario = 3 * salario;
        return salario;
    }
    public int calcularferias (){
        int salario;
        salario = this.salario;
        salario = salario / 3 + salario;
        return salario;
    }

    public void setNome() {
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = scanner.next();
        this.nome = nome;
    }
}
