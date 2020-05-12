package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.*;
import java.util.Random;

public class BlackjackController {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.populateCard();
    }
}

class Player {
    String name;
    Hand hand;
    int potValue;
    public int returnPlayerNum() {
        ArrayList<String> playerNames = new String<>();
        playerNames.add(name);
    }
}

class Card {
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    char cardValue;
}

class Deck extends Card {
    char[] cards = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    ArrayList<Integer> usedCards;
    char[][] deck = new char[4][13];
    public void populateCard() {

        for(int i = 0; i < suit.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                deck[i][j] = deck[i][j];

            }

        }

        /*for(int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }*/
    }
    class Hand {
        ArrayList<Card> cards;
        int handValue;

    }

    public void deal() {
        Random random = new Random();
        int cardNum = random.nextInt(52);
        for (int i = 0; i < usedCards.size(); i++ ) {
            if(cardNum == usedCards.get(i)) {
               cardNum = random.nextInt(52);
            }
        }
        usedCards.add(cardNum);
        Hand hand = new Hand();
        hand.cards.add(cardNum);
    }

}


