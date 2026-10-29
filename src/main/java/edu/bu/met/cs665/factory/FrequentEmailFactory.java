package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.strategy.EmailStrategy;
import edu.bu.met.cs665.strategy.FrequentEmailStrategy;

public class FrequentEmailFactory extends EmailStrategyFactory {
    @Override
    public EmailStrategy createStrategy() {
        return new FrequentEmailStrategy();
    }
}
