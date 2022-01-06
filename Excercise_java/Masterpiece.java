package Excercise_java;

// Masterpiece

public class Masterpiece extends Artifacts {
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
    
}