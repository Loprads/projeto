
public class gerente extends funcionario {

    public gerente(int codigoFuncional, String nome, String cargo) {
        super(codigoFuncional, cargo, nome);
    }
    public double calcularPLR() {
        return salario * (4);

    }

    public double calcularFerias() {
        return salario * (1.3);
    }
}
