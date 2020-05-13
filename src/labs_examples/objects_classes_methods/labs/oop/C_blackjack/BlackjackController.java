package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.*;
import java.util.Random;

public class BlackjackController {

    public static void main(String[] args) {

    }

    public void playBlackJack() {
        Scanner scanner = new Scanner(System.in);
        Player playerone = new Player();
        Player computerPlayer = new Player();
        Hand hand = new Hand();
        Deck deck = new Deck();
        deck.populateCard();
        deck.deal(computerPlayer);
        playerone.hand.cards.add(deck.deal(playerone));
        deck.deal(computerPlayer);
        playerone.hand.cards.add(deck.deal(playerone));
        blackJackMethods();
        String userAnswer = scanner.nextLine();
        while (userAnswer == "yes") {
            blackJackMethods();
            computerPlayer.computerAI();

        }
        if (userAnswer == "no" || playerone.hand.returnScore() > 21 || computerPlayer.hand.returnScore() > 21) {
            for (int i = 0; i < playerone.hand.cards.size(); i++) {
                System.out.println(playerone.hand.cards.get(i));
                System.out.println(computerPlayer.hand.cards.get(i));
            }

        }
    }

    public void trackGames() {
        Scanner scanner = new Scanner(System.in);
        Player playerone = new Player();
        Player computerPlayer = new Player();
        Hand hand = new Hand();
        Deck deck = new Deck();
        int gameNum = 0;
        int playerScore = playerone.hand.returnScore();
        int computerScore = computerPlayer.hand.returnScore();
        ArrayList<String> gameNums = new ArrayList<>();
        System.out.println(playerScore);
        System.out.println(computerScore);
        if (playerScore > 21 && computerScore <= 21) {
            gameNums.add("loss");
            System.out.println("You lost");
        } else if (playerScore > 21 && computerScore > 21) {
            gameNums.add("loss");
            System.out.println("You both lost");
        } else if (playerScore <= 21 && computerScore > 21) {
            gameNums.add("win");
            System.out.println("You won");
        } else if (playerScore > computerScore && playerScore <= 21) {
            gameNums.add("win");
            System.out.println("You won");
        } else if (playerScore < computerScore && computerScore <= 21) {
            gameNums.add("loss");
            System.out.println("You lost");
        } else if (playerScore == computerScore) {
            gameNums.add("tie");
            System.out.println("You tied");
        }
        gameNum += 1;
        System.out.println("You have played " + gameNum + " game(s).");
    }



    public void blackJackMethods() {
        Hand hand = new Hand();
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Player playerone = new Player();
        for (int i = 0; i < hand.cards.size(); i++) {
            System.out.println(hand.cards.get(i));
        }
        System.out.println(hand.returnScore());
        System.out.println("Would you like another card");

    }

class Player {
    String name;
    Hand hand;
    int potValue;

    public boolean computerAI() {
        boolean anotherCard = true;
        Hand hand = new Hand();
        int score = hand.returnScore();
        if (score <= 16) {
            anotherCard = true;
        } else {
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
        for (int i = 0; i < cards.size(); i++) {
            if (cards.contains('A') || cards.contains('T') || cards.contains('J') || cards.contains('Q') ||
                    cards.contains('K')) {
                score += 10;
            }
            if (cards.contains('2')) {
                score += 2;
            }
            if (cards.contains('3')) {
                score += 3;
            }
            if (cards.contains('4')) {
                score += 4;
            }
            if (cards.contains('5')) {
                score += 5;
            }
            if (cards.contains('6')) {
                score += 6;
            }
            if (cards.contains('7')) {
                score += 7;
            }
            if (cards.contains('8')) {
                score += 8;
            }
            if (cards.contains('9')) {
                score += 9;
            }

        }
        return score;
    }

    public boolean GreaterOrLessThan21() {
        boolean under21 = true;
        int score = returnScore();
        if (score > 21) {
            under21 = false;
        } else if (score <= 21) {
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

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                deck[i][j] = deck[i][j];

            }

        }
    }

    public char deal(Object Player) {
        Random random = new Random();
        int cardNum = random.nextInt(52);
        for (int i = 0; i < usedCards.size(); i++) {
            if (cardNum == usedCards.get(i)) {
                cardNum = random.nextInt(52);
            }
        }
        usedCards.add(cardNum);
        Hand hand = new Hand();
        char cardID = hand.cards.get(cardNum);
        return cardID;

    }
}
}


