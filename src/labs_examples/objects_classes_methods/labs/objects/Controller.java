package labs_examples.objects_classes_methods.labs.objects;

public class Controller {
    public static void main(String[] args) {
        Animals myDog = new Animals(2, "Baxter and Bentley");
        Animals myCat = new Animals(0, " ");
        Animals myDonkey = new Animals(0, " ");
        Plants myPlants = new Plants(45, "trees, vines, and flowers");
        System.out.println("I have " + myDog.animalNum + " animals and they are named " + myDog.animalName + ". I also have " + myPlants.plantsNum + " plants and they consist of " + myPlants.plantsName);

    }
}

 class Animals {
    int animalNum;
    String animalName;

    public Animals(int animalNum, String animalName) {
        this.animalNum = animalNum;
        this.animalName = animalName;
    }

}

 class Plants {
    int plantsNum;
    String plantsName;

    public Plants(int plantsNum, String plantsName) {
        this.plantsNum = plantsNum;
        this.plantsName = plantsName;
        }

}
