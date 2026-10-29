package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.strategy.EmailStrategy;
import edu.bu.met.cs665.strategy.NewEmailStrategy;

public class NewEmailFactory extends EmailStrategyFactory {
    @Override
    public EmailStrategy createStrategy() {
        return new NewEmailStrategy();
    }
}
