
import java.util.Scanner;
public class StringDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String first = in.nextLine();
        System.out.println();
        System.out.print("Enter second string : ");
        String second = in.nextLine();
        // equals
        System.out.println();
        if (first.equals(second)){
            System.out.println("both are same");
        }
        //equals ignore case
        System.out.println();
        if (first.equalsIgnoreCase(second)){
            System.out.println("both are equals ignoring case");
        }
        //==
        System.out.println();
        if(first==second){
            System.out.println("both are ==");
        }
        //concat
        System.out.println();
        System.out.println("the concat value is : "+(first.concat(second)));
        // for concatenation
        System.out.println();
        System.out.println("the concatenation value : "+first +" " +second);
        // compare to
        System.out.println();
        System.out.println("first compare to second :"+ (first.compareTo(second)));
        System.out.println("second compare to first :"+(second.compareTo(first)));
        // to find length
        System.out.println();
        System.out.println(first+" has : "+first.length()+" characters. ");
        System.out.println(second+" has : "+second.length()+" characters. ");
        System.out.println(first+"  "+ second+" has : "+(first+second).length()+" characters. ");
        // replacement
        System.out.println();
        System.out.println("Value after replacement");
        String third = first.replace('n','d');
        String fourth = second.replace('o','d');
        System.out.println(third);
        System.out.println(fourth);
        // reverse
        System.out.println();
        StringBuffer r = new StringBuffer(first);
        String fifth = r.reverse().toString();
        System.out.println(" the reverse of "+first+" is : "+fifth);
        // upper case
        System.out.println();
        System.out.println(first+" upper case : "+first.toUpperCase());
        System.out.println(second+" upper case : "+second.toUpperCase());
        System.out.println(third+" upper case : "+third.toUpperCase());
        System.out.println(fourth+" upper case : "+fourth.toUpperCase());
        System.out.println(fifth+" upper case : "+fifth.toUpperCase());
        // lower case
        System.out.println();
        System.out.println(first+" lower case : "+first.toLowerCase());
        System.out.println(second+" lower case : "+second.toLowerCase());
        System.out.println(third+" lower case : "+third.toLowerCase());
        System.out.println(fourth+" lower case : "+fourth.toLowerCase());
        System.out.println(fifth+" lower case : "+fifth.toLowerCase());
        // index or finding position
        System.out.println();
        System.out.println(" Position  : "+first.indexOf('a'));
        System.out.println(" Position : "+second.indexOf('b'));
        System.out.println(" Position : "+third.indexOf('c'));
        System.out.println(" Position : "+fourth.indexOf('d'));
        System.out.println(" Position : "+fifth.indexOf('e'));

        // escape sequencing
        System.out.println();
        String text = "the text is n * n\\nn\\ ";
        System.out.println(text);
    }
}
