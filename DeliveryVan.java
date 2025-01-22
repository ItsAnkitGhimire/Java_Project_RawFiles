public class DeliveryVan extends Engine{
    @Override
    public void run() {
        System.out.println("DeliveryVan has :75/HRS Speed");
    }
    public static void main(String[] args) {
        DeliveryVan cycle = new DeliveryVan();
        cycle.on();
        cycle.run();
        cycle.off();

    }
}
