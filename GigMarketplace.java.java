 package com.gigmarketplace;

import java.util.ArrayList;
import java.util.Scanner;

public class GigMarketplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gig> gigs = new ArrayList<>();

        while (true) {
            System.out.println("\n===== GIG MARKETPLACE =====");
            System.out.println("1. Add Gig");
            System.out.println("2. View All Gigs");
            System.out.println("3. Search Gig");
            System.out.println("4. Apply for Gig");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Gig ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Gig Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Gig Description: ");
                    String description = sc.nextLine();
                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    Gig gig = new Gig(id, title, description, location);
                    gigs.add(gig);
                    System.out.println("Gig Added Successfully!");
                    break;

                case 2:
                    if (gigs.isEmpty()) {
                        System.out.println("No Gigs Available!");
                    } else {
                        System.out.println("\n===== ALL GIGS =====");
                        for (Gig g : gigs) {
                            g.displayGig();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Gig Title to Search: ");
                    String searchTitle = sc.nextLine();
                    boolean found = false;

                    for (Gig g : gigs) {
                        // Fixed: using getTitle() instead of g.title
                        if (g.getTitle().equalsIgnoreCase(searchTitle)) {
                            System.out.println("\nGig Found!");
                            g.displayGig();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Gig Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Gig ID to Apply: ");
                    int applyId = sc.nextInt();
                    sc.nextLine();
                    boolean appliedSuccess = false;

                    for (Gig g : gigs) {
                        // Fixed: using getId() instead of g.id
                        if (g.getId() == applyId) {
                            System.out.print("Enter your name: ");
                            g.applicantName = sc.nextLine();
                            g.applied = true;
                            System.out.println("Successfully applied for the gig!");
                            appliedSuccess = true;
                            break;
                        }
                    }

                    if (!appliedSuccess) {
                        System.out.println("Gig with ID " + applyId + " not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}              