package startegyPattern;

import startegyPattern.strategy.DiscountStrategy;

public class Order {
    private double billAmount;
    private DiscountStrategy discountStrategy;

    public Order(double billAmount, DiscountStrategy discountStrategy) {
        this.billAmount = billAmount;
        this.discountStrategy = discountStrategy;
    }

    public double getBill(){
        return billAmount - discountStrategy.getDiscount(billAmount);
    }
}
