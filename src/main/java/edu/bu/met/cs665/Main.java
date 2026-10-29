/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Demonstrates basic Log4j logging.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.factory.BusinessEmailFactory;
import edu.bu.met.cs665.factory.FrequentEmailFactory;
import edu.bu.met.cs665.factory.NewEmailFactory;
import edu.bu.met.cs665.factory.ReturningEmailFactory;
import edu.bu.met.cs665.factory.VipEmailFactory;

public class Main {
    public static void main(String[] args) {
        EmailGenerator businessEmailGenerator = new EmailGenerator(new BusinessEmailFactory());

        EmailGenerator returningEmailGenerator = new EmailGenerator(new ReturningEmailFactory());

        EmailGenerator frequentEmailGenerator = new EmailGenerator(new FrequentEmailFactory());

        EmailGenerator newEmailGenerator = new EmailGenerator(new NewEmailFactory());

        EmailGenerator vipEmailGenerator = new EmailGenerator(new VipEmailFactory());

    }

}
