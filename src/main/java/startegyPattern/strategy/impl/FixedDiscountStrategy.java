package startegyPattern.strategy.impl;

import startegyPattern.strategy.DiscountStrategy;

public class FixedDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscount(double amount) {
        return amount > 10 ? 10 : amount;
    }
}
