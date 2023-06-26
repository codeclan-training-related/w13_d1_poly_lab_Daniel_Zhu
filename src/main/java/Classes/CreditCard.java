package Classes;

import java.time.LocalDate;

public class CreditCard extends PaymentCard implements ICharge{
    private int availableCredit;

    public CreditCard(long cardNumber, String expiryDate, int securityNumber,int availableCredit,double balance){
        super(cardNumber,expiryDate,securityNumber,balance);
        this.availableCredit=availableCredit;
    }

    public int getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(int availableCredit) {
        this.availableCredit = availableCredit;
    }

    @Override
    public void charge(double spendAmount) {
        this.balance -=spendAmount;
    }

    @Override
    public void buyItem(Item item) {
        if(item.getPrice()>=this.balance){
            charge(item.getPrice());
            addTransaction(item);
        }

    }


}
