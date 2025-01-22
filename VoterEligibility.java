import java.util.Scanner;
public class VoterEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter age of the user");
        int age = in.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for Voting");
        }
        if(age<18){
            System.out.println("Not Eligible for voting");
        }
        in.close();
    }
}
