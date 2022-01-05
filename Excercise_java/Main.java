package Excercise_java;

import java.lang.Math;  
// import Excercise_java.Artifacts.*;
// import Excercise_java.Masterpiece.*;
// import Excercise_java.Paintings.*;
// import Excercise_java.Sculptures.*;

public class Main {
    public static void main(String[] args) {

        int x = args.length;    // arguments amount
        if (x != 3) {
            System.out.println("Wrong given arguments");
            System.exit(0);
        }
        // parse the string argument as a signed decimal integer
        int n = Integer.parseInt(args[0]);
        int movement = Integer.parseInt(args[1]);
        int condition = Integer.parseInt(args[2]);
        System.out.println("N: " + n + "\n" + "Movement: " + movement + "\n" + "Condition: " + condition + "\n");

        for (int i = 0; i < n; i++) {
            // creating an object of Random class      
            // Generates random integers 0 to 4  
            int y = (int)(Math.random() * (2) + 0);
            System.out.println("Random: " + y + "\n");
            if (y == 0) {

            }
            else if (y == 1) {

            }
        }

        System.out.println("/////////////////////////////////");
    }
}