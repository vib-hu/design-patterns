package patterns.strategy;
import java.util.List;

public class Item {
    int id;
    String name;
    double price;
    List<Discount> discounts;

    public Item(int id,  String name, double price, List<Discount> discounts){
        this.id = id;
        this.name = name;
        this.price = price;
        this.discounts = discounts;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
