package edu.bu.met.cs665.strategy;

public class NewEmailStrategy implements EmailStrategy {
    @Override
    public void send(String message) {
        System.out.println("new send");
    }
}
