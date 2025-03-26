package FichasDeExercicios.Ficha01.Exercicio04.domain;
/*Exercício 4:
        Modele uma conta, isto é, identifica quais informações são importantes.
        ✓ Desenhe tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter:
        ✓ Nome do titular (String);
        ✓ Número (int);
        ✓ Agência (String);
        ✓ Saldo (double); e
        ✓ Data de abertura (String).
        ✓ Além disso, ela deve fazer as seguintes ações:
        ✓ Saca, para retirar um valor do saldo;
        ✓ Deposita, para adicionar um valor ao saldo;
        ✓ CalculaRendimento para devolver o rendimento mensal dessa conta, que é de 10%
           sobre o saldo.
*/
public class Conta {
    // Atributos necessarios
    private String nomeTitular;
    private double saldo;
    private double saque;
    private double deposito;
    private double rend;


    // Metodos Getters e Setters
    public void setNumero(double deposito){
        this.deposito = deposito;
    }
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    public double getDeposito() {
        return deposito;
    }
    public String getNomeTitular(){
        return nomeTitular;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setSaque(double saque){
        this.saque = saque;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setDeposito(double deposito){this.deposito = deposito;}
    public void setRend(double rend){this.rend = rend;}
    public double getRend() {
        return rend;
    }

    public void rendimento(){
        double rend = saldo * 0.1;
        System.out.println(" =====> Funcao Rendimento Mensal <=====");
        System.out.println(" Rendimento Mensal: " + rend);
        System.out.println(" ========== ========== ==========");
    }
    public void sacar(){
        double saldoAnterior = saldo;
        saldo -= saque;
        double saldoActual = saldo;
        if(saldoActual < 0){
            System.out.println(" =====> Funcao Saque <===== ");
            System.out.println(" Saldo na conta ==> " + saldoAnterior);
            System.out.println(" Valor que pretende retirar ==> " + saque);
            System.out.println("Saldo Insuficiente, por favor recarregue a sua conta!");
            System.out.println(" ========== ========== ==========");
        }else {
            System.out.println(" =====> Funcao Saque <===== ");
            System.out.println(" Saldo antes do saque ==> " + saldoAnterior);
            System.out.println(" Saldo depois do saque ==> " + saldoActual);
            System.out.println(" Valor retirado ==> " + saque);
            System.out.println(" ========== ========== ==========");
        }
    }
    public void deposito(){
        System.out.println(" =====> Funcao de Deposito <=====");
        double saldoAnterior = saldo;
        saldo += deposito;
        double saldoActual = saldo;
        System.out.println(" Saldo antes do deposito ==> " + saldoAnterior);
        System.out.println(" Saldo depois do deposito ==> " + saldoActual);
        System.out.println(" Valor depositado ==> " + deposito);
        System.out.println(" ========== ========== ==========");
    }
}
