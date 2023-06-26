package Classes;

public class DebitCard extends PaymentCard implements ICharge{

    private long accountNumber;
    private int sortCode;
    private double balance;

    public DebitCard(long cardNumber, String expiryDate, int securityNumber, long accountNumber,int sortCode, double balance){
        super(cardNumber,expiryDate, securityNumber,balance);
        this.accountNumber =accountNumber;
        this.sortCode = sortCode;
    }


    public int getSortCode() {
        return sortCode;
    }
    public long getAccountNumber() {
        return accountNumber;
    }



    public void charge(double spendAmount) {
        this.balance-=spendAmount;
    }


    @Override
    public void buyItem(Item item) {
        double price = item.getPrice();
        if(getBalance()>=price){
           setBalance(getBalance()-price);
           addTransaction(item);
        }

    }
}
