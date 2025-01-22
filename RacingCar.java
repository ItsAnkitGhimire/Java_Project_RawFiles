public class RacingCar extends Car{
    public void race(){
        System.out.println("This is racing car");
    }
    public static void main(String[] args) {
        RacingCar rc = new RacingCar();
        rc.setColor("Green");
        rc.showColor();
        rc.carInfo();
        rc.race();
    }
}

