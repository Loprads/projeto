import java.math.BigDecimal;

public class Conta {
 protected Enum<TipoConta> tipoConta;
 protected Long numeroConta;
 protected Integer agencia;
 protected BigDecimal saldo;

 public Conta() {
 }

 public Conta(Enum<TipoConta> tipoConta, Long numeroConta, Integer agencia) {
  this.tipoConta = tipoConta;
  this.numeroConta = numeroConta;
  this.agencia = agencia;
  this.saldo = BigDecimal.ZERO;
 }

 public Conta(Long numeroConta, Integer agencia) {
  this.numeroConta = numeroConta;
  this.agencia = agencia;
  this.saldo = BigDecimal.ZERO;
 }


 public Long getNumeroConta() {
  return this.numeroConta;
 }

 public void setNumeroConta(Long numeroConta) {
  this.numeroConta = numeroConta;
 }

 public Integer getAgencia() {
  return this.agencia;
 }

 public void setAgencia(Integer agencia) {
  this.agencia = agencia;
 }

 public BigDecimal getSaldo() {
  return this.saldo;
 }

 public void setSaldo(BigDecimal saldo) {
  this.saldo = saldo;

 }

 public BigDecimal deposita(BigDecimal valor) {
  this.saldo = this.saldo.add(valor);
  return this.saldo;
 }

 public BigDecimal saque(BigDecimal valor) {
  if (this.saldo.compareTo(valor) <= 0) {
   System.out.println("Você não tem saldo suficiente para sacar " + valor + " reais. Seu saldo atual é de: " + this.saldo + " reais.");
   return this.saldo;
  } else {
   this.saldo = this.saldo.subtract(valor);
   System.out.println("Você sacou " + valor + " reais!");
   return this.saldo;
  }
 }

 public BigDecimal transferencia(BigDecimal valor) {
  if (this.saldo.compareTo(valor) <= 0) {
   System.out.println("Você não tem saldo suficiente para transferir " + valor + " reais. Seu saldo atual é de: " + this.saldo + " reais.");
   return this.saldo;
  } else {
   this.saldo = this.saldo.subtract(valor);
   System.out.println("Você transferiu " + valor + " reais!");
   return this.saldo;
  }
 }
}