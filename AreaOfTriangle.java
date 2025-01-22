
public class AreaOfTriangle {
    public void area(double base, double height) {
        System.out.println("Area of Triangle: " + 1.0 / 2 * base * height);
    }
    public double area(double height) {
        double base = 30;
        return (1.0 / 2 * base * height);
    }
    public double area(double base, double height, double form) {
        return (form * base * height);
    }
    public static void main(String[] args) {
        AreaOfTriangle t = new AreaOfTriangle();
        t.area(40, 10);
        double result = t.area(50);
        System.out.println("Width Fix area:" + result);
        double result2 = t.area(22, 25, 0.5);
        System.out.println("Another Area: " + result2);
    }
}
