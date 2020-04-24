package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.*;

public class Animals {
    boolean isVertebrate;
    String animalClass;
    String order;
    String family;
    String genus;
    String species;

    public static void main(String[] args) {
        Vertebrates vertebrates = new Vertebrates();
        
    }

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
        ArrayList<String> answerList = new ArrayList<>;
        System.out.println("Is the animal a fish?");
        System.out.println("Is the animal a bird?");
        System.out.println("Is the animal a mammal?");
        System.out.println("Is the animal a reptile");
        System.out.println("Is the animal an amphibian");
        for (int i = 0; i < 5; i++) {
            userAnswer = getUserInput();
            answerList.add(userAnswer);
        }
        switch (userAnswer) {
            case "fish":
                answerList.get(0).equalsIgnoreCase("yes");
                animalClass = "fish";
                break;
            case "bird":
                answerList.get(1).equalsIgnoreCase("yes");
                animalClass = "bird";
                break;
            case "mammal":
                answerList.get(2).equalsIgnoreCase("yes");
                animalClass = "mammal";
                break;
            case "reptile":
                answerList.get(3).equalsIgnoreCase("yes");
                animalClass = "reptile";
                break;
            case "amphibian":
                answerList.get(4).equalsIgnoreCase("yes");
                animalClass = "amphibian";
                break;
            default:
                System.out.println("Please answer yes to at least one of the options above");
        }
    }
}

class order extends animalClass {
    public void findBirdOrder() {
        String[] birdArray = {"parrot", "owl", "flamingo", "duck", "goose", "chicken", "dove",
                "sparrow", "penguin", "seagull", "turkey", "eagle", "hawk", "woodpecker", "swan", "ostrich"};
        for(int i = 0; i < birdArray.length; i++) {
            System.out.println("Is the bird a " + birdArray[i]);
            getUserInput();
            if (getUserInput().equalsIgnoreCase("yes")) {
                System.out.println("Yay. I solved it");
                break;
            }
            System.out.println("That's all the birds I know. You win.");
        }
    }
    public void findFishOrder() {
        String[] edibleFishArray = {"tilapia", "barracuda", "anchovie", "tuna", "salmon", "bass", "catfish"
        "cod", "eel", "flounder", "grouper", "herring", "sardine", "shark", "swordfish", "trout"};
        String[] petFishArray = {"catfish", "tetra", "piranha", "shark", "clownfish", "angelfish", "betta", "goldfish",
        "angelfish", "pufferfish", "barb", "koi", "guppy", "minnow", "eel", "stingray"};
        System.out.println("Is it a fish you eat?");
        getUserInput();
        if (getUserInput().equalsIgnoreCase("yes")) {
            for(int i = 0; i < edibleFishArray.length; i++) {
                System.out.println("Is the bird a " + edibleFishArray[i]);
                getUserInput();
                if (getUserInput().equalsIgnoreCase("yes")) {
                    System.out.println("Yay. I solved it.");
                    break;
                }
            }
        }
        else if (getUserInput().equalsIgnoreCase("no")) {
            System.out.println("Is the fish a pet?");
            getUserInput();
            if(getUserInput().equalsIgnoreCase("yes")) {
                for (int i = 0; i < petFishArray.length; i++) {
                    System.out.println("Is the fish a " + petFishArray[i]);
                    getUserInput();
                    if (getUserInput().equalsIgnoreCase("yes")) {
                        System.out.println("Yay. I solved it.");
                        break;
                    }
                }
            }
            else {
                System.out.println("That's all the fish I know. You win.");
            }
        }


    }
}

class family extends order {

}

class genus extends family {

}

class species extends genus {

}