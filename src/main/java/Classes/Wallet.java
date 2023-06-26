package Classes;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wallet {
    private ICharge selected;
    private ArrayList<ICharge> cardList;
    public Wallet(){
        this.cardList = new ArrayList<>();
        this.selected = null;
    }

    public void setSelected(ICharge selected) {
        this.selected = selected;
    }

    public void pay(ICharge card,Item item){
        card.buyItem(item);
    }

    public void addToCardList(ICharge icharge){
        this.cardList.add(icharge);
    }
}
