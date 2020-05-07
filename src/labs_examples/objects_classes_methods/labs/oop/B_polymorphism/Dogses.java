package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public interface Dogses {
    public boolean bark(boolean isThundering, boolean strangerAtTheDoor);
    public void beQuiet();
    public void come();
    public void sit();
}

class Baxter implements Dogses {
    @Override
    public boolean bark() {
        boolean bark = true;

        if (isThundering == true || strangerAtTheDoor == true) {
            bark = true;
        }
        else {
            bark = false;
        }
        return bark;
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
    public boolean bark() {}

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
