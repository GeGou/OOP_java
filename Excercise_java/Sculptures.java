package Excercise_java;

// Sculptures

public class Sculptures extends Masterpiece {
    double volume;
    Material material;
    Sculptures(int vol, Material mat, Movement m, Condition c) {
        super(m, c);
        System.out.println("Creating an instance of Sculpute.");
        volume = vol;
        material = mat;
    }
    void getInfo() {
        super.getInfo();
        System.out.println("Material: " + material + "\n" + "Volume: " + volume + " cm^3");
    }
    boolean evaluate(Movement m, Condition c) {
        if ((super.movement == m) && (super.condition == c)) {
            return true;
        }
        return false;
    }
    boolean evaluate(Movement m) {
        if ((super.movement == m) && (super.condition == Condition.EXCELLENT)) {
            return true;
        }
        return false;
    }
}