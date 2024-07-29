package patterns.strategy;

public class PercentageDiscountStrategy implements DiscountStrategy {

    public double applyDiscount(double price, Discount discount){
        if(price<=0)
            return 0;

        return (price-(price*discount.getDiscountValue()/100));
    }
}
