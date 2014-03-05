package BitSetGenerator;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BitSetGeneratorMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("bitsRun1.txt");
        BufferedWriter output = null;

        Random generator = new Random();

        try {
            output = new BufferedWriter(new FileWriter(file));
            for (int ndxCount = 0;ndxCount < 1000;ndxCount++) {
                for (int ndxWidth = 0;ndxWidth < 63;ndxWidth++) {
                    output.write(Integer.toString(generator.nextInt(2)));
                }
                output.newLine();
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
