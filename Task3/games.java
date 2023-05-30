import java.io.*;
import java.util.*;

public class games {

    public static void main(String[] args) throws Exception {
        BufferedReader buffered_Reader=new BufferedReader(new InputStreamReader(System.in));
        dieGame die_game = new dieGame();
		cardGame card_game = new cardGame();

		System.out.print("Card (c) or Die (d) game? ");
		String answer=buffered_Reader.readLine();
/*
		 This main function simply calls either card or die methods depeneding on which was chosen if card was chosen playCardGame will be chosen
		 and displayed if neither is inputted it gives a error in input not understood
		*/
		if (answer.equals("c")) {
			card_game.playcardgame();
		}

		else if (answer.equals("d")) {
			die_game.playdiegame();
		}

		else System.out.println("Input not understood");

	}
}
