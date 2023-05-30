import java.io.*;
import java.util.*;

public class cardGame {
    public static BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(System.in)); //inatliseing all variables
    public static RandomInterface RANDOM_INTEGERS = new LinearCongruentialGenerator();
    public static ArrayList<String> cardList; //This will be used for the list of the 52 cards
    public static HashSet<String> cardsChosen = new HashSet<String>();

    public void playcardgame() {
        initialiseCardGame();  // i decided to keep this method as a easy way to run the code from the main menu. Similarliy you can simply
        //call all the methods in the main part and it will run the same. i did this as i believe it to make the code much easier to understand
        mainCardGame();
        declareCardWinner(); // to understand
    }

    private void initialiseCardGame() {

        String cards[] = {"AHrts", "2Hrts", "3Hrts", "4Hrts", "5Hrts", "6Hrts", // similiar code as before this creates the card deck
                "7Hrts", "8Hrts", "9Hrts", "10Hrts", "JHrts",
                "QHrts", "KHrts",
                "ADmnds", "2Dmnds", "3Dmnds", "4Dmnds", "5Dmnds",
                "6Dmnds", "7Dmnds", "8Dmnds", "9Dmnds", "10Dmnds",
                "JDmnds", "QDmnds", "KDmnds",
                "ASpds", "2Spds", "3Spds", "4Spds", "5Spds", "6Spds",
                "7Spds", "8Spds", "9Spds", "10Spds", "JSpds",
                "QSpds", "KSpds",
                "AClbs", "2Clbs", "3Clbs", "4Clbs", "5Clbs", "6Clbs",
                "7Clbs", "8Clbs", "9Clbs", "10Clbs", "JClbs",
                "QClbs", "KClbs"};
        cardList = new ArrayList<String>(Arrays.asList(cards));

        for (int i = 0; i < 100; i++) {
            int firstIndex = ((int) (RANDOM_INTEGERS.next() * 52));
            int secondIndex = ((int) (RANDOM_INTEGERS.next() * 52)); // This shuffles the card deck. i decided to keep this methods as it is a
            // as key implementaion of for the code to run
            String temp = (String) cardList.get(firstIndex);
            cardList.set(firstIndex, cardList.get(secondIndex));
            cardList.set(secondIndex, temp);
        }

        System.out.println(cardList);
    }

    private void mainCardGame() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Hit <RETURN> to choose a card");
            try {
                buffer_reader.readLine();
            } catch (IOException e) {
                System.out.println("Error found"); // When using a buffer reader it will spit a error out this checks for the error and
                // catches it if needed
            }
            int cardChoice = (int) (RANDOM_INTEGERS.next() * cardList.size());
            System.out.println("You chose " + cardList.get(cardChoice)); // This method wasnt changed as it holds the main functionality of the code
            cardsChosen.add(cardList.remove(cardChoice));
        }

        System.out.println("Cards chosen: " + cardsChosen);
        System.out.println("Remaining cards: " + cardList);
    }

    private void declareCardWinner() {
        System.out.println("Cards chosen: " + cardsChosen); // In this method we are checking if the user has won the game or not
        if (cardsChosen.contains("AHrts") || cardsChosen.contains("ADmnds") ||
                cardsChosen.contains("ASpds") || cardsChosen.contains("AClbs")) {
            System.out.println("You won!");
        } else System.out.println("You lost!");
    }

}