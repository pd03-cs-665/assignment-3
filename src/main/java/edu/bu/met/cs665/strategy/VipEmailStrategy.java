package edu.bu.met.cs665.strategy;

public class VipEmailStrategy implements EmailStrategy {
    @Override
    public void send(String message) {
        System.out.println("VIP send");
    }
}
