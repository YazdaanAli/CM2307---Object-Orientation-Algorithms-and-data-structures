import java.io.*;
import java.util.*;

public class dieGame {
    public static BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(System.in));
    public static RandomInterface RANDOM_INTEGERS = new LinearCongruentialGenerator(); //inialise all variables needed
    public static HashSet<Integer> numbersRolled=new HashSet<Integer>();

    public void playdiegame(){
        mainDieGame();  // Runs the main code and functions in one place
        declareDieWinner();
    }

    private void mainDieGame(){
        for (int i=0; i<2; i++) {
            System.out.println("Hit <RETURN> to roll the die");
            try {
                buffer_reader.readLine();
            } catch (IOException e) { //same method as before and this try and catch simiply looks for the error if there is one
                System.out.println("Error found");
            }
            int dieRoll=(int)(RANDOM_INTEGERS.next() * 6) + 1;
            System.out.println("You rolled " + dieRoll);
            numbersRolled.add(Integer.valueOf(dieRoll));
        }
        System.out.println("Numbers rolled: " + numbersRolled);
    }

    private void declareDieWinner(){
        if (numbersRolled.contains(Integer.valueOf(1))) { // This part of the method checks to see if the user has won. I had thought
            // about putting this and the declarecardwinner functions in one however i realised they cant really be used togther as they
            //have two different logics so i decided to keep them seperate.
            System.out.println("You won!");
        }
        else System.out.println("You lost!");
    }

}