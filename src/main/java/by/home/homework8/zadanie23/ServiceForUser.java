package by.home.homework8.zadanie23;


import java.io.IOException;

public class ServiceForUser implements AtmInterface {
    //Создал объект класса  Storage
    Storage storage = new Storage();

    //Создал объект класса  Card
    Card card = new Card();

    FileBalanceCard balance = new FileBalanceCard();

    //method - add money on Card
    public int addMoney (int giveMoney){
        card.setCardbalance(card.getCardbalance() + giveMoney);
        System.out.println("Operation has been successful ");
        return card.getCardbalance();
    }

    //method - take money in ATM
    public int withdrawMoney (int takeMoney){
        if (takeMoney % 10 == 0 && takeMoney != 10 && takeMoney != 30){
            if (storage.getBalanceAtm() >= takeMoney){
                if (card.getCardbalance() >= takeMoney) {
                    storage.setBalanceAtm(storage.getBalanceAtm() - takeMoney);
                    card.setCardbalance(card.getCardbalance() - takeMoney);
                    System.out.println("Operation has been successful ");
                    System.out.println(card.getCardbalance()  + " остаток карта");
                    System.out.println(storage.getBalanceAtm()+ " остаток АТМ");
                }else {
                    System.out.println("You don't have enough money :-)");
                }
            }else {
                System.out.println("Sorry!!! ATM hasn't enough money");
            }

        }else {
            System.out.println("Incorrect input of sum. We have banknotes: 100, 50, 20");
        }
        return storage.getBalanceAtm();
    }

    //method for balanceCard
    public void balance () throws IOException {
        System.out.println("Card balance: " + card.getCardbalance());


    }
    public void balanceatm (){
        System.out.println("ATM balance: " + storage.getBalanceAtm());

    }


}
