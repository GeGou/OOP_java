package Excercise_java;

import java.lang.Math;

enum Movement {
    IMPRESSIONISM,
    EXPRESSIONISM,
    NATURALISM
}

enum Condition {
    BAD,
    GOOD,
    EXCELLENT
}

enum Technique {
    OIL,
    AQUARELLE,
    TEMPERA
}

enum Material {
    IRON,
    STONE,
    WOOD   
}

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong given arguments");
            System.exit(0);
        }
        // parse the string arguments
        int n = Integer.parseInt(args[0]);
        Movement movement = Movement.valueOf(args[1]);
        Condition condition = Condition.valueOf(args[2]);
        System.out.println("----------GIVEN----------");
        System.out.println("N: " + n + "\n" + "Movement: " + movement + "\n" + "Condition: " + condition + "\n");
        
        // array of masterpiece objects
        Masterpiece[] my_array = new Masterpiece[n];

        // creating N random objects
        for (int i = 0; i < n; i++) {       
            Movement my_mov = rand_mov();      // random movement
            Condition my_cond = rand_cond();     // random condition
            Technique my_techn = rand_techn();     // random technique
            Material my_mat = rand_mat();

            // creating the object
            int temp = (int)(Math.random() * (2) + 0);     // Generates random integers 0 or 1 
            if (temp == 0) {
                int lenght = (int)(Math.random() * (100) + 40);    // in cm
                int width = (int)(Math.random() * (60) + 30);      // in cm
                my_array[i] = new Paintings(lenght, width, my_techn, my_mov, my_cond);
            }
            else {
                int volume = (int)(Math.random() * (600) + 200);     // in cm^3
                my_array[i] = new Sculptures(volume, my_mat, my_mov, my_cond);
            }
        }
        auction(my_array, movement, condition);
    }

    public static void auction(Artifacts[] array, Movement m, Condition c) {
        for (Artifacts artifact : array) {
            artifact.getIndex();
            artifact.getInfo();
            if (artifact.evaluate(m, c) == false) {
                System.out.println("->Not acceptable artifact");
            }
            else {
                System.out.println("->Acceptable artifact");
            }
        }
    }

    // returning random movement
    public static Movement rand_mov() {
        int temp = (int)(Math.random() * (3) + 0);
        if (temp == 0) {
            return Movement.EXPRESSIONISM;
        }
        else if (temp == 1) {
            return Movement.IMPRESSIONISM;
        }
        else {
            return Movement.NATURALISM;
        }
    }

    // returning random condiiton
    public static Condition rand_cond() {
        int temp = (int)(Math.random() * (3) + 0);
        if (temp == 0) {
            return Condition.BAD;
        }
        else if (temp == 1) {
            return Condition.EXCELLENT;
        }
        else {
            return Condition.GOOD;
        }
    }

    // returning random technique
    public static Technique rand_techn() {
        int temp = (int)(Math.random() * (3) + 0);
        if (temp == 0) {
            return Technique.AQUARELLE;
        }
        else if (temp == 1) {
            return Technique.OIL;
        }
        else {
            return Technique.TEMPERA;
        }
    }

    // returning random material
    public static Material rand_mat() {
        int temp = (int)(Math.random() * (3) + 0);
        if (temp == 0) {
            return Material.IRON;
        }
        else if (temp == 1) {
            return Material.STONE;
        }
        else {
            return Material.WOOD;
        }
    }
}