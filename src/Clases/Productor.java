package Clases;
public class Productor extends Thread{

    public static String []Vegetables =  {
            "lettuce",
            "cabbage",
            "onion",
            "spinach",
            "potato",
            "celery",
            "asparagus",
            "radish",
            "broccoli",
            "artichoke",
            "tomato",
            "cucumber",
            "eggplant",
            "carrot",
            "green bean",
    };

    private String name;
    private int maxProduction;
    private int maxGrowTime;
    private Orchard orchard;

    public Productor(String name, int farmerProduction, int maxGrowTime, Orchard orchard) {
        this.name = name;
        this.maxProduction = farmerProduction;
        this.maxGrowTime = maxGrowTime;
        this.orchard = orchard;
    }

    private String generateVegetable() {
        return Vegetables[(int) (Math.random() * Vegetables.length -1)];
    }

    private long getRandomGrowTime() {
        return (long) (Math.random() * (this.maxGrowTime - 1) + 1);
    }

    @Override
    public void run() {
        for (int i = 0; i < this.maxProduction; i++) {
            try {
                String vegetableToProduce = this.generateVegetable();
                long growTime = this.getRandomGrowTime();
                Thread.sleep(growTime * 1000);
                this.orchard.addVegetable(this.name, vegetableToProduce);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}