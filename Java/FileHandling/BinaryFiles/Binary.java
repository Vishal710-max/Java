package FileHandling.BinaryFiles;
import java.io.*;

public class Binary {
    public static void main(String[] args) throws FileNotFoundException, Exception{
        String str = "Hello";

        FileOutputStream out = new FileOutputStream("BFile.txt");
        byte[] b = str.getBytes();
        out.write(b);
        out.close();
        System.out.println("Data Write Succesfull");


        FileInputStream in = new FileInputStream("BFile.txt");
        int i;
        while ((i = in.read()) != -1) {
            System.out.print((char) i);
        }
        in.close();

    }
}
