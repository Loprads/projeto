
public class estagiario extends funcionario {

    public estagiario(int codigoFuncional, String nome, String cargo) {
        super(codigoFuncional, cargo, nome);
    }
    public double calcularPLR() {
        return salario * (2);

    }

    public double calcularFerias() {
        return salario * (1.3);
    }
}