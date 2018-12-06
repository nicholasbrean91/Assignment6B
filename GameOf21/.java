import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//Created by: Nicholas Brean
//Created on: Dec 2018
//This is a game of 21
public class GameOf21 {
	public static void main(String args[]) {
		Scanner userInput = new Scanner (System.in);
		Hashtable<String, Integer> deckHand = new Hashtable<String, Integer>();
		
		//Spades
		deckHand.put("1ofSpades", 1);
		deckHand.put("2ofSpades", 2);
		deckHand.put("3ofSpades", 3);
		deckHand.put("4ofSpades", 4);
		deckHand.put("5ofSpades", 5);
		deckHand.put("6ofSpades", 6);
		deckHand.put("7ofSpades", 7);
		deckHand.put("8ofSpades", 8);
		deckHand.put("9ofSpades", 9);
		deckHand.put("10ofSpades", 10);
		deckHand.put("JofSpades", 10);
		deckHand.put("QofSpades", 10);
		deckHand.put("KofSpades", 10);
		deckHand.put("AofSpades", 1);
		deckHand.put("A2ofSpades", 11);
		
		//Clubs
		deckHand.put("1ofClubs", 1);
		deckHand.put("2ofClubs", 2);
		deckHand.put("3ofClubs", 3);
		deckHand.put("4ofClubs", 4);
		deckHand.put("5ofClubs", 5);
		deckHand.put("6ofClubs", 6);
		deckHand.put("7ofClubs", 7);
		deckHand.put("8ofClubs", 8);
		deckHand.put("9ofClubs", 9);
		deckHand.put("10ofClubs", 10);
		deckHand.put("JofClubs", 10);
		deckHand.put("QofClubs", 10);
		deckHand.put("KofClubs", 10);
		deckHand.put("AofClubs", 1);
		deckHand.put("A2ofClubs", 11);
		
		//Diamonds
		deckHand.put("1ofDiamonds", 1);
		deckHand.put("2ofDiamonds", 2);
		deckHand.put("3ofDiamonds", 3);
		deckHand.put("4ofDiamonds", 4);
		deckHand.put("5ofDiamonds", 5);
		deckHand.put("6ofDiamonds", 6);
		deckHand.put("7ofDiamonds", 7);
		deckHand.put("8ofDiamonds", 8);
		deckHand.put("9ofDiamonds", 9);
		deckHand.put("10ofDiamonds", 10);
		deckHand.put("JofDiamonds", 10);
		deckHand.put("QofDiamonds", 10);
		deckHand.put("KofDiamonds", 10);
		deckHand.put("AofDiamonds", 1);
		deckHand.put("A2ofDiamonds", 11);
		
		//Hearts
		deckHand.put("1ofHearts", 1);
		deckHand.put("2ofHearts", 2);
		deckHand.put("3ofHearts", 3);
		deckHand.put("4ofHearts", 4);
		deckHand.put("5ofHearts", 5);
		deckHand.put("6ofHearts", 6);
		deckHand.put("7ofHearts", 7);
		deckHand.put("8ofHearts", 8);
		deckHand.put("9ofHearts", 9);
		deckHand.put("10ofHearts", 10);
		deckHand.put("JofHearts", 10);
		deckHand.put("QofHearts", 10);
		deckHand.put("KofHearts", 10);
		deckHand.put("AofHearts", 1);
		deckHand.put("A2ofHearts", 11);
		
		System.out.print("Pick any Card from the deck: ");
		String cardChosen = userInput.nextLine();
		
		Integer n = deckHand.get(cardChosen);
		   if (n != null) {
		     System.out.println("1ofSpades = " + n);
		   }

		
	}
}
