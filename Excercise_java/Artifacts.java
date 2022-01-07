package Excercise_java;

// Artifacts

abstract public class Artifacts {
    static int next_num = 1;
    int index = 1;
    String creator;
    int year;
    Artifacts() {
        System.out.println("-------------------------");
        System.out.println("Creating an instance of Artifact.");
        index = next_num;
        next_num++;
        String temp_str = Integer.toString(index);
        creator = "Creator_" + temp_str;
        year = (int)(Math.random() * (100) + 1900);
    }
    void getInfo() {
        System.out.println("Creator: " + creator + "\n" + "Creation Year: " + year);
    }
    void getIndex() {
        System.out.println("\n-----ARTIFACT DATA-----");
        System.out.println("Index: " + index);
    }
    abstract boolean evaluate(Movement m, Condition c);
}