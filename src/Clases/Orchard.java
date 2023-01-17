package Clases;

import java.util.ArrayList;

public class Orchard {
    private int capacity;
    ArrayList<String> vegetablesAvailables = new ArrayList<>();

    public Orchard(int oathCapacity) {
        this.capacity = oathCapacity;
    }

    synchronized public void addVegetable(String farmerName, String newVegetable) throws InterruptedException{
        while (this.vegetablesAvailables.size() >= this.capacity) {
            wait();
        }

        this.vegetablesAvailables.add(newVegetable);
        System.out.println(farmerName + " ha producido " + newVegetable);
        notifyAll();
    }

    synchronized public String consumeVegetable() throws InterruptedException {
        while (this.vegetablesAvailables.size() == 0) {
            wait();
        }
        String vegetableToConsume = this.vegetablesAvailables.remove(0);
        notifyAll();
        return vegetableToConsume;
    }
}
