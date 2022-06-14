import java.math.BigDecimal;

public class ContaPJ extends Conta {
    private BigDecimal limiteCredito;

    public void ContaCorrente(Long numeroConta, Integer agencia) {
        this.limiteCredito = BigDecimal.ZERO;
    }

    public ContaPJ(Enum<TipoConta> tipoConta, Long numeroConta, Integer agencia) {
        super(tipoConta, numeroConta, agencia);
    }

    public void setLimiteCredito(BigDecimal limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    public BigDecimal getLimiteCredito(){
        return this.limiteCredito;
    }

    public void pedirLimiteCredito(){
        this.limiteCredito = this.limiteCredito.add(BigDecimal.valueOf(100));
    }

}


