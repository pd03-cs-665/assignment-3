/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: BusinessEmailStrategy.java
 * Description: Concrete strategy with business customer email template logic.
 */

package edu.bu.met.cs665.strategy;

public class BusinessEmailStrategy implements EmailStrategy {

    /**
     * Method for generating email template for business customers.
     * @see edu.bu.met.cs665.strategy.EmailStrategy#generateEmail
     */
    @Override
    public String generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Thank you for doing business with us! We would like to inform \
                you that:

                %s

                Please be afraid to reach out if you have any concerns.

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        return emailContent;
    }
}
