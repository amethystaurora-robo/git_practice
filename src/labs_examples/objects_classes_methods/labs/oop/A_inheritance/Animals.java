package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.*;

public class Animals {
    boolean isVertebrate;
    String animalClass;
    String order;
    String family;
    String genus;
    String species;

    public boolean getIsVertebrate() {
        if(isVertebrate == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setIsVertebrate(boolean isVertebrate) {
       this.isVertebrate = isVertebrate;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getUserInput() {
        String b;
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextLine();
        return b;

    }
}

class Vertebrates extends Animals {
    public void findPhylum(String userAnswer) {
        System.out.println("Does the animal have a backbone?");
        System.out.println("Please enter 'yes' or 'no'");
        userAnswer = getUserInput();
        if (userAnswer.equalsIgnoreCase("yes")) {
            isVertebrate = true;
        }
        else if (userAnswer.equalsIgnoreCase("no")) {
            isVertebrate = false;
        }
        else {
            System.out.println("Error. Please type 'yes' or 'no'");
        }
    }
}

class animalClass extends Vertebrates {
    public void findClass(String userAnswer) {
        System.out.println("Please answer yes or no for the following:");
        System.out.println("Is the animal a fish?");
        userAnswer = getUserInput();
        switch (userAnswer) {
            case "yesFish":
                userAnswer.equalsIgnoreCase("yes");
                animalClass = "fish";
                break;
            case "noFish":
                userAnswer.equalsIgnoreCase("no");
                break;
        }
        System.out.println("Is the animal a bird?");
        userAnswer = getUserInput();
        switch (userAnswer) {
            
        }
        System.out.println("Is the animal a mammal?");
        System.out.println("Is the animal a reptile");
        System.out.println("Is the animal an amphibian");
    }
}

class order extends animalClass {

}

class family extends order {

}

class genus extends family {

}

class species extends genus {

}