package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

class implementDogses {
    public static void main(String[] args) {
        Baxter baxter = new Baxter();
        Bentley bentley = new Bentley();
        UnknownDog unknownDog = new UnknownDog();

        runDogses dogses = new runDogses();

        baxter.sit();
        baxter.bark();
        baxter.beQuiet();

    }
}

public interface Dogses {
    default boolean bark(boolean isThundering, boolean strangerAtTheDoor) {
        boolean barking = true;

        if (isThundering == true || strangerAtTheDoor == true) {
            barking = true;
        }
        else {
            barking = false;
        }
        return barking;
    }

    default boolean bark() {
        boolean barking;
        barking = true;
        return barking;
    }
    public void beQuiet();
    public boolean sit();
}

class Baxter implements Dogses {
    @Override
    public boolean bark(boolean isThundering, boolean strangerAtTheDoor) {
        boolean barking = true;

        if (isThundering == true || strangerAtTheDoor == true) {
            barking = true;
        }
        else {
            barking = false;
        }
        return barking;
    }

    boolean barking;
    @Override
    public void beQuiet() {
        boolean beQuiet;
        if (barking == false) {
            beQuiet = true;
        }
        else {
            beQuiet = false;
        }
    }

    boolean foodIsOffered;
    boolean sitting;
    @Override
    public boolean sit() {
        if (foodIsOffered == true) {
            sitting = true;
        }
        else {
            sitting = false;
        }
        return sitting;
    }


}

class Bentley implements Dogses {
    boolean barking;
    @Override
    public boolean bark(boolean toyWasStolen, boolean strangerAtTheDoor) {
        if (toyWasStolen == true || strangerAtTheDoor == true) {
            barking = true;
        }
        else {
            barking = false;
        }
        return barking;

    }

    @Override
    public void beQuiet() {
        boolean beQuiet;
        if (barking == false) {
            beQuiet = true;
        }
        else {
            beQuiet = false;
        }
    }

    boolean foodIsOffered;
    boolean sitting;
    @Override
    public boolean sit() {
        if (foodIsOffered == true) {
            sitting = true;
        }
        else {
            sitting = false;
        }
        return sitting;
    }
}

class UnknownDog implements Dogses {

    @Override
    public boolean bark() {
        boolean barking;
        barking = true;
        return barking;
    }

    boolean barking;
    @Override
    public void beQuiet() {
        boolean beQuiet;
        if (barking == false) {
            beQuiet = true;
        }
        else {
            beQuiet = false;
        }
    }

    boolean foodIsOffered;
    boolean sitting;
    @Override
    public boolean sit() {
       sitting = false;
       return sitting;
    }
}

class runDogses {

    Dogses dogses;

    public void setDogses() {
        this.dogses = dogses;
    }

    public void testDogses() {
        dogses.bark();
        dogses.beQuiet();
        dogses.sit();
    }
}

