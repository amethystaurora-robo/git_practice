package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.*;

public class Animals {
    boolean isVertebrate = true;
    String animalClass;
    String order;

    public static void main(String[] args) {
        Vertebrates vertebrates = new Vertebrates();
        animalClass animalClass1 = new animalClass();
        order orders = new order();
        String[] animalClassArray = {"bird", "fish", "reptile", "amphibian", "mammal"};

        boolean isAVertebrate = vertebrates.findPhylum("yes");
        if (isAVertebrate == true) {
            String animalType = animalClass1.findAnimalClass(animalClassArray);
            if (animalType.equalsIgnoreCase(("bird"))) {
                orders.findBirdOrder();
            } else if (animalType.equalsIgnoreCase("fish")) {
                orders.findFishOrder();
            } else if (animalType.equalsIgnoreCase("reptile")) {
                orders.findReptileOrder();
            } else if (animalType.equalsIgnoreCase("amphibian")) {
                orders.findAmphibianOrder();
            } else {
                orders.findMammalOrders();
            }
        } else {
            System.out.println("You got me. I don't know any invertebrates");
        }


    }

    public String getUserInput() {
        String b;
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextLine();
        return b;
    }

    public String findMammalOrder(String[] animalList, String animalType) {
        String classification = "";
        while (getUserInput().equalsIgnoreCase("no")) {

                  findMammalOrder(animalList);




            }
        getUserInput().equalsIgnoreCase("yes");    
   
        System.out.println("That's all the " + animalType + " I know. You win.");
    }

    public String findMammalOrder(String[] animalList) {
        String classification = "";
        for (int i = 0; i < animalList.length; i++) {

            System.out.println("Is it a " + animalList[i] + "?");
            // getUserInput();
            if (getUserInput().equals("yes")) {
                classification = animalList[i];
                System.out.println("Great. Let's narrow that down");
                break;
            } else if (getUserInput().equalsIgnoreCase("no")) {
                System.out.println("Ok, let's try again.");
            }

        }
        return classification;

    }

    public List<String> findSpecificAnimal(String[] animalList, List<String> list) {
        for (int i = 0; i < animalList.length; i++) {
            if (getUserInput().equalsIgnoreCase("yes")) {
                list.add("yes");
            }
            else if (getUserInput().equalsIgnoreCase("no")) {
                list.add("no");
            }

        }
        return list;
    }



    public void printResult() {
        System.out.println("That's all the I know. You win");
    }

}

class Vertebrates extends Animals {
    public boolean findPhylum(String userAnswer) {
        System.out.println("Does the animal have a backbone?");
        System.out.println("Please enter 'yes' or 'no'");
        userAnswer = getUserInput();
        if (userAnswer.equalsIgnoreCase("yes")) {
            isVertebrate = true;
        } else if (userAnswer.equalsIgnoreCase("no")) {
            isVertebrate = false;
        } else {
            System.out.println("Error. Please type 'yes' or 'no'");
        }
        return isVertebrate;
    }
}

class animalClass extends Vertebrates {
    public String findAnimalClass(String[] animalArray) {
        String whatKindIsIt = findMammalOrder(animalArray);
        return whatKindIsIt;
    }
}

class order extends animalClass {
    @Override
    public void printResult() {
        System.out.println("That's all the birds I know. You win");
    }

    public void findBirdOrder() {
        String[] otherBirdArray = {"chicken", "sparrow", "woodpecker", "pigeon", "crow", "raven", "magpie",
                "mockingbird", "blackbird", "hummingbird", "bluebird", "swallow", "cuckoo", "bluejay",
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
        List<String> list = new ArrayList<>();
        String[] birdList = {"big bird, for example, an ostrich", "game bird", "sea bird", "bird of prey",
                "colorful bird, such as a parrot", "nother bird, not in any of the above categories"};
        animalClass animalClass = new animalClass();
        String birdType = animalClass.findAnimalClass(birdList);
        //findSpecificAnimal(birdList, list);

        if (birdType == "big bird, for example, an ostrich") {
            findAnimalOrder(bigBirdArray, "big birds");
        } else if (birdType == "game bird") {
            findAnimalOrder(gameBirdArray, "game birds");
        } else if (birdType == "sea bird") {
            findAnimalOrder(seaBirdArray, "sea birds");

        } else if (birdType == "bird of prey") {
            findAnimalOrder(birdofPreyArray, "birds of prey");

        } else if (birdType == "colorful bird, such as a parrot") {
            findAnimalOrder(colorfulBirdArray, "colorful birds");

        } else if (birdType == "nother bird, not in any of the above categories") {
            findAnimalOrder(otherBirdArray, "other birds");

        } else {
            //example of overriding
            this.printResult();

        }
    }

    public void findFishOrder() {
        String[] edibleFishArray = {"tilapia", "barracuda", "anchovie", "tuna", "salmon", "bass", "catfish",
                "cod", "eel", "flounder", "grouper", "herring", "sardine", "shark", "swordfish", "trout"};
        String[] petFishArray = {"catfish", "tetra", "piranha", "shark", "clownfish", "angelfish", "betta", "goldfish",
                "angelfish", "pufferfish", "barb", "koi", "guppy", "minnow", "eel", "stingray"};
        List<String> list = new ArrayList<>();
        String[] fishTypeArray = {"edible fish", "pet fish"};
        findSpecificAnimal(fishTypeArray, list);
        if (list.get(0) == "yes") {
            findAnimalOrder(edibleFishArray, "edible fish");
        }
        if (list.get(1) == "yes") {
            findAnimalOrder(petFishArray, "pet fish");
        } else {
            System.out.println("Out of fish. You win. ");
        }

    }

    public void findReptileOrder() {
        String[] lizardArray = {"komodo dragon", "bearded dragon", "gila monster", "chameleon", "collared lizard",
                "gecko", "horned lizard", "legless lizard", "monitor"};
        String[] snakeArray = {"boa", "anaconda", "cobra", "python", "mamba", "viper", "sea snake", "rattlesnake",
                "kingsnake", "garter snake"};
        String[] otherReptileArray = {"dinosaur", "turtle", "crocodile", "alligator", "tortoise"};
        List<String> list = new ArrayList<>();
        String[] reptileTypeArray = {"lizard", "snake", "other reptile"};
        findSpecificAnimal(reptileTypeArray, list);
        if (list.get(0) == "yes") {
            findAnimalOrder(lizardArray, "lizards");
        }
        if (list.get(1) == "yes") {
            //instance of super keyword
            super.findAnimalOrder(snakeArray, "snakes");
        }
        if (list.get(2) == "yes") {
            findAnimalOrder(otherReptileArray, "other reptiles");
        } else {
            System.out.println("All out of reptiles. You win");
        }

    }

    public void findAmphibianOrder() {
        String[] amphibianArray = {"salamander", "frog", "toad"};
        findAnimalOrder(amphibianArray, "amphibians");
    }

    public void findMammalOrders() {
        String[] mammalArray = {"rodent", "primate", "sea animal", "n Australian animal",
                "animal with horns, antlers, or tusks", "spiky or armored animal",
                "carnivore (not one of the above)"};
        String[] carnivoreArray = {"cat type", "dog type", "bear type"};
        String[] catTypeArray = {"housecat", "tiger", "lion", "leopard", "cheetah", "jaguar", "cougar", "panther",
                "ocelot", "lynx", "bobcat", "mountain lion"};
        String[] dogTypeArray = {"pet dog", "wolf", "fox", "hyena", "coyote", "jackal", "dingo"};
        String[] bearTypeArray = {"black bear", "brown bear", "polar bear", "panda bear", "sun bear", "sloth bear"};
        String[] rodentArray = {"squirrel", "rat", "mouse", "groundhog", "meerkat", "prairie dog", "capybara",
                "hamster", "chinchilla", "beaver", "gerbil", "guinea pig", "mole"};
        String[] primateArray = {"ape", "monkey", "lemur", "tarsier"};
        String[] apeArray = {"human", "gorilla", "orangutan", "chimpanzee", "gibbon"};
        String[] monkeyArray = {"mandril", "macaque", "capuchin", "baboon", "spider monkey",
                "howler monkey", "squirrel monkey"};
        String[] seaAnimalArray = {"walrus", "seal", "sea lion", "manatee", "platypus", "beaver", "whale",
                "dolphin", "porpoise", "hippo", "otter", "porpoise", "narwhal"};
        String[] australianArray = {"kangaroo", "wallaby", "wombat", "koala bear", "platypus", "tasmanian devil",
                "sugar glider"};
        String[] hornAntlerTuskArray = {"giraffe", "elephant", "cow", "buffalo", "rhino", "deer", "goat", "sheep",
                "wildebeest", "moose", "caribou", "reindeer", "gazelle", "elk", "antelope"};
        String[] spikyArray = {"hedgehog", "armadillo", "pangolin", "porcupine", "echidna"};
        List<String> list = new ArrayList<>();
        findSpecificAnimal(mammalArray, list);
        if (list.get(0) == "yes") {
            findAnimalOrder(rodentArray, "rodents");
        }
        if (list.get(1) == "yes") {
            List<String> primateList = new ArrayList<>();
            findSpecificAnimal(primateArray, primateList);
            if (primateList.get(0) == "yes") {
                findAnimalOrder(apeArray, "apes");
            }
            if (primateList.get(1) == "yes") {
                findAnimalOrder(monkeyArray, "monkeys");
            }
            if (primateList.get(2) == "yes" || primateList.get(3) == "yes") {
                System.out.println("Yay. I solved it.");
            }

        }
        if (list.get(2) == "yes") {
            findAnimalOrder(seaAnimalArray, "sea mammals");
        }
        if (list.get(3) == "yes") {
            findAnimalOrder(australianArray, "australian mammals");
        }
        if (list.get(4) == "yes") {
            findAnimalOrder(hornAntlerTuskArray, "tusked, horned, or antlered mammals");
        }
        if (list.get(5) == "yes") {
            findAnimalOrder(spikyArray, "spiky or armored mammals");

        }
        if (list.get(6) == "yes") {
            List<String> carnivoreList = new ArrayList<>();
            findSpecificAnimal(carnivoreArray, carnivoreList);
            if (carnivoreList.get(0) == "yes") {
                findSpecificAnimal(catTypeArray, carnivoreList);
            }
            if (carnivoreList.get(1) == "yes") {
                findSpecificAnimal(dogTypeArray, carnivoreList);
            }
            if (carnivoreList.get(2) == "yes") {
                findSpecificAnimal(bearTypeArray, carnivoreList);
            }

        }


    }
}


