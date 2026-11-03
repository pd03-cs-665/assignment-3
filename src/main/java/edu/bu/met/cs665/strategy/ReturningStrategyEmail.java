package edu.bu.met.cs665.strategy;

public class ReturningStrategyEmail implements EmailStrategy {
    @Override
    public void generateEmail(String message) {
        System.out.println("returning send")
    }
}
