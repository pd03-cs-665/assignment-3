package edu.bu.met.cs665.strategy;

public interface EmailStrategy {
    String generateEmail(String name, String body);
}
