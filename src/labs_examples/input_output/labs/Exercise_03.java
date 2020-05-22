package labs_examples.input_output.labs;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class Variety {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        String fileName = "src/labs_examples/input_output/files/char_data.txt";
        try {
            fis = new FileInputStream(fileName);
            fos = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}