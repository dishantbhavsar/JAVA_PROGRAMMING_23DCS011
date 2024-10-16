import java.io.*;
import java.util.*;

public class prec28 {
    public static void main(String[] args) {
        int count[] = new int[36];
        char base = 'a';

        if (args.length == 0) {
            System.out.println("Specify Input");
        }

        String fname = args[0];

        try {
            FileReader f = new FileReader(fname);

            while (scan.has()) {
                String temp = scan.nextLine();
                System.out.println(temp);
            }
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
