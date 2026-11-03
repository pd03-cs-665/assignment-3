package edu.bu.met.cs665.strategy;

public class ReturningStrategyEmail implements EmailStrategy {
    @Override
    public void generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Welcome back! We knew you'd return. For your loyalty, we would like to inform you that:

                %s

                See you around soon.

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        System.out.println(emailContent);

    }
}
