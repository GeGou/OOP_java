package Excercise_java;

//Paintings

public class Paintings extends Masterpiece {
    double length;
    double width;
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
        System.out.println("Technique: " + technique + "\n" + "Surface: " + (length*width)/10000 + " m^2");
    }
    boolean evaluate(Movement m, Condition c) {
        if ((c == Condition.GOOD) && (super.condition == Condition.EXCELLENT) 
        && (super.movement == m)) {
            return true;
        }
        if ((super.movement == m) && (super.condition == c)) {
            return true;
        }
        return false;
    }
    boolean evaluate(Movement m) {
        if ((super.movement == m) && (super.condition == Condition.EXCELLENT)) {
            return true;
        }
        if ((super.movement == m) && (super.condition == Condition.GOOD)) {
            return true;
        }
        return false;
    }
}