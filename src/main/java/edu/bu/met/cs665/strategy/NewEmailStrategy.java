package edu.bu.met.cs665.strategy;

public class NewEmailStrategy implements EmailStrategy {
    @Override
    public void generateEmail(String message) {
        System.out.println("new send");
    }
}
