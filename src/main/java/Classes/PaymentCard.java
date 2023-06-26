package Classes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class PaymentCard{
    private long CardNumber;
    private String ExpiryDate;
//    yy-mm-dd

    private int SecurityNumber;
    double balance;

    private HashMap<String,Double> transactions;

    public PaymentCard(long cardNumber,String expiryDate, int securityNumber, double balance ){
        this.CardNumber=cardNumber;
        this.ExpiryDate = expiryDate;
        this.SecurityNumber = securityNumber;
        this.balance =balance;
        this.transactions =new HashMap<>();

    }

    public long getCardNumber() {
        return CardNumber;
    }

    public int getSecurityNumber() {
        return SecurityNumber;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public HashMap<String, Double> getTransactions() {
        return transactions;
    }


//    public void addTransaction(Item item){
//        transactions.put(item.getName(), item.getPrice());
//    }


    public void addTransaction(Item item){
        transactions.put(item.getName(), item.getPrice());
    }

    public abstract void buyItem(Item item);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOneTransaction(String item){
        return this.transactions.get(item);
    }

    public double getTotalTransactions(){
       double total = 0.00;
       for (double transaction: transactions.values()){
           System.out.println(transaction);
           total+=transaction;
//           might be an error;
       }
       return total;



    }

}
