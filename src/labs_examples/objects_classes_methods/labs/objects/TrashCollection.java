package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
//functions of trash collection app
//add a transaction
//select from a dropdown menu
//pie chart calculator
//info buttons
//history
/* function add transaction
 * get user input
 * select from dropdown menu
 * save user input
 * display under history tab
 * info button
 * on mouse click
 * get info from database
 * display trash info
 * function calculate percentages
 * math language
 * function order categories by percentage, low to high
 *
 * front end
 * add transaction requires + button
 * user input requires input box
 * dropdown menu
 * mini graphics for items
 * tiny i for info
 * tabular history and pie chart
 * order of percentages affects color of pie chart
 * display pie chart
 *
 * BASIC BUDGETING APP TO START
 * GET USER INPUT
 * USER CHOOSES FROM ARRAY OF OPTIONS
 * (TO DO: CREATE TRASH ARRAY)
 * TRASH ARRAY MATCHES WITH CSV FILE IN DIFFERENT CATEGORIES
 * USER INPUT SAVED TO FILE
 * VIEW USER INPUT FILE IN MAIN METHOD
 * AUTOMATIC CALCULATOR WRITES EQUATION FOR PERCENTAGES OF TRASH TYPE
 *
 * */
import java.sql.*;
import java.util.*;
import java.lang.Math;
import java.io.*;
import java.nio.*;

public class TrashCollection {
    public static void main(String[] args) {
        getUserInput();
    }

    public static String[] getUserInput() {
        System.out.println("Would you like to add something?");
        String[] userHistory = new String[0];
        Scanner scanner = new Scanner(System.in);
        boolean userChoice = false;
        String userInput;
        userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            userChoice = true;
        } else {
            userChoice = false;
        }
        while (userChoice == true) {
            System.out.println("What did you throw away?");
            for (int i = 0; i < userHistory.length; i++) {
                userHistory[i] = scanner.nextLine();
            }

        }
        userHistory.toString();
        return userHistory;
    }
}


    //TO DO: ARRANGE THIS BETTER
    /*String[] trashList = new String[];
    trashList = {"pesticides", "animal dung", "fertilizer", "animal bones", "food waste",
            "sharp objects", "urine and blood samples", "discarded PPE", "microbiological cultures",
            "used bandages", "furniture", "appliances", "electronic devices", "construction waste", "scrap metal",
            "plastic straw", "aluminum foil", "paper plates", "napkins or tissues", "paper", "batteries", "cardboard",
            "glass", "cans", "textiles", "shoes", "yard waste", "light bulbs", "cartons", "styrofoam", "packaging",
            "packing peanuts", "bubble wrap", "plastic takeaway containers", "expired medications", "aerosol spray cans",
            "paints", "tupperware containers", "shampoo/conditioner bottles", "liquid hand soap bottles", "toys", "signs",
            "reusable water bottle", "pipes", "shopping bags", "juice bottles", "plastic film", "fishing nets", "toothbrush",
            "egg carton", "cotton swabs, cottonballs", "sanitary pads/tampons", "detergent bottles", "diapers", "razors",
            "balloons", "lighters", "gum", "nylon"};
    public int calculateTrash(int trashCount) {
        //calculate trash consumption, count number of instances in userHistory of trashlist, then make them into percentages
        for (int j = 0; j < userHistory.length; j++) {
            for (int i = 0; i < trashList.length; i++) {
                boolean c = userHistory[j].equals(trashList[i]);
                if (c == true) {
                    trashCount++;
                }
                int trashCounts[] = new Array;


            }
        }

        final int trashCount1 = trashCount;
        return trashCount1;
    }*/


