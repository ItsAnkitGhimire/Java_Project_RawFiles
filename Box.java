public class Box {
    private int width, height;
    public Box(){
        width = 8;
        height = 8;
    }
    public Box(int width, int height){
        this.width=width;
        this.height=height;
    }
    public static void main(String[] args) {
        Box b=new Box();
        Box b1=new Box(5,5);
        System.out.println("Area of box with width & Height ("+b.width+" & "+b.height+"):"+(b.width*b.height));
        System.out.println("Area of box with width & Height  ("+b1.width+" & "+b1.height+"): "+(b1.width*b1.height));
    }
}

