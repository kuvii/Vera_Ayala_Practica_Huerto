import Clases.Orchard;
import Clases.Productor;
import Clases.Consumer;

public class Main {

    // Experimento Dos

    //Orchard
    static int MAX_SPACES = 15;

    //Productor
    static int FARMER_PRODUCTION = 5;
    static int MAX_GROW_TIME = 2;

    //Consumer
    static int MAX_TO_CONSUME = 5;
    static int CONSUME_TIME = 5;

    public static void main(String[] args) {

        Orchard orchard = new Orchard(MAX_SPACES);
        Productor productor = new Productor("Adrian", FARMER_PRODUCTION, MAX_GROW_TIME, orchard);
        Consumer consumer1 = new Consumer("Aday", MAX_TO_CONSUME, CONSUME_TIME, orchard);

        productor.start();
        consumer1.start();

    }
}
