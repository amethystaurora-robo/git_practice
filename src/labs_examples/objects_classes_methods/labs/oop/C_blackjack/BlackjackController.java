package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.*;

public class BlackjackController {

    public static void main(String[] args) {

    }
}

class Player {
    String name;
    Hand hand;
    int potValue;


}

class Card {
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;
}

class Deck extends Card {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public void populateCard() {
        String ace = "ace";
        String jack = "jack";
        String queen = "queen";
        String king = "king";
        for(int i = 0; i < suit.length; i++) {
            for(int j = 2; j < 11; j++) {
                cards[j] = i + suit[i];

        }
    }

}

class Hand {
    ArrayList<Card> cards;
    int handValue;

}
