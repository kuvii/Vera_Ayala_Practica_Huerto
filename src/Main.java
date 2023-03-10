import Clases.Orchard;
import Clases.Productor;
import Clases.Consumer;

public class Main {

    //Orchard
    static int MAX_SPACES = 15;

    //Productor
    static int FARMER_PRODUCTION = 15;

    //Consumer
    static int MAX_GROW_TIME = 4;
    static int MAX_TO_CONSUME = 5;

    public static void main(String[] args) {

        Orchard orchard = new Orchard(MAX_SPACES);
        Productor productor = new Productor("Adrian", FARMER_PRODUCTION, MAX_GROW_TIME, orchard);
        Consumer consumer1 = new Consumer("Aday", MAX_TO_CONSUME, 3, orchard);
        Consumer consumer2 = new Consumer("Daniel", MAX_TO_CONSUME, 8, orchard);
        productor.start();
        consumer1.start();
        consumer2.start();
    }
}
