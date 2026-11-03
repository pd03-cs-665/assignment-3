/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: FrequentEmailStrategy.java
 * Description: Concrete strategy with frequent customer email template logic.
 */

package edu.bu.met.cs665.strategy;

public class FrequentEmailStrategy implements EmailStrategy {

    /**
     * Method for generating email template for frequent customers.
     * @see edu.bu.met.cs665.strategy.EmailStrategy#generateEmail
     */
    @Override
    public String generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Thank you for your continued support and business! We don't \
                know what we would do without you. Since you are our #1 fan, \
                we would like to inform you that:

                %s

                Please continue to support us.

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        return emailContent;
    }
}
