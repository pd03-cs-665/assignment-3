package edu.bu.met.cs665.strategy;

public class BusinessEmailStrategy implements EmailStrategy{
    @Override
    public String generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Thank you for doing business with us! We would like to inform you that:

                %s

                Please be afraid to reach out if you have any concerns.

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        return emailContent;
    }
}
