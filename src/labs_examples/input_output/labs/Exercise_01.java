package labs_examples.input_output.labs;
import java.io.*;
/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/files/byte_data";
        String writeFile = "src/labs_examples/input_output/files/bufferData.txt";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(filePath));
            byte[] buffer = new byte[5];
            bis.read(buffer);
            bos = new BufferedOutputStream(new FileOutputStream(writeFile));
            bos.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException f) {
                f.printStackTrace();
            }
        }




    }
}