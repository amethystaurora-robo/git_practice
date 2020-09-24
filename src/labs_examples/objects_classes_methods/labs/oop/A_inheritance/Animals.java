package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.*;
import java.util.Random;

public class Animals<animalType> {
    boolean isVertebrate = true;


    public static void main(String[] args) {
        Vertebrates vertebrates = new Vertebrates();
        animalClass animalClass1 = new animalClass();
        order orders = new order();
        String[] animalClassArray = {"mammal", "bird", "reptile", "fish", "amphibian"};

        boolean isAVertebrate = vertebrates.findPhylum("yes");
        if (isAVertebrate == true) {
            String animalType = animalClass1.findAnimalClass(animalClassArray);
            if (animalType.equalsIgnoreCase("mammal")) {
                orders.findMammalOrders();
            } else if (animalType.equalsIgnoreCase("bird")) {
                orders.findBirdOrder();
            } else if (animalType.equalsIgnoreCase("reptile")) {
                orders.findReptileOrder();
            } else if (animalType.equalsIgnoreCase("fish")) {
                orders.findFishOrder();
            } else {
                orders.findAmphibianOrder();
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

    public void printRandomFacts(String[] factArray, String animalType) {
        Random rand = new Random();
        System.out.println("Did you know? A " + animalType + factArray[rand.nextInt(24)]);
    }

    public String findMammalOrder(String[] animalList, String animalType) {
        String classification = "";
        String[] randomFactArray = {"'s heart is located on its head", "can sleep for 3 years", "'s fingerprints" +
                " are so indistinguishable from humans that they have been confused at crime scenes", " has 4 noses",
        " is the only mammal that can't jump", " becomes hypnotized when having its belly rubbed", " takes two weeks to digest food",
        " always turns left when leaving its home", " has no vocal chords", " can't fart", " cannot vomit", " is so small " +
                " when born it can be held in the palm of one's hand", " can run faster than horses", " can drown", " sings more than" +
                "2000 times a day", " also undergoes menopause", " can sleep standing up, but only dream while lying down",
        " doesn't like to be poked with a stick", " likes belly rubs", " out there wants you to know you're not alone", " is taller than you" +
                "could ever be", " couldn't hurt a fly", " has hopes and dreams", " can't do math", " doesn't know 5x5",
                " has more genes than you do"};
        for (int i = 0; i < animalList.length; i++) {

            System.out.println("Is it " + articleDeterminer(animalList[i]) + " " + animalList[i] + "?");
            QuestionCount questionCount = new QuestionCount();
            questionCount.printQuestionNum();
            if (getUserInput().equals("yes")) {
                classification = animalList[i];
                System.out.println("Cool. I win.");
                printRandomFacts(randomFactArray, classification);
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
        QuestionCount questionCount = new QuestionCount();
        questionCount.printQuestionNum();
        if (getUserInput().equalsIgnoreCase("yes")) {
            findMammalOrder(animalListAH, animalType);
        }
        else {
            findMammalOrder(animalListI, animalType);
        }
        return classification;
    }

    public String findMammalOrder(String[] animalListAG, String[] animalListHM, String[] animalListNR, String[] animalListSZ, String animalType) {
        String classification = "";
        System.out.println("Does the " + animalType + " start with the letters a through g?");
        QuestionCount questionCount = new QuestionCount();
        questionCount.printQuestionNum();
        if (getUserInput().equalsIgnoreCase("yes")) {
            findMammalOrder(animalListAG, animalType);
        }
        else {
            System.out.println("Does the " + animalType + " start with the letters h through m?");
            if (getUserInput().equalsIgnoreCase("yes")) {
                findMammalOrder(animalListHM, animalType);
            }
            else {
                System.out.println("Does the " + animalType + "start with letters n through r?");
                if (getUserInput().equalsIgnoreCase("yes")) {
                    findMammalOrder(animalListNR, animalType);
                } else {
                    findMammalOrder(animalListSZ, animalType);
                }
            }
        }
        return classification;
    }

    public String findMammalOrder(String[] animalListAH, String[] animalListIO, String[] animalListPZ, String animalType) {
        String classification = "";
        System.out.println("Does the " + animalType + " start with the letters a through h?");
        QuestionCount questionCount = new QuestionCount();
        questionCount.printQuestionNum();
        if (getUserInput().equalsIgnoreCase("yes")) {
            findMammalOrder(animalListAH, animalType);
        }
        else {
            System.out.println("Does the " + animalType + " start with the letters i through o?");
            if (getUserInput().equalsIgnoreCase("yes")) {
                findMammalOrder(animalListIO, animalType);
            }
            else {
                findMammalOrder(animalListPZ, animalType);
            }
        }
        return classification;
    }

    //example of method overloading
    public String findMammalOrder(String[] animalList) {
        String animalType = "";
        for (int i = 0; i < animalList.length; i++) {
            System.out.println("Is it a " + animalList[i] + "?");
            QuestionCount questionCount = new QuestionCount();
            questionCount.printQuestionNum();
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

    public String articleDeterminer(String animalList) {
        String article = "a";
        if(animalList.startsWith("a") || animalList.startsWith("e")|| animalList.startsWith("i")
                || animalList.startsWith("o") || animalList.startsWith("u")) {
            article = "an";
        }
        else {
            article = "a";
        }
        return article;
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
        QuestionCount questionCount = new QuestionCount();
        questionCount.printQuestionNum();
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
        String[] otherBirdArrayAH = {"blackbird", "bluebird", "bluejay", "cardinal", "chicken", "crow",
                  "cuckoo", "hummingbird", "bee eater"};
        String[] otherBirdArrayI = { "sparrow", "woodpecker", "pigeon",  "raven",
                "magpie",  "swallow",  "quail", "guineafowl"};
        String[] songBirdArray = {"robin", "magpie", "mockingbird", "blackbird", "bluebird", "bluejay", "cardinal",
        "wren", "nightingale", "crake", "finch", "oriole", "uguisu"};
        String[] bigBirdArray = {"flamingo", "penguin", "ostrich", "stork", "crane", "ibis",
                "kiwi", "emu","kakapo", "spoonbill", "umbrellabird"};
        String[] colorfulBirdArrayAH = {"bird of paradise",  "finch", "cockatoo", "bee eater"};
        String[] colorfulBirdArrayI = { "parrot","robin", "toucan", "parakeet",
                 "macaw", "lovebird", "oriole",  "kakapo", "kingfisher", "lorikeet",
                 "quetzal", "umbrellabird"};
        String[] seaBirdArray = {"seagull", "puffin", "swan", "cormorant", "albatross", "pelican", "penguin",
                "tern", "kingfisher", "moorhen", "spoonbill", "booby", "grebe", "plover"};
        String[] gameBirdArray = {"grouse", "turkey", "pheasant", "goose", "partridge", "quail",
                "dove", "crane", "snipe", "duck"};
        String[] birdofPreyArray = {"owl", "eagle", "hawk", "falcon,", "osprey", "vulture", "buzzard", "kite",
                "condor"};
        List<String> list = new ArrayList<>();
        String[] birdList = {"song bird", "colorful bird, such as a parrot", "sea bird or water bird", "big bird, for example, an ostrich", "game bird",  "bird of prey",
                 "nother bird, not in any of the above categories"};
        animalClass animalClass = new animalClass();
        String birdType = animalClass.findAnimalClass(birdList);

        if (birdType == "big bird, for example, an ostrich") {
            findMammalOrder(bigBirdArray, "big birds");
        } else if (birdType == "game bird") {
            findMammalOrder(gameBirdArray, "game birds");
        } else if (birdType == "sea bird or water bird") {
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
        String[] petFishArrayAH = {"guppy", "tang (dory fish)", "catfish", "clownfish", "angelfish", "eel",
                "betta", "goldfish", "angelfish", "barb"};
        String[] petFishArrayI = {"koi",  "minnow", "stingray",
                "molly", "silver dollar", "wrasse", "tang (dory fish)", "tetra", "piranha", "shark", "pufferfish"};
        String[] otherFishArray = {"moray eel", "pike", "piranha", "shark", "pufferfish", "eel", "stingray", "barracuda",
        "swordfish", "wrasse"};
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
        String[] lizardArrayI = {"legless lizard", "monitor",  "iguana", "lava lizard", "marine iguana",
                 "newt", "sand lizard", "thorny devil", "tuatara", "water dragon", "komodo dragon"};
        String[] snakeArray = {"boa", "anaconda", "cobra", "python", "mamba", "viper", "sea snake", "rattlesnake",
                "kingsnake", "garter snake", "black mamba", "copperhead snake", "cottonmouth", "galapagos snake"};
        String[] otherReptileArray = {"dinosaur", "turtle", "crocodile", "alligator", "tortoise", "caiman"};
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
                "carnivore (or insectivore, or not one of the above)", "herbivore (or omnivore, or not one of the above)"};
        String[] carnivoreArray = {"cat type", "dog type", "bear type"};
        String[] catTypeArray = {"housecat", "tiger", "lion", "cheetah", "jaguar/panther/leopard",
                "ocelot", "lynx", "bobcat", "mountain lion/cougar/puma", "liger"};
        String[] otherArrayAH = {"aardvark", "anteater", "badger", "civet", "bat", "coati"};
        String[] otherArrayI = {"opossum", "mongoose", "red panda", "sloth",
                "racoon", "skunk", "wolverine"};
        String[] dogTypeArray = {"pet dog", "wolf", "fox", "hyena", "coyote", "jackal", "dingo", "maned wolf"};
        String[] bearTypeArray = {"black bear", "grizzly bear", "brown bear", "polar bear", "panda bear", "sun bear",
                "sloth bear", "spectacled bear"};
        String[] rodentArrayBH = {"chickaree", "badger", "beaver", "capybara", "coati", "chinchilla","civet", "chipmunk", "ferret", "fossa",
                "gopher", "groundhog","gerbil", "guinea pig", "hamster", "hare", "hyrax"} ;
        String[] rodentArrayI = {"squirrel", "rat", "vole", "mouse",  "meerkat", "prairie dog", "lemming", "mole",
                "rabbit",  "weasel", "skunk", "wolverine",  "raccoon",   "opossum", "mongoose",
        "pika"};
        String[] primateArray = {"ape", "monkey", "lemur", "tarsier"};
        String[] apeArray = {"human", "gorilla", "orangutan", "chimpanzee", "gibbon"};
        String[] monkeyArrayAH = {"capuchin", "guenon", "baboon", "de brazza's monkey", "grivet monkey", "howler monkey",
                "greater spot-nosed monkey"};
        String[] monkeyArrayI = {"saki monkey",
                 "squirrel monkey", "mandril", "macaque", "tamarin", "patas monkey", "gold/blue/silver monkey",
                "spider monkey", "swamp monkey", "pygmy marmoset", "uakari"};
        String[] seaAnimalArray = {"walrus", "seal", "sea lion", "manatee", "platypus", "beaver", "whale",
                "orca/killer whale", "dolphin", "river dolphin", "hippo", "otter", "porpoise", "narwhal", "dugong"};
        String[] australianArray = {"kangaroo", "wallaby", "wombat", "koala bear", "platypus", "tasmanian devil",
                "sugar glider/flying squirrel", "bandicoot", "cuscus", "numbat", "pademelon", "quokka", "quoll", "swiftlet"};
        String[] hornAntlerTuskArrayAH = {"addax", "antelope", "buffalo", "caribou", "cow","deer","giraffe", "gaur", "elephant", "elk",
                "gazelle","goat"};
        String[] hornAntlerTuskArrayIO = {"moose","impala", "oryx", "kudu", "okapi", "markhor", "ibex", "musk ox", "ox"};
        String[] hornAntlerTuskArrayPZ = {"saola", "walrus", "reindeer", "wild boar","warthog","water buffalo",
                "rhino",  "sheep", "wildebeest", "yak", "zebu", "swiftlet"};
        String[] spikyArray = {"hedgehog", "armadillo", "pangolin", "porcupine", "echidna"};
        String[] herbivoreArrayAG = {"aardvark", "civet", "alpaca",  "dromedary", "donkey",
                "camel", "goat", "fossa", "chamois", "bat", "beaver", "coati", "gerenuk"};
        String[] herbivoreArrayHM = {"horse", "hippo", "hyrax", "hare", "impala", "kudu", "llama","mole", "mongoose", "mule"};
        String[] herbivoreArrayNR = {"raccoon",  "okapi", "opossum",  "red panda", "pig", "rabbit", "peccary"};
        String[] herbvioreArraySZ = {"zonkey", "zorse", "zebra", "tapir",  "sheep", "sloth", "weasel", "skunk", "wolverine"};
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
                findMammalOrder(monkeyArrayAH, monkeyArrayI, "monkeys");
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
            findMammalOrder(hornAntlerTuskArrayAH, hornAntlerTuskArrayIO, hornAntlerTuskArrayPZ, "tusked, horned, or antlered mammal");
        }
        if (mammalType == "spiky or armored animal") {
            findMammalOrder(spikyArray, "spiky or armored mammals");

        }
        if (mammalType == "carnivore (or insectivore, or not one of the above)") {
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
            else {
                findMammalOrder(otherArrayAH, otherArrayI, "carnivore");
            }

        } if (mammalType == "herbivore (or omnivore, or not one of the above)") {
                findMammalOrder(herbivoreArrayAG, herbivoreArrayHM, herbivoreArrayNR, herbvioreArraySZ, "herbivores");
        }
    }

}

class QuestionCount {
    static int questionNum = 0;

    public static int getQuestionNum() {
        questionNum++;
        return questionNum;
    }

    public static void printQuestionNum() {
        getQuestionNum();
        System.out.println("                                        Question number: " + questionNum);
        if (questionNum > 20) {
            System.out.println("That's 20 questions. You got me.");
        }
    }

        }


