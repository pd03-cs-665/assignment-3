/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: VipEmailStrategy.java
 * Description: Concrete strategy with VIP customer email template logic.
 */

package edu.bu.met.cs665.strategy;

public class VipEmailStrategy implements EmailStrategy {

    /**
     * Method for generating email template for VIP customers.
     * @see edu.bu.met.cs665.strategy.EmailStrategy#generateEmail
     */
    @Override
    public String generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Wowee, a VIP! You are so special and important! We have a \
                special message just for you:

                %s

                We love you.

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        return emailContent;
    }
}
