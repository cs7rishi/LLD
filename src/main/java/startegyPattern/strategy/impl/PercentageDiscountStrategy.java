package startegyPattern.strategy.impl;

import startegyPattern.strategy.DiscountStrategy;

public class PercentageDiscountStrategy implements DiscountStrategy {
    @Override
    public double getDiscount(double amount) {
        return amount * 0.1;
    }
}
