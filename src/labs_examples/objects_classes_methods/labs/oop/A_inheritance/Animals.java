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
            if (animalType.equalsIgnoreCase("bird")) {
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
        for (int i = 0; i < animalList.length; i++) {

            System.out.println("Is it a " + animalList[i] + "?");
            if (getUserInput().equals("yes")) {
                classification = animalList[i];
                System.out.println("Cool. I win.");
                break;
            } else if (getUserInput().equalsIgnoreCase("no")) {
                System.out.println("That's all the " + animalType + " I know. You win.");
            }

        }
        return classification;
    }

    //example of method overloading
    public String findMammalOrder(String[] animalList) {
        String animalType = "";
        for (int i = 0; i < animalList.length; i++) {
            System.out.println("Is it a " + animalList[i] + "?");
            // getUserInput();
            if (getUserInput().equals("yes")) {
                animalType = animalList[i];
                System.out.println("Great. Let's narrow that down");
                break;
            } else if (getUserInput().equalsIgnoreCase("no")) {
                System.out.println("Ok, let's try again.");
            }

        }
        return animalType;

    }

    public String findMammalOrder(String animalType) {
        System.out.println("Cool. So it's a " + animalType);
        return animalType;
    }

    public void printResult() {
        System.out.println("That's all the birds I know. You win");
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
        String[] otherBirdArrayBC = {"bee eater", "blackbird", "bluebird", "bluejay", "cardinal", "chicken", "crow",
                  "cuckoo"};
        String[] otherBirdArrayD = { "sparrow", "woodpecker", "pigeon",  "raven",
                "magpie",  "hummingbird", "swallow",  "quail", "guineafowl", "swan"};
        String[] songBirdArray = {"robin", "magpie", "mockingbird", "blackbird", "bluebird", "bluejay", "cardinal",
        "wren", "nightingale", "oriole", "uguisu"};
        String[] bigBirdArray = {"flamingo", "penguin", "kiwi", "emu", "ostrich", "stork", "crane", "ibis",
                "stork", "kakapo", "spoonbill", "umbrellabird"};
        String[] colorfulBirdArray = {"parrot", "bird of paradise", "robin", "finch", "toucan", "parakeet",
                "lorikeet", "macaw", "cockatoo", "lovebird", "oriole", "bee eater", "kakapo", "kingfisher",
                 "quetzal", "umbrellabird"};
        String[] seaBirdArray = {"seagull", "puffin", "booby", "cormorant", "albatross", "pelican", "penguin",
                "tern", "kingfisher", "moorhen", "spoonbill"};
        String[] gameBirdArray = {"grouse", "turkey", "pheasant", "goose", "partridge", "quail", "goose",
                "dove", "crane", "snipe", "duck"};
        String[] birdofPreyArray = {"owl", "eagle", "hawk", "falcon,", "osprey", "vulture", "buzzard", "kite",
                "condor"};
        List<String> list = new ArrayList<>();
        String[] birdList = {"big bird, for example, an ostrich", "game bird", "sea bird or water bird", "bird of prey",
                "colorful bird, such as a parrot", "song bird", "nother bird, not in any of the above categories"};
        animalClass animalClass = new animalClass();
        String birdType = animalClass.findAnimalClass(birdList);

        if (birdType == "big bird, for example, an ostrich") {
            findMammalOrder(bigBirdArray, "big birds");
        } else if (birdType == "game bird") {
            findMammalOrder(gameBirdArray, "game birds");
        } else if (birdType == "sea bird") {
            findMammalOrder(seaBirdArray, "sea birds");
        } else if (birdType == "bird of prey") {
            findMammalOrder(birdofPreyArray, "birds of prey");
        } else if (birdType == "colorful bird, such as a parrot") {
            findMammalOrder(colorfulBirdArray, "colorful birds");
        } else if (birdType == "song bird") {
            findMammalOrder(songBirdArray, "song birds");
        } else if (birdType == "nother bird, not in any of the above categories") {
            System.out.println("Does the bird's name start with b or c?");
            if (getUserInput().equalsIgnoreCase("yes")) {
                findMammalOrder(otherBirdArrayBC, "other birds");
                }
            else {
                findMammalOrder(otherBirdArrayD, "other birds");
                }

        } else {
            //example of overriding
            this.printResult();

        }
    }

    public void findFishOrder() {
        String[] edibleFishArray = {"tilapia", "barracuda", "anchovie", "tuna", "salmon", "bass", "catfish",
                "cod", "eel", "flounder", "grouper", "herring", "sardine", "shark", "swordfish", "trout",
        "pike"};
        String[] petFishArray = {"tang (dory fish)", "catfish", "tetra", "piranha", "shark", "clownfish", "angelfish",
                "betta", "goldfish", "angelfish", "pufferfish", "barb", "koi", "guppy", "minnow", "eel", "stingray",
                "molly", "silver dollar", "wrasse"};
        String[] otherFishArray = {"moray eel", "pike", "piranha", "shark", "pufferfish", "eel", "stingray", "barracuda",
        "swordfish", "wrasse"};
        List<String> list = new ArrayList<>();
        String[] fishTypeArray = {"edible fish", "pet fish", "other fish"};
        animalClass animalClass = new animalClass();
        String fishType = animalClass.findAnimalClass(fishTypeArray);
        if (fishType == "edible fish") {
            findMammalOrder(edibleFishArray, "edible fish");
        }
        if (fishType == "pet fish") {
            findMammalOrder(petFishArray, "pet fish");
        } if (fishType == "other fish") {
            findMammalOrder(otherFishArray, "fish");
        } else {
            System.out.println("Out of fish. You win. ");
        }

    }

    public void findReptileOrder() {
        String[] lizardArray = {"komodo dragon", "bearded dragon", "gila monster", "chameleon", "collared lizard",
                "gecko", "horned lizard", "legless lizard", "monitor", "frilled lizard", "iguana", "glass lizard",
                 "newt", "sand lizard", "thorny devil", "tuatara", "water dragon"};
        String[] snakeArray = {"boa", "anaconda", "cobra", "python", "mamba", "viper", "sea snake", "rattlesnake",
                "kingsnake", "garter snake"};
        String[] otherReptileArray = {"dinosaur", "turtle", "crocodile", "alligator", "tortoise", "caiman"};
        List<String> list = new ArrayList<>();
        String[] reptileTypeArray = {"lizard", "snake", "other reptile"};
        animalClass animalClass = new animalClass();
        String reptileType = animalClass.findAnimalClass(reptileTypeArray);

        if (reptileType == "lizard") {
            findMammalOrder(lizardArray, "lizards");
        }
        if (reptileType == "snake") {
            //instance of super keyword
            super.findMammalOrder(snakeArray, "snakes");
        }
        if (reptileType == "other reptile") {
            findMammalOrder(otherReptileArray, "other reptiles");
        } else {
            System.out.println("All out of reptiles. You win");
        }

    }

    public void findAmphibianOrder() {
        String[] amphibianArray = {"salamander", "frog", "toad", "axolotl", "olm"};
        findMammalOrder(amphibianArray, "amphibians");
    }

    public void findMammalOrders() {
        String[] mammalArray = {"rodent", "primate", "sea animal", "n Australian animal",
                "animal with horns, antlers, or tusks", "spiky or armored animal",
                "carnivore (not one of the above)", "herbivore (not one of the above)"};
        String[] carnivoreArray = {"cat type", "dog type", "bear type", "other"};
        String[] catTypeArray = {"housecat", "tiger", "lion", "leopard", "cheetah", "jaguar", "panther",
                "ocelot", "lynx", "bobcat", "mountain lion/cougar/puma", "liger", "serval"};
        String[] otherArray = {"weasel", "badger", "skunk", "wolverine", "civet", "bat", "beaver", "coati", "raccoon",
        "opossum", "mole", "mongoose", "red panda", "sloth", "hyrax", "stoat", "rabbit", "racoon"};
        String[] dogTypeArray = {"pet dog", "wolf", "fox", "hyena", "coyote", "jackal", "dingo"};
        String[] bearTypeArray = {"black bear", "grizzly bear", "brown bear", "polar bear", "panda bear", "sun bear",
                "sloth bear", "red panda", "spectacled bear"};
        String[] rodentArrayBH = {"badger", "beaver", "capybara", "coati", "chinchilla","civet", "chipmunk", "ferret", "fossa",
                "gopher", "groundhog","gerbil", "guinea pig", "hamster", "hare", "hyrax"} ;
        String[] rodentArrayI = {"squirrel", "rat", "mouse",  "meerkat", "prairie dog", "lemming", "mole",
                "rabbit",  "weasel", "skunk", "wolverine",  "raccoon",   "opossum", "mongoose",
        "pika", "stoat", "water vole"};
        String[] primateArray = {"ape", "monkey", "lemur", "tarsier"};
        String[] apeArray = {"human", "gorilla", "orangutan", "chimpanzee", "gibbon"};
        String[] monkeyArray = {"mandril", "macaque", "capuchin", "baboon", "spider monkey",
                "howler monkey", "squirrel monkey", "guenon", "tamarin", "patas monkey", "pygmy marmoset", "uakari"};
        String[] seaAnimalArray = {"walrus", "seal", "sea lion", "manatee", "platypus", "beaver", "whale",
                "orca/killer whale", "dolphin", "river dolphin", "hippo", "otter", "porpoise", "narwhal", "dugong",
        "water vole"};
        String[] australianArray = {"kangaroo", "wallaby", "wombat", "koala bear", "platypus", "tasmanian devil",
                "sugar glider/flying squirrel", "bandicoot", "cuscus", "numbat", "pademelon", "quokka", "quoll"};
        String[] hornAntlerTuskArray = {"antelope", "buffalo", "cow","giraffe", "elephant",   "water buffalo", "rhino", "deer", "goat",
                "sheep", "wildebeest", "moose", "caribou", "reindeer", "wild boar", "gazelle", "elk",  "impala",
                "kudu", "okapi", "markhor", "saola", "oryx", "walrus", "warthog", "yak", "zebu"};
        String[] spikyArray = {"hedgehog", "armadillo", "pangolin", "porcupine", "echidna"};
        String[] herbivoreArray = {"horse", "hippo", "zebra", "alpaca", "tapir", "llama", "dromedary", "donkey",
                "camel", "pig", "sheep", "goat", "chamois", "rabbit", "bat", "beaver", "coati", "raccoon",
                "fossa", "hare", "impala", "goat", "kudu", "okapi", "opossum", "mole", "mongoose", "mule", "red panda",
        "zonkey", "zorse"};
        animalClass animalClass = new animalClass();
        String mammalType = animalClass.findAnimalClass(mammalArray);
        if (mammalType == "rodent") {
            System.out.println("Does the rodent start with the letters A through H?");
            if (getUserInput().equalsIgnoreCase("yes")) {
                findMammalOrder(rodentArrayBH, "rodents");
            } else {
                findMammalOrder(rodentArrayI, "rodents");
            }
        }
        if (mammalType == "primate") {
            String primateType = animalClass.findAnimalClass(primateArray);

            if (primateType == "ape") {
                findMammalOrder(apeArray, "apes");
            } if (primateType == "monkey") {
                findMammalOrder(monkeyArray, "monkeys");
            } if (primateType == "lemur")  {
                findMammalOrder("lemur");
            } if (primateType == "tarsier") {
                findMammalOrder("tarsier");
            }
        }
        if (mammalType == "sea animal") {
            findMammalOrder(seaAnimalArray, "sea mammals");
        }
        if (mammalType == "n Australian animal") {
            findMammalOrder(australianArray, "australian mammals");
        }
        if (mammalType == "animal with horns, antlers, or tusks") {
            findMammalOrder(hornAntlerTuskArray, "tusked, horned, or antlered mammals");
        }
        if (mammalType == "spiky or armored animal") {
            findMammalOrder(spikyArray, "spiky or armored mammals");

        }
        if (mammalType == "carnivore (not one of the above)") {
            String carnivoreType = animalClass.findAnimalClass(carnivoreArray);
            if (carnivoreType == "cat type") {
                findMammalOrder(catTypeArray, "cats");
            }
            if (carnivoreType == "dog type") {
                findMammalOrder(dogTypeArray, "dogs");
            }
            if (carnivoreType == "bear type") {
                findMammalOrder(bearTypeArray, "bears");
            }
            if (carnivoreType == "other") {
                findMammalOrder(otherArray, "mammals");
            }

        } if (mammalType == "herbivore (not one of the above)") {
                findMammalOrder(herbivoreArray, "herbivores");
        }


    }
}


