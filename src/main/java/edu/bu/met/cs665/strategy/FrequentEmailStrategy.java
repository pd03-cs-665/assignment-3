package edu.bu.met.cs665.strategy;

public class FrequentEmailStrategy implements EmailStrategy {
    @Override
    public void generateEmail(String message) {
        System.out.println("frequent send");
    }
}
