package edu.bu.met.cs665.strategy;

public class BusinessEmailStrategy implements EmailStrategy{
    @Override
    public void send(String message) {
        System.out.println("business send");
    }
}
