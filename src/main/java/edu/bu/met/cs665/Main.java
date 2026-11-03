/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/03/2026
 * File Name: Main.java
 * Description: Entry point for email generator program.
 */

package edu.bu.met.cs665;

import java.util.Scanner;

import edu.bu.met.cs665.strategy.BusinessEmailStrategy;
import edu.bu.met.cs665.strategy.ReturningEmailStrategy;
import edu.bu.met.cs665.strategy.FrequentEmailStrategy;
import edu.bu.met.cs665.strategy.NewEmailStrategy;
import edu.bu.met.cs665.strategy.VipEmailStrategy;

public class Main {

    /**
     * Main entry point of program.
     * @param args command line args (expects none).
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("──────────────── ⋆⋅☆⋅⋆ ────────────────");
        System.out.println("       LAYA'S EMAIL GENERATION APP      ");
        System.out.println("──────────────── ⋆⋅☆⋅⋆ ────────────────");

        while (true) {
            System.out.println("\nSelect a customer type:");
            System.out.println("1. Business");
            System.out.println("2. Returning");
            System.out.println("3. Frequent");
            System.out.println("4. New");
            System.out.println("5. VIP");
            System.out.println("q. Quit and exit program.");

            System.out.print("\nEnter your choice (1-5 or q): ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("q")) {
                System.out.println("\nGoodbye!");
                break;
            }

            EmailGenerator generator = new EmailGenerator(new BusinessEmailStrategy());

            switch (choice) {
                case "1":
                    generator.setEmailStrategy(new BusinessEmailStrategy());
                    break;

                case "2":
                    generator.setEmailStrategy(new ReturningEmailStrategy());
                    break;

                case "3":
                    generator.setEmailStrategy(new FrequentEmailStrategy());
                    break;

                case "4":
                    generator.setEmailStrategy(new NewEmailStrategy());
                    break;

                case "5":
                    generator.setEmailStrategy(new VipEmailStrategy());
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please select an option between 1 and 5.");
                    continue;
            }

            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter email message: ");
            String message = scanner.nextLine();

            System.out.println("\n──────────── ⋆⋅☆⋅⋆ ────────────");
            System.out.println("       GENERATED EMAIL           ");
            System.out.println("──────────── ⋆⋅☆⋅⋆ ────────────\n");

            System.out.println(generator.generateEmail(customerName, message));

            System.out.println("\n──────────── ⋆⋅☆⋅⋆ ────────────");
            System.out.println("    END OF GENERATED EMAIL    ");
            System.out.println("──────────── ⋆⋅☆⋅⋆ ────────────");

            System.out.println("\nWhat would you like to do next?\n");
            System.out.println("any. Generate a new email");
            System.out.println("q. Quit and exit program");

            System.out.print("\nEnter your choice (any/q): ");
            String nextChoice = scanner.nextLine().trim();

            if (nextChoice.equalsIgnoreCase("q")) {
                System.out.println("\nGoodbye!");
                break;
            }
        }

        scanner.close();
    }
}
