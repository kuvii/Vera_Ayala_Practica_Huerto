package Clases;

public class Consumer extends Thread{
    private String name;
    private Orchard orchard;
    private int maxToConsume;
    private final long CONSUMING_TIME;

    public Consumer(String consumerName, int maxToConsume, int consumingTimeS, Orchard orchard) {
        this.name = consumerName;
        this.maxToConsume = maxToConsume;
        this.CONSUMING_TIME = consumingTimeS * 1000;
        this.orchard = orchard;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.maxToConsume; i++) {
            try {
                String vegetableToConsume = this.orchard.consumeVegetable();
                Thread.sleep(this.CONSUMING_TIME);
                System.out.println(this.name + " ha consumido: " + vegetableToConsume);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
