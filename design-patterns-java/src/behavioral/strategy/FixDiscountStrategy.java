package patterns.strategy;

public class FixDiscountStrategy implements DiscountStrategy {

    public double applyDiscount(double price, Discount discount){
        if(price<=0)
            return 0;

       return price-discount.getDiscountValue();
    }
}
