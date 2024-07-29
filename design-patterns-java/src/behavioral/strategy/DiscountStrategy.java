package patterns.strategy;

public interface DiscountStrategy {

    double applyDiscount(double price, Discount discount);
}
