package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.strategy.EmailStrategy;

public abstract class EmailStrategyFactory {
    public abstract EmailStrategy createStrategy();

    public void send(String message) {
        EmailStrategy strategy = createStrategy();
        strategy.send(message);
    }
}
