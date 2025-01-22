public class MotorCycle extends Engine{
    @Override
    public void run(){
        System.out.println("Maximum Speed Limit: 42KM/HRS");
    }
    public static void main(String[] args) {
        MotorCycle cycle = new MotorCycle();
        cycle.on();
        cycle.run();
        cycle.off();
    }
}