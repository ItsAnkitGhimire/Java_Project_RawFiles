
import java.util.Scanner;
public class ShapeDraw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sides of Shape");
        int sides = in.nextInt();
        Shape shape;
        if(sides==3){
            shape=new Triangle();
            shape.setInfo("Triangle","RED");
            shape.displayInfo();
        }else if(sides==4){
            shape=new Square();
            shape.setInfo("Square","MAROON");
            shape.displayInfo();
        }else{
            shape= new Shape();
            shape.setInfo("Simple Shape","BLUE");
            shape.displayInfo();
        }
        shape.draw(); //it will show polymorphism behaviour based on users input
    }
}