
import java.util.Scanner;
public class NumberToWeek {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the DayNumber[1 - 7]:");
        int dayNumber = in.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid ");
        }

        in.close();
    }
}
