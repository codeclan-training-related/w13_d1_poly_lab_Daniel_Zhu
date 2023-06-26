package Classes;

public class GiftCard implements ICharge{

    private int balance;

    public GiftCard(int balance){
        this.balance =balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void buyItem(Item item) {
        this.balance-= item.getPrice();
    }

    public void charge(double spendAmount){
        this.balance-=spendAmount;
    }




}
