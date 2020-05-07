package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

class implementDogses {
    public static void main(String[] args) {
        Baxter baxter = new Baxter();
        Bentley bentley = new Bentley();
        UnknownDog unknownDog = new UnknownDog();

    }
}

public interface Dogses {
    public boolean bark(boolean isThundering, boolean strangerAtTheDoor);
    public void beQuiet();
    public void come();
    public void sit();
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


    @Override
    public void beQuiet() {}

    @Override
    public void come() {}

    @Override
    public void sit() {}


}

class Bentley implements Dogses {
    @Override
    public boolean bark(boolean toyWasStolen, boolean strangerAtTheDoor) {

    }

    @Override
    public void beQuiet() {}

    @Override
    public void come() {}

    @Override
    public void sit() {}
}

class UnknownDog implements Dogses {
    @Override
    public boolean bark() {}

    @Override
    public void beQuiet() {}

    @Override
    public void come() {}

    @Override
    public void sit() {}
}
