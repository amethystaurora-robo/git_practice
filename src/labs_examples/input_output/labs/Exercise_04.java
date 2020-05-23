package labs_examples.input_output.labs;

import labs_examples.input_output.examples.csv_parser.Student;

import java.util.*;
import java.io.*;

/**
 * Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 * package, create a new application that will parse a custom CSV file that you created and map each line of the
 * csv to a custom POJO that you create.
 * <p>
 * Then add that object to an arraylist. After you have mapped each row of the csv to objects
 * and added each object to an arraylist, print out each object using the objects custom toString() method.
 * <p>
 * Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 */

class csvMapping {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList();
        String fileName = "src/labs_examples/input_output/files/animals.csv";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                animals.add(mapValues(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Animal animal : animals){
            System.out.println(animal.toString());
        }
    }

    public static Animal mapValues(String[] values) {
        Animal animal = new Animal();

        animal.setLegNum(Integer.parseInt(values[0]));
        animal.setEyeNum(Integer.parseInt(values[1]));
        animal.setAnimalClass(values[2]);
        animal.setExtinctOrNot(Boolean.parseBoolean(values[3]));

        return animal;
    }
}

class Animal {
    int legNum;
    int eyeNum;
    String animalClass;
    boolean extinctOrNot;

    public Animal() {

    }

    public Animal(int legNum, int eyeNum, String animalClass, boolean extinctOrNot) {
        this.legNum = legNum;
        this.eyeNum = eyeNum;
        this.animalClass = animalClass;
        this.extinctOrNot = extinctOrNot;
    }

    public int getLegNum() {
        return legNum;
    }

    public void setLegNum(int legNum) {
        this.legNum = legNum;
    }

    public int getEyeNum() {
        return eyeNum;
    }

    public void setEyeNum(int eyeNum) {
        this.eyeNum = eyeNum;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public boolean getExtinctOrNot() {
        return extinctOrNot;
    }

    public void setExtinctOrNot(boolean extinctOrNot) {
        this.extinctOrNot = extinctOrNot;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "leg number =" + legNum +
                ", eye number ='" + eyeNum + '\'' +
                ", animal class ='" + animalClass + '\'' +
                ", extinct or not =" + extinctOrNot +
                '}';
    }

}