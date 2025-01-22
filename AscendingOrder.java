import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] numbers=new int[10];
        System.out.println("enter any 10 numbers");
        for(int i=0;i<10;i++){
            numbers[i]=in.nextInt();
        }
        int temp;
        for(int i = 0; i<10; i++){
            for(int j=i+1;j<10;j++){
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("In Ascending order");
        for(int i=0;i<10;i++){
            System.out.println(numbers[i]);
        }
        in.close();
    }
}