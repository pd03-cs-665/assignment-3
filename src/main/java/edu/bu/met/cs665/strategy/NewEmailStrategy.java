package edu.bu.met.cs665.strategy;

public class NewEmailStrategy implements EmailStrategy {
    @Override
    public void generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Welcome to our business! We're so happy to have you in our family! As our newest member, we would like to inform you that:

                %s

                Please stay!

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        System.out.println(emailContent);
    }
}
