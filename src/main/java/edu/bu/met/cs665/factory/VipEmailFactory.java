package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.strategy.EmailStrategy;
import edu.bu.met.cs665.strategy.VipEmailStrategy;

public class VipEmailFactory extends EmailStrategyFactory {
    @Override
    public EmailStrategy createStrategy() {
        return new VipEmailStrategy();
    }
}
