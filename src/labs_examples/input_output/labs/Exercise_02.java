package labs_examples.input_output.labs;
import java.io.*;
/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class FileEncryption {
    public static void main(String[] args) {

        String filePath = "src/labs_examples/input_output/files/char_data.txt";
        try {
            WriteEncryption(filePath);
        } catch (IOException e) {
             e.printStackTrace();
        }

    }

    public static void WriteEncryption(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(new FileReader(filePath), 1);
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        int i;
        while((i = br.read()) != -1) {
            if(i == 'e') {
                bw.write('j');
            }
        }
        br.close();
        bw.close();

    }
}