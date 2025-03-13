package entity;

public class Conta {
    public int numeroConta;
    public String agencia;
    public String nomeCliente;
    public double saldo;


    public String exibirDados() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n" +
               "Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$ " + saldo;
    }
}
