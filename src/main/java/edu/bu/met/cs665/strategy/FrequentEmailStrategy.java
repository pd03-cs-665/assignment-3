package edu.bu.met.cs665.strategy;

public class FrequentEmailStrategy implements EmailStrategy {
    @Override
    public String generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Thank you for your continued support and business! We don't know what we would do without you. Since you are our #1 fan, we would like to inform you that:

                %s

                Please continue to support us.

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        return emailContent;
    }
}
