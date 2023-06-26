import Classes.DebitCard;
import Classes.Item;
import Classes.PaymentCard;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
//    int cardNumber, LocalDate expiryDate, int securityNumber, int accountNumber,int sortCode

    DebitCard debitCard;
    Item item;
    Item item2;


    @Before
    public void setUp(){
        debitCard= new DebitCard(1234567,"2039-12-12", 2344,987654,998888, 100.00);
        item = new Item("jean",22.00);
        item2 = new Item("gab",60.00);

    }

    @Test
    public void cangetOneTransaction(){
        debitCard.addTransaction(item);
        assertEquals(22.00,debitCard.getOneTransaction(item.getName()),0.0);

    }

    @Test public void canGetTotalTransactions(){
        debitCard.addTransaction(item);
        debitCard.addTransaction(item);
        assertEquals(22.00,debitCard.getOneTransaction(item.getName()),0.0);
    }

    @Test public void canBuyItem(){
        debitCard.buyItem(item2);
        assertEquals(40.00, debitCard.getBalance(),0.00);
        assertEquals(60.00, debitCard.getTotalTransactions(),0.00);


    }





}
