/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: Main.java
 * Description: Entry point for email generator program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.strategy.BusinessEmailStrategy;

public class Main {
    public static void main(String[] args) {
        EmailGenerator generator = new EmailGenerator(new BusinessEmailStrategy());

        generator.generateEmail("Carl", "We've gone bankrupt!");
    }

}
