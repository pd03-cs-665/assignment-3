package edu.bu.met.cs665;

import edu.bu.met.cs665.factory.EmailStrategyFactory;

public class EmailGenerator {
    private EmailStrategyFactory factory;

    public EmailGenerator(EmailStrategyFactory factory) {
        this.factory = factory;
    }

    public void sendEmail(String message) {
        factory.send(message);
    }
}
