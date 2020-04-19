package labs_examples.objects_classes_methods.labs.objects;

class ObjectComp {
    public static void main(String[] args) {
        //objects
        Color color = new Color();
        Specs specs = new Specs();
        Type type = new Type();
        Measurements measurements = new Measurements();
        Airplane myplane = new Airplane(30, 15.3, color, specs, type, measurements);

        //methods
        color.setColor("blue");
        color.getColor();

        specs.setSpecs(true, false, true);
        specs.getSpecs();

        type.setType("Boeing", "747");
        type.getType();

        measurements.setMeasurements(3.3, 4.5, 5.7);
        measurements.getMeasurements();

        color.toString();
        specs.toString();
        type.toString();
        measurements.toString();




    }


}

public class Airplane {

    private Color color;
    private Specs specs;
    private Type type;
    private  Measurements measurements;
    private double fuelCapacity;
    private double currentFuelLevel;


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
     private String color;


    public String getColor() {
        return color;
    }

     public void setColor(String color) {
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

     private boolean isGas;
     private boolean isJet;
     private boolean requiresCommercialLicense;

     public void getSpecs() {
         System.out.println("Does the system run on gas?" + this.isGas +
                 "Is the plane a jet?" + this.isJet + "Does the plane require " +
                 "a commercial license?" + this.requiresCommercialLicense);
     }

    public void setSpecs(boolean isGas, boolean isJet, boolean requiresCommercialLicense) {
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
    private String brand;
    private String number;


     public String getType() {
         return this.brand + this.number;
     }

    public void setType(String brand, String number) {
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

     private double wingspan;
     private double width;
     private double height;

     public double getMeasurements() {
         return this.wingspan + this.width + this.height;
     }

    public void setMeasurements (double wingspan, double width, double height) {
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
