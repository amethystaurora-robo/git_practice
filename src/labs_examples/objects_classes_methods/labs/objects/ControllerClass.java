package labs_examples.objects_classes_methods.labs.objects;

public class ControllerClass {
    public static void main(String[] args) {
        Animal firstAnimal = new Animal();
        Animal secondAnimal = new Animal(37);
        Animal thirdAnimal = new Animal(15, 30.3, "Rufus");
        Animal fourthAnimal = new Animal();
        Animal fifthAnimal = new Animal(50);

    }
}

class Animal {
    int animalAge;
    double animalWeight;
    double animalHeight;
    String animalName;

    Animal () {}
    Animal(int animalAge) {
        this.animalAge = animalAge;
    }
    Animal(int animalAge, double animalHeight, String animalName) {
        this.animalAge = animalAge;
        this.animalHeight = animalHeight;
        this.animalName = animalName;
    }

        }

