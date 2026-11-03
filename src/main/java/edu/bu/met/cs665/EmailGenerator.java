package edu.bu.met.cs665;

import edu.bu.met.cs665.strategy.EmailStrategy;

public class EmailGenerator {
    private EmailStrategy emailStrategy;

    public EmailGenerator(EmailStrategy emailStrategy) {
        this.emailStrategy = emailStrategy;
    }

    public void setEmailStrategy(EmailStrategy emailStrategy) {
        this.emailStrategy = emailStrategy;
    }

    public void generateEmail(String name, String body) {
        emailStrategy.generateEmail(name, body);
    }
}
