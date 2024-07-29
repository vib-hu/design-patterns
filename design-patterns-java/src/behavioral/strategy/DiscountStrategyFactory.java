package patterns.strategy;

public class DiscountStrategyFactory {

    public static DiscountStrategy getDiscountStrategy(DiscountType discountType) {
        switch (discountType){
            case Fix:
                return new FixDiscountStrategy();
            case Percentage:
               return new PercentageDiscountStrategy();
            case None:
                return new NoDiscountStrategy();
            default:
                throw new IllegalArgumentException("Unknown discount type");
        }
    }
}
