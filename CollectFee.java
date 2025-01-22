public class CollectFee {
    public static void main(String[] args) {
        //object create
        PayFee fee = new PayFee();
        //method call
        fee.setStudentInfo("Ankitt", 20);
        fee.setFee(45000);
        //method call
        fee.displayStudentInfo();
        fee.displayFee();
    }
}
