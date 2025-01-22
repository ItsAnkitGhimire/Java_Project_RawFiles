
import java.util.Scanner;
public class CityNameDisplay {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] cityName=new String[10];
        for(int i=0;i<10;i++) {
            cityName[i]=in.nextLine();

        }
        System.out.println("City name that Start with D");
        for(String i:cityName) {
            if(i.toLowerCase().charAt(0)=='d') {
                System.out.println(i);
            }
        }
    }
}

