package br.com.java.estruturadados.CreditCard;

public class CreditCardTest {

    public static void main(String[] args) {
        CreditCard wallet[]  = new CreditCard[10];
        wallet[0] = new CreditCard("1234 5678 9012 3456", "Joha human", "Clafornia", 0.0,2500);
        wallet[1] = new CreditCard("1234 4324 4444 3444", "Jahpa", "Tocos do Moji", 0.0,3500);
        wallet[2] = new CreditCard("1234 5678 9012 2222", "Reroid", "Clafornia", 0.0,5000);

        for(int i=0; i < 16; i++){
            wallet[0].chargeIt((double)i);
            wallet[1].chargeIt(2.0 * i);
            wallet[2].chargeIt((double)3*i);
        }

        for(int i=0; i < 3; i++) {
            CreditCard.printCard(wallet[i]);
            while(wallet[i].getBalance() > 100.0){
                wallet[i].makePayment(100.0);
                System.out.println("New Balance = " + wallet[i].getBalance());
            }
            System.out.println();
        }
    }
}
