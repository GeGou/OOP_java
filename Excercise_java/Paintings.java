package Excercise_java;

//Paintings

public class Paintings extends Masterpiece {
    int length;
    int width;
    Technique technique;
    Paintings(int l, int w, Technique t, Movement m, Condition c) {
        super(m, c);
        System.out.println("Creating an instance of Painting.");
        length = l;
        width = w;
        technique = t;
    }
    void getInfo() {
        super.getInfo();
        System.out.println("Technique: " + technique + "\n" + "Surface: " + length*width);
    }
    boolean evaluate(Movement m, Condition c) {
        if ((super.movement == m) && (super.condition == c)) {
            return true;
        }
        return false;
    }

    
}