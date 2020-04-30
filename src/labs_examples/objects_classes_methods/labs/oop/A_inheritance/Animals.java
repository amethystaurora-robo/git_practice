package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.*;

public class Animals {
    boolean isVertebrate = true;
    String animalClass;
    String order;
    String family;
    String genus;
    String species;

    public static void main(String[] args) {
        Vertebrates vertebrates = new Vertebrates();

    }

    public String getUserInput() {
        String b;
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextLine();
        return b;

    }

    public void findAnimalOrder(String[] animalList, String animalType) {
        for(int i = 0; i < animalList.length; i++) {
            System.out.println("Is it a " + animalList[i]);
            getUserInput();
            if (getUserInput().equalsIgnoreCase("yes")) {
                System.out.println("Yay. I solved it");
                break;
            }
        }
        System.out.println("That's all the " + animalType + " I know. You win.");
    }

    public void findMammalOrder(String[] animalList, String classification) {
        for(int i = 0; i < animalList.length; i++) {
            System.out.println("Is it a " + animalList[i]);
            getUserInput();
            if (getUserInput().equalsIgnoreCase("yes")) {
                classification = animalList[i];
                System.out.println("Great. Let's narrow that down");
                break;
            }

        }
        System.out.println("That's all the types I know. You win.");
    }

    public boolean findIsVertebrate() {
        System.out.println("Does the animal have a backbone?");
        getUserInput();
        if (getUserInput().equalsIgnoreCase("yes")) {
            isVertebrate = true;
        } else {
            System.out.println("You got me. I don't know any invertebrates");
        }
        return isVertebrate;
    }

    public boolean getIsVertebrate() {
        if(isVertebrate == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setIsVertebrate(String userInput) {
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
    public void findAnimalClass() {
        String[] animalClassArray = {"bird", "fish", "reptile", "amphibian", "mammal"};
        findMammalOrder(animalClassArray, animalClass);
    }
}

class order extends animalClass {

    public void findBirdOrder() {
        String[] otherBirdArray = { "chicken", "sparrow", "woodpecker", "pigeon", "crow", "raven", "magpie",
                "mockingbird", "blackbird", "hummingbird", "bluebird", "swallow",  "cuckoo", "bluejay",
                "cardinal", "wren", "nightingale", "quail", "guineafowl", "swan"};
        String[] bigBirdArray = {"flamingo", "penguin", "kiwi", "emu", "ostrich", "stork", "crane", "ibis",
                "stork"};
        String[] colorfulBirdArray = {"parrot", "bird of paradise", "robin", "finch", "toucan", "parakeet",
                "lorikeet", "macaw", "cockatoo", "lovebird"};
        String[] seaBirdArray = {"seagull", "puffin", "booby", "cormorant", "albatross", "pelican", "penguin",
                "tern"};
        String[] gameBirdArray = {"grouse", "turkey", "pheasant", "goose", "partridge", "quail", "goose",
                "dove", "crane", "snipe", "duck"};
        String[] birdofPreyArray = {"owl", "eagle", "hawk", "falcon,", "osprey", "vulture", "buzzard", "kite",
                "condor"};
        findMammalOrder(otherBirdArray, order);
        findMammalOrder(bigBirdArray, order);
        findMammalOrder(colorfulBirdArray, order);
        findMammalOrder(seaBirdArray, order);
        findMammalOrder(gameBirdArray, order);
        findMammalOrder(birdofPreyArray, order);
    }

    public void findFishOrder() {
        String[] edibleFishArray = {"tilapia", "barracuda", "anchovie", "tuna", "salmon", "bass", "catfish",
                "cod", "eel", "flounder", "grouper", "herring", "sardine", "shark", "swordfish", "trout"};
        String[] petFishArray = {"catfish", "tetra", "piranha", "shark", "clownfish", "angelfish", "betta", "goldfish",
                "angelfish", "pufferfish", "barb", "koi", "guppy", "minnow", "eel", "stingray"};
        findMammalOrder();

    }

    public void findReptileOrder() {
        String[] lizardArray = {"komodo dragon", "bearded dragon", "gila monster", "chameleon", "collared lizard",
        "gecko", "horned lizard", "legless lizard", "monitor"};
        String[] snakeArray = {"boa", "anaconda", "cobra", "python", "mamba", "viper", "sea snake", "rattlesnake",
        "kingsnake", "garter snake"};
        String[] otherReptileArray = {"dinosaur", "turtle", "crocodile", "alligator", "tortoise"};
    }

    public void findAmphibianOrder() {
        String[] amphibianArray = {"salamander", "frog", "toad"};
        findAnimalOrder(amphibianArray, "amphibians");
    }

    public  void findMammalOrder() {
        String[] mammalArray = {"rodent", "primate", "sea animal", "n Australian animal",
                "animal with horns, antlers, or tusks", "spiky or armored animal",
                "carnivore (not one of the above)", "other"};
        findMammalOrder(mammalArray, "mammals");
    }
}

class family extends order {

    public void findCarnivoreFamily() {
        String[] carnivoreArray = {"cats", "dogs", "bears", "other"};
        findMammalOrder(carnivoreArray, "carnivore");

    }

    public void findRodentFamily() {
        String[] rodentArray = {"squirrel", "rat", "mouse", "groundhog", "meerkat", "prairie dog", "capybara",
        "hamster", "chinchilla", "beaver", "gerbil", "guinea pig", "mole"};
        findMammalOrder(rodentArray, "rodent");

    }

    public void findPrimateFamily() {
        String[] primateArray = {"ape", "monkey", "lemur", "tarsier"};
        String[] apeArray = {"human", "gorilla", "orangutan", "chimpanzee", "gibbon"};
        String[] monkeyArray = {"mandril", "macaque", "capuchin", "baboon", "spider monkey",
                "howler monkey", "squirrel monkey"};
        findMammalOrder(primateArray, "primates");
        findMammalOrder(apeArray, "apes");
        findMammalOrder(monkeyArray, "monkeys");

    }

    public void findSeaAnimalFamily() {
        String[] seaAnimalArray = {"walrus", "seal", "sea lion", "manatee", "platypus", "beaver", "whale",
        "dolphin", "porpoise", "hippo", "otter", "porpoise", "narwhal"};
        findMammalOrder(seaAnimalArray, "sea animals");

    }

    public void findAustralianFamily() {
        String[] australianArray = {"kangaroo", "wallaby", "wombat", "koala bear", "platypus", "tasmanian devil",
        "sugar glider"};
        findMammalOrder(australianArray, "australian animals");

    }

    public void findHerbivoreFamily() {
        String[] herbivoreArray = {"giraffe", "elephant", "cow", "buffalo", "rhino", "deer", "goat", "sheep",
                 "wildebeest", "moose", "caribou", "reindeer", "gazelle", "elk", "antelope"};
        findMammalOrder(herbivoreArray, "herbivores");


    }

    public void findSpikyFamily() {
        String[] spikyArray = {"hedgehog", "armadillo", "pangolin", "porcupine", "echidna"};
        findMammalOrder(spikyArray, "spiky or armored animal");
    }

    public void findOtherFamily() {
        String[] otherFamilyArray = {};
    }

}
