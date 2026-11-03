package edu.bu.met.cs665.strategy;

public class VipEmailStrategy implements EmailStrategy {
    @Override
    public String generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Wowee, a VIP! You are so special and important! We have a special message just for you:

                %s

                We love you.

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        return emailContent;
    }
}
