package patterns.strategy;

public class NoDiscountStrategy  implements DiscountStrategy {

    public double applyDiscount(double price, Discount discount){
        return price;
    }
}
