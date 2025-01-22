public class Boxx {
    private int width;
    private int height;
    public void set(int width, int height) {
        this.width=width;
        this.height=height;
    }
    public void area() {
        System.out.println("Area of box with width & Height (" + width+ " & "+ height+ "):"+(width*height));
    }
    public static void main(String[] args) {
        Boxx b=new Boxx();
        b.set(7, 7);
        b.area();
    }
}
