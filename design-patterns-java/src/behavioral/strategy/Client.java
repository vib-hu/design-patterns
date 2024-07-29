package patterns.strategy;

import java.util.List;

public class Client {

    public void testStartegyPattern(){
        Discount fixDiscount = new Discount(DiscountType.Fix, 10);
        Discount specialDiscount = new Discount(DiscountType.Percentage, 2);
        Item item1 = new Item(1, "item-1", 20, List.of(fixDiscount, specialDiscount));

        Discount fixDiscount2 = new Discount(DiscountType.Fix, 4);
        Item item2 = new Item(1, "item-2", 25, List.of(fixDiscount2));

        Discount fixDiscount3 = new Discount(DiscountType.None, 0);
        Item item3 = new Item(1, "item-3", 30, List.of(fixDiscount3));

        Discount fixDiscount4  = new Discount(DiscountType.Percentage, 3);
        Item item4 = new Item(1, "item-4", 35, List.of(fixDiscount4));

       Cart cart = new Cart(1);
       cart.addItem(item1);
       cart.addItem(item2);
       cart.addItem(item3);
       cart.addItem(item4);

       cart.applyDiscounts();
       for(Item item : cart.items){
           System.out.println(item.name+" "+item.price);
       }
    }
}
