import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

  
        String candidate1Name = "Candidate A";
        String candidate2Name = "Candidate B";

        int candidate1Votes = 0;
        int candidate2Votes = 0;

        
        int[] voterIds = new int[100];
        int voterCount = 0;

        char continueVoting;

        System.out.println("====== ONLINE VOTING SYSTEM ======");

        do {
            System.out.print("\nEnter your Voter ID: ");
            int voterId = sc.nextInt();

        
            boolean alreadyVoted = false;
            for (int i = 0; i < voterCount; i++) {
                if (voterIds[i] == voterId) {
                    alreadyVoted = true;
                    break;
                }
            }

            if (alreadyVoted) {
                System.out.println("You have already voted!");
            } else {

                System.out.print("Enter your name: ");
                sc.nextLine(); 
                String name = sc.nextLine();

                System.out.print("Enter your age: ");
                int age = sc.nextInt();

                if (age >= 18) {

                    System.out.println("\nChoose your candidate:");
                    System.out.println("1. " + candidate1Name);
                    System.out.println("2. " + candidate2Name);
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();

                    if (choice == 1) {
                        candidate1Votes++;
                        voterIds[voterCount++] = voterId;
                        System.out.println("Vote recorded successfully!");
                    } else if (choice == 2) {
                        candidate2Votes++;
                        voterIds[voterCount++] = voterId;
                        System.out.println("Vote recorded successfully!");
                    } else {
                        System.out.println("Invalid choice!");
                    }

                } else {
                    System.out.println(" Sorry, you are not eligible to vote.");
                }
            }

            System.out.print("\nContinue voting? (y/n): ");
            continueVoting = sc.next().charAt(0);

        } while (continueVoting == 'y' || continueVoting == 'Y');

       
        System.out.print("\nEnter admin password to view results: ");
        String password = sc.next();

        if (password.equals("admin123")) {

            System.out.println("\n====== VOTING RESULTS ======");
            System.out.println(candidate1Name + ": " + candidate1Votes + " votes");
            System.out.println(candidate2Name + ": " + candidate2Votes + " votes");

            if (candidate1Votes > candidate2Votes) {
                System.out.println("🏆 Winner: " + candidate1Name);
            } else if (candidate2Votes > candidate1Votes) {
                System.out.println("🏆 Winner: " + candidate2Name);
            } else {
                System.out.println("Result: It's a Tie!");
            }

        } else {
            System.out.println("Access Denied!");
        }

        sc.close();
    }
}
