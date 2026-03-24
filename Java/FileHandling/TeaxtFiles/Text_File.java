package FileHandling.TeaxtFiles;
import java.io.*;

public class Text_File {
    public static void main(String[] args) throws Exception{
        String str = "Hello";

        FileWriter w = new FileWriter("TFile.txt");
        BufferedWriter b = new BufferedWriter(w);
        b.write(str);
        b.close();
        System.out.println("Data Write Succesfull1");

        FileReader r = new FileReader("TFile.txt");
        BufferedReader b1 = new BufferedReader(r);
        int i;
        while ((i = b1.read()) != -1) {
            System.out.print((char) i);
        }
        b1.close();

    }
}
