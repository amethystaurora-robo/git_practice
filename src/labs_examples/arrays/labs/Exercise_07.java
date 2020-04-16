package labs_examples.arrays.labs;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> arrayList; arrayList = new ArrayList();
        arrayList.add("booty one ");
        arrayList.add("booty two ");
        arrayList.add("booty three ");
        arrayList.add("booty four ");
        arrayList.add("booty five ");

       boolean one =  arrayList.isEmpty();
       boolean containOo = arrayList.contains("oo");
       System.out.print(one + " " + containOo);
    }
}
