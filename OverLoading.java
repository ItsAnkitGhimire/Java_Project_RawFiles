public class OverLoading {
    public void sum(){
        System.out.println("Sum of 20 and 30 is : "+(20+30));
    }
    public void sum(int a, int b){
        System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
    }
    public void sum(double a, double b, double c){
        System.out.println("Sum of "+a+" , "+b+" and "+c+ "is : "+(a+b+c));
    }
    public void sum(double[] a){
        double sum=0;
        for(double i:a ){
            sum +=i;
        }
        System.out.println("sum:"+sum);
    }
    public static void main(String[] args) {
        OverLoading obj= new OverLoading();
        double[] a= {1.2,2.3,4.5};
        obj.sum();
        obj.sum(50,50);
        obj.sum(20,10,20);
        obj.sum(a);
    }
}
