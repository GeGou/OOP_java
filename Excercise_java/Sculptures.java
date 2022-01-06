package Excercise_java;

// Sculptures

public class Sculptures extends Masterpiece {
    int volume;
    Material material;
    Sculptures(int vol, Material mat, Movement m, Condition c) {
        super(m, c);
        System.out.println("Creating an instance of Sculpute.");
        volume = vol;
        material = mat;
    }
    void getInfo() {
        super.getInfo();
        System.out.println("Volume: " + volume + "\n" + "Material: " + material);
    }
    boolean evaluate(Movement m, Condition c) {
        if ((super.movement == m) && (super.condition == c)) {
            return true;
        }
        return false;
    }
}