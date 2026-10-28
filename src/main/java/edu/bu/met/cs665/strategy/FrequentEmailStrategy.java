package edu.bu.met.cs665.strategy;

public class FrequentEmailStrategy implements EmailStrategy {
    @Override
    public void send(String message) {
        System.out.println("frequent send");
    }
}
