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
        String fileName = "src/labs_examples/input_output/files/char_data.txt";
        fileStream(fileName);
        bufferStream(fileName);
        characterStream(fileName);
        characterStreamtwo(fileName);
    }

    public static void fileStream(String fileName) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(fileName);
            fos = new FileOutputStream(fileName);
            fis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferStream(String fileName) {
        InputStream is = null;
        byte[] buffer = new byte[8];
        is = new ByteArrayInputStream(fileName.getBytes());
        try {
            is.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void characterStream(String fileName) {
        BufferedReader br = null;
        char[] buffer = new char[5];
        try {
            br = new BufferedReader(new FileReader(fileName));
            br.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void characterStreamtwo(String fileName) {
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream(fileName));
            isr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dataInput(String fileName) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        int writeThis = 8484679;
        try {
           fis = new FileInputStream(fileName);
           fos = new FileOutputStream(fileName);
           dis = new DataInputStream(fis);
           dos = new DataOutputStream(fos);
           dis.read();
           dos.writeInt(writeThis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


 }