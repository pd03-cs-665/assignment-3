/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: ReturningEmailStrategy.java
 * Description: Concrete strategy with returning customer email template logic.
 */

package edu.bu.met.cs665.strategy;

public class ReturningEmailStrategy implements EmailStrategy {

    /**
     * Method for generating email template for returning customers.
     * @see edu.bu.met.cs665.strategy.EmailStrategy#generateEmail
     */
    @Override
    public String generateEmail(String name, String message) {
        String emailContent = """
                Dear %s,

                Welcome back! We knew you'd return. For your loyalty, we would \
                like to inform you that:

                %s

                See you around soon.

                With love,
                Laya's Legit LLC
                """.formatted(name, message);

        System.out.println(emailContent);

        return emailContent;
    }
}
