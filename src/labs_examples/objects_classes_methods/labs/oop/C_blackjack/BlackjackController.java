package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.*;
import java.util.Random;

public class BlackjackController {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.populateCard();
    }

    public void playBlackJack() {
        Player playerone = new Player();
        Player computerPlayer = new Player();
    }
}

class Player {
    String name;
    Hand hand;
    int potValue;

    public boolean computerAI() {
        boolean anotherCard = true;
        Hand hand = new Hand();
        int score = hand.returnScore();
        if(score <= 16) {
            anotherCard = true;
        }
        else {
            anotherCard = false;
        }
        return anotherCard;

    }
}

class Card {
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    char cardValue;
}

class Hand {
    ArrayList<Character> cards;
    int handValue;

    public int returnScore() {
        int score = 0;
        for(int i = 0; i < cards.size(); i++) {
            if(cards.contains('A') || cards.contains('T') || cards.contains('J') || cards.contains('Q') ||
                    cards.contains('K')) {
                score+=10;
            }
            if(cards.contains('2')) {
                score+=2;
            }
            if(cards.contains('3')) {
                score+=3;
            }
            if(cards.contains('4')) {
                score+=4;
            }
            if(cards.contains('5')) {
                score+=5;
            }
            if(cards.contains('6')) {
                score+=6;
            }
            if(cards.contains('7')) {
                score+=7;
            }
            if(cards.contains('8')) {
                score+=8;
            }
            if(cards.contains('9')) {
                score+=9;
            }

        }
        return score;
    }

    public boolean GreaterOrLessThan21() {
        boolean under21 = true;
        int score = returnScore();
        if(score > 21) {
            under21 = false;
        }
        else if(score <=21) {
            under21 = true;
        }
        return under21;
    }

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


