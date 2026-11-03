package edu.bu.met.cs665.strategy;

public class BusinessEmailStrategy implements EmailStrategy{
    @Override
    public void generateEmail(String message) {
        System.out.println("business send");
    }
}
