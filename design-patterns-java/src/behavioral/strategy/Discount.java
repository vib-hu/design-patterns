package patterns.strategy;

public class Discount {
    private double value;
    private DiscountType type;

    public Discount(DiscountType type, double value){
        this.type = type;
        this.value = value;
    }

    public double getDiscountValue(){
        return value;
    }

    public DiscountType discountType(){
        return type;
    }
}
