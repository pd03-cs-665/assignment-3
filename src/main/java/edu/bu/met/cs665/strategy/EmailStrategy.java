/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: EmailStrategy.java
 * Description: Abstract strategy interface for generating email template.
 */

package edu.bu.met.cs665.strategy;

public interface EmailStrategy {

    /**
     * Abstract method for all email strategies to implement generation logic.
     * @param name Customer name.
     * @param body Main message body.
     * @return Generated and templated email.
     */
    String generateEmail(String name, String body);
}
