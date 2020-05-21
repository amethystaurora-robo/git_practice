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
        String[] animalClassArray = {"mammal", "fish", "reptile", "amphibian", "bird"};

        boolean isAVertebrate = vertebrates.findPhylum("yes");
        if (isAVertebrate == true) {
            String animalType = animalClass1.findAnimalClass(animalClassArray);
            if (animalType.equalsIgnoreCase("mammal")) {
                orders.findMammalOrders();
            } else if (animalType.equalsIgnoreCase("fish")) {
                orders.findFishOrder();
            } else if (animalType.equalsIgnoreCase("reptile")) {
                orders.findReptileOrder();
            } else if (animalType.equalsIgnoreCase("amphibian")) {
                orders.findAmphibianOrder();
            } else {
                orders.findBirdOrder();
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

    public String findMammalOrder(String[] animalListAH, String[] animalListI, String animalType) {
        String classification = "";
        System.out.println("Does the " + animalType + " start with the letters a through h?");
        if (getUserInput().equalsIgnoreCase("yes")) {
            findMammalOrder(animalListAH, animalType);
        }
        else {
            findMammalOrder(animalListI, animalType);
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
        String[] otherBirdArrayAH = {"bee eater", "blackbird", "bluebird", "bluejay", "cardinal", "chicken", "crow",
                  "cuckoo", "hummingbird"};
        String[] otherBirdArrayI = { "sparrow", "woodpecker", "pigeon",  "raven",
                "magpie",  "swallow",  "quail", "guineafowl", "swan"};
        String[] songBirdArray = {"robin", "magpie", "mockingbird", "blackbird", "bluebird", "bluejay", "cardinal",
        "wren", "nightingale", "oriole", "uguisu"};
        String[] bigBirdArray = {"flamingo", "penguin", "kiwi", "emu", "ostrich", "stork", "crane", "ibis",
                "stork", "kakapo", "spoonbill", "umbrellabird"};
        String[] colorfulBirdArrayAH = {"bee eater", "bird of paradise",  "finch", "cockatoo"};
        String[] colorfulBirdArrayI = {"toucan", "parakeet",
                "lorikeet", "macaw", "lovebird", "oriole",  "kakapo", "kingfisher",
                 "quetzal", "umbrellabird", "parrot","robin"};
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
            findMammalOrder(colorfulBirdArrayAH, colorfulBirdArrayI, "colorful birds");
        } else if (birdType == "song bird") {
            findMammalOrder(songBirdArray, "song birds");
        } else if (birdType == "nother bird, not in any of the above categories") {
            findMammalOrder(otherBirdArrayAH, otherBirdArrayI, "birds");
        } else {
            //example of overriding
            this.printResult();

        }
    }

    public void findFishOrder() {
        String[] edibleFishArrayAH = {"cod", "eel", "flounder", "grouper", "herring", "barracuda", "anchovie", "bass", "catfish"};
        String[] edibleFishArrayI = {"sardine", "shark", "swordfish", "trout",
        "pike","tilapia", "tuna", "salmon"};
        String[] petFishArrayAH = {"tang (dory fish)", "catfish", "clownfish", "angelfish", "eel",
                "betta", "goldfish", "angelfish", "barb", "guppy"};
        String[] petFishArrayI = {"koi",  "minnow", "stingray",
                "molly", "silver dollar", "wrasse", "tang (dory fish", "tetra", "piranha", "shark", "pufferfish"};
        String[] otherFishArray = {"moray eel", "pike", "piranha", "shark", "pufferfish", "eel", "stingray", "barracuda",
        "swordfish", "wrasse"};
        List<String> list = new ArrayList<>();
        String[] fishTypeArray = {"edible fish", "pet fish", "other fish"};
        animalClass animalClass = new animalClass();
        String fishType = animalClass.findAnimalClass(fishTypeArray);
        if (fishType == "edible fish") {
            findMammalOrder(edibleFishArrayAH, edibleFishArrayI, "edible fish");
        }
        if (fishType == "pet fish") {
            findMammalOrder(petFishArrayAH, petFishArrayI, "pet fish");
        } if (fishType == "other fish") {
            findMammalOrder(otherFishArray, "fish");
        } else {
            System.out.println("Out of fish. You win. ");
        }

    }

    public void findReptileOrder() {
        String[] lizardArrayAH = {"bearded dragon", "gila monster", "chameleon", "collared lizard",
                "gecko", "frilled lizard", "horned lizard", "glass lizard"};
        String[] lizardArrayI = {"legless lizard", "monitor",  "iguana",
                 "newt", "sand lizard", "thorny devil", "tuatara", "water dragon", "komodo dragon"};
        String[] snakeArray = {"boa", "anaconda", "cobra", "python", "mamba", "viper", "sea snake", "rattlesnake",
                "kingsnake", "garter snake"};
        String[] otherReptileArray = {"dinosaur", "turtle", "crocodile", "alligator", "tortoise", "caiman"};
        List<String> list = new ArrayList<>();
        String[] reptileTypeArray = {"lizard", "snake", "other reptile"};
        animalClass animalClass = new animalClass();
        String reptileType = animalClass.findAnimalClass(reptileTypeArray);

        if (reptileType == "lizard") {
            findMammalOrder(lizardArrayAH, lizardArrayI, "lizards");
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
        String[] mammalArray = {"rodent", "primate", "sea or water dwelling animal", "n Australian animal",
                "animal with horns, antlers, or tusks", "spiky or armored animal",
                "carnivore (insectivore, omnivore, or not one of the above)", "herbivore (insectivore, omnivore, or not one of the above)"};
        String[] carnivoreArray = {"cat type", "dog type", "bear type", "other"};
        String[] catTypeArray = {"housecat", "tiger", "lion", "leopard", "cheetah", "jaguar", "panther",
                "ocelot", "lynx", "bobcat", "mountain lion/cougar/puma", "liger", "serval"};
        String[] otherArrayAH = { "badger", "hyrax", "civet", "bat", "beaver", "coati"};
        String[] otherArrayI = {"opossum", "mole", "mongoose", "red panda", "sloth",  "stoat", "rabbit",
                "racoon", "weasel", "skunk", "wolverine"};
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
        String[] hornAntlerTuskArrayAH = {"antelope", "buffalo", "caribou", "cow","deer","giraffe", "gaur", "elephant", "elk",
                "gazelle","goat"};
        String[] hornAntlerTuskArrayI = {"water buffalo", "rhino",  "sheep", "wildebeest", "moose",  "reindeer", "wild boar",    "impala",
                "kudu", "okapi", "markhor", "saola", "oryx", "walrus", "warthog", "yak", "zebu"};
        String[] spikyArray = {"hedgehog", "armadillo", "pangolin", "porcupine", "echidna"};
        String[] herbivoreArrayAH = {"horse", "hippo",  "alpaca",  "dromedary", "donkey",
                "camel", "goat", "fossa", "hare", "chamois", "bat", "beaver", "coati"};
        String[] herbivoreArrayI = {"raccoon", "impala", "kudu", "okapi", "opossum", "mole", "mongoose", "mule", "red panda",
        "zonkey", "zorse", "zebra", "tapir", "llama", "pig", "sheep", "rabbit"};
        animalClass animalClass = new animalClass();
        String mammalType = animalClass.findAnimalClass(mammalArray);
        if (mammalType == "rodent") {
            findMammalOrder(rodentArrayBH, rodentArrayI, "rodents");
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
        if (mammalType == "sea or water dwelling animal") {
            findMammalOrder(seaAnimalArray, "sea mammals");
        }
        if (mammalType == "n Australian animal") {
            findMammalOrder(australianArray, "australian mammals");
        }
        if (mammalType == "animal with horns, antlers, or tusks") {
            findMammalOrder(hornAntlerTuskArrayAH, hornAntlerTuskArrayI, "tusked, horned, or antlered mammals");
        }
        if (mammalType == "spiky or armored animal") {
            findMammalOrder(spikyArray, "spiky or armored mammals");

        }
        if (mammalType == "carnivore (insectivore, omnivore, or not one of the above)") {
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
                findMammalOrder(otherArrayAH, otherArrayI, "mammals");
            }

        } if (mammalType == "herbivore (insectivore, omnivore, or not one of the above)") {
                findMammalOrder(herbivoreArrayAH, herbivoreArrayI, "herbivores");
        }
    }
}


