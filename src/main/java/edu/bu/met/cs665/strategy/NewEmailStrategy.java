/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: NewEmailStrategy.java
 * Description: Concrete strategy with new customer email template logic.
 */

package edu.bu.met.cs665.strategy;

public class NewEmailStrategy implements EmailStrategy {

    /**
     * Method for generating email template for new customers.
     * @see edu.bu.met.cs665.strategy.EmailStrategy#generateEmail
     */
    @Override
    public String generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Welcome to our business! We're so happy to have you in our \
                family! As our newest member, we would like to inform you that:

                %s

                Please stay!

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        return emailContent;
    }
}
