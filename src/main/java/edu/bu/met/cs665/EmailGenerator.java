/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: EmailGeneartor.java
 * Description: Context to reference email strategies at runtime.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.strategy.EmailStrategy;

public class EmailGenerator {
    private EmailStrategy emailStrategy;

    /**
     * Email generator constructor for strategy context interface.
     * @param emailStrategy Initial EmailStrategy object.
     */
    public EmailGenerator(EmailStrategy emailStrategy) {
        this.emailStrategy = emailStrategy;
    }

    /**
     * Setter to change email template strategy at runtime.
     * @param emailStrategy New EmailStrategy object.
     */
    public void setEmailStrategy(EmailStrategy emailStrategy) {
        this.emailStrategy = emailStrategy;
    }

    /**
     * Perform email generation logic for current email strategy.
     * @param name Name of customer for email template.
     * @param body Message to send to customer.
     * @return Generated and templated email.
     */
    public String generateEmail(String name, String body) {
        return emailStrategy.generateEmail(name, body);
    }
}
