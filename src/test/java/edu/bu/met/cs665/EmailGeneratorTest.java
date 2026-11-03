package edu.bu.met.cs665;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.bu.met.cs665.strategy.BusinessEmailStrategy;
import edu.bu.met.cs665.strategy.FrequentEmailStrategy;
import edu.bu.met.cs665.strategy.NewEmailStrategy;
import edu.bu.met.cs665.strategy.ReturningEmailStrategy;
import edu.bu.met.cs665.strategy.VipEmailStrategy;

public class EmailGeneratorTest {

    @Test
    public void testBusinessEmailStrategy() {

        EmailGenerator generator = new EmailGenerator(new BusinessEmailStrategy());

        String email = generator.generateEmail("Carl", "We're out of money!");

        assertTrue(email.contains("Dear Carl"));
        assertTrue(email.contains("Thank you for doing business with us"));
        assertTrue(email.contains("We're out of money"));
    }

    @Test
    public void testFrequentEmailStrategy() {
        EmailGenerator generator = new EmailGenerator(new FrequentEmailStrategy());

        String email = generator.generateEmail("Princess Donut", "We are reaching out about your extended warranty.");

        assertTrue(email.contains("Dear Princess Donut"));
        assertTrue(email.contains("Thank you for your continued support"));
        assertTrue(email.contains("extended warranty"));
    }

    @Test
    public void testNewEmailStrategy() {
        EmailGenerator generator = new EmailGenerator(new NewEmailStrategy());

        String email = generator.generateEmail("Mongo", "We are announcing mass layoffs!");

        assertTrue(email.contains("Dear Mongo"));
        assertTrue(email.contains("Welcome to our business"));
        assertTrue(email.contains("mass layoffs"));
    }

    @Test
    public void testReturningEmailStrategy() {
        EmailGenerator generator = new EmailGenerator(new ReturningEmailStrategy());

        String email = generator.generateEmail("Mordecai", "We have gone bankrupt.");

        assertTrue(email.contains("Dear Mordecai"));
        assertTrue(email.contains("Welcome back"));
        assertTrue(email.contains("We have gone bankrupt"));
    }

    @Test
    public void testVipEmailStrategy() {
        EmailGenerator generator = new EmailGenerator(new VipEmailStrategy());

        String email = generator.generateEmail("Bea", "Let's take this offline");

        assertTrue(email.contains("Dear Bea"));
        assertTrue(email.contains("Wowee, a VIP"));
        assertTrue(email.contains("Let's take this offline"));
    }

    @Test
    public void testSwitchStrategyAtRuntime() {
        EmailGenerator generator = new EmailGenerator(new BusinessEmailStrategy());

        String businessEmail = generator.generateEmail("Important Guy", "important business stuff");
        assertTrue(businessEmail.contains("Dear Important Guy"));
        assertTrue(businessEmail.contains("Thank you for doing business with us"));
        assertTrue(businessEmail.contains("important business stuff"));

        generator.setEmailStrategy(new VipEmailStrategy());

        String vipEmail = generator.generateEmail("Important Client", "serious vip stuff");
        assertTrue(vipEmail.contains("Dear Important Client"));
        assertTrue(vipEmail.contains("Wowee, a VIP"));
        assertTrue(vipEmail.contains("serious vip stuff"));
    }
}
