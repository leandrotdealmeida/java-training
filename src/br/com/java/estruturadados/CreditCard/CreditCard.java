package br.com.java.estruturadados.CreditCard;

public class CreditCard {

    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    public CreditCard(String number, String name, String bank, double balance, int limit) {
        this.number = number;
        this.name = name;
        this.bank = bank;
        this.balance = balance;
        this.limit = limit;
    }
    //métodos de acesso
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    //métodos de ação
    public boolean chargeIt(double price) {  //debita
        if(price + balance > (double)limit)
            return false; //não há dinheiro suficiente
        balance += price;
        return true; //Débito efetivado
    }

    public void makePayment(double payment) { //faz um pagamento
        balance -= payment;
    }

    public static void printCard(CreditCard c) { //imprime informacões sobre o cartão

        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance());
        System.out.println("Limit = " + c.getLimit());

    }

}
