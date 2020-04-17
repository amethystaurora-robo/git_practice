package labs_examples.objects_classes_methods.labs.objects;

class ObjectComp {
    public static void main(String[] args) {
        Color color = new Color("blue");
        Specs specs = new Specs(true, false, true);
        Type type = new Type("Boeing", "747");
        Measurements measurements = new Measurements(300, 400, 400);
        Airplane myplane = new Airplane(30, 15.3, color, specs, type, measurements);

    }


}

public class Airplane {

    Color color;
    Specs specs;
    Type type;
    Measurements measurements;
    double fuelCapacity;
    double currentFuelLevel;


    public Airplane (double fuelCapacity, double currentFuelLevel, Color color, Specs specs, Type type, Measurements measurements) {
        this.color = color;
        this.specs = specs;
        this.type = type;
        this.measurements = measurements;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;

    }

    @Override
    public String toString() {
        return "Airplane{" +
                "color=" + color +
                ", specs=" + specs +
                ", type=" + type +
                ", measurements=" + measurements +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

 class Color {
    String color;

    public Color (String color) {
        this.color = color;
    }

     @Override
     public String toString() {
         return "Color{" +
                 "color='" + color + '\'' +
                 '}';
     }
 }
 class Specs {

    boolean isGas;
    boolean isJet;
    boolean requiresCommercialLicense;

    public Specs(boolean isGas, boolean isJet, boolean requiresCommercialLicense) {
        this.isGas = isGas;
        this.isJet = isJet;
        this.requiresCommercialLicense = requiresCommercialLicense;
    }

     @Override
     public String toString() {
         return "Specs{" +
                 "isGas=" + isGas +
                 ", isJet=" + isJet +
                 ", requiresCommercialLicense=" + requiresCommercialLicense +
                 '}';
     }
 }

 class Type {

    //instance variables
    String brand;
    String number;

    public Type(String brand, String number) {
        this.brand = brand;
        this.number = number;

    }

     @Override
     public String toString() {
         return "Type{" +
                 "brand='" + brand + '\'' +
                 ", number='" + number + '\'' +
                 '}';
     }
 }

 class Measurements {

    double wingspan;
    double width;
    double height;

    Measurements (double wingspan, double width, double height) {
        this.wingspan = wingspan;
        this.width = width;
        this.height = height;

    }

     @Override
     public String toString() {
         return "Measurements{" +
                 "wingspan=" + wingspan +
                 ", width=" + width +
                 ", height=" + height +
                 '}';
     }
 }
