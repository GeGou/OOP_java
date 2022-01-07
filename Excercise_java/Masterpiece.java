package Excercise_java;

// Masterpiece

abstract public class Masterpiece extends Artifacts {
    Movement movement;
    Condition condition;
    Masterpiece(Movement m, Condition c) {
        super();
        System.out.println("Creating an instance of Masterpiece.");
        movement = m;
        condition = c;
    }
    void getInfo() {
        super.getInfo();
        System.out.println("Movement: " + movement + "\n" + "Condition: " + condition);
    }
    abstract boolean evaluate(Movement m, Condition c);
    abstract boolean evaluate(Movement m);
}