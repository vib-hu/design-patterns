package patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    int id;
    ArrayList<Item> items;

    public Cart(int id){
        this.id = id;
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems(){
       return items;
    }

    public void applyDiscounts(){
        for(Item item: items){
            double discountPrice = item.price;
            for(Discount discount: item.discounts){
               DiscountStrategy strategy = DiscountStrategyFactory.getDiscountStrategy(discount.discountType());
                discountPrice =  strategy.applyDiscount(discountPrice, discount);
            }
            item.setPrice(discountPrice);
        }
    }
}
