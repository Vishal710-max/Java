package FileHandling.SerailizationAnddeserialization;
import java.io.*;

class Serlization implements Serializable {
    String str;
    int    num;
    Serlization(String str, int num) {
        this.str = str;
        this.num = num;
    }
}

public class Serailization {
    public static void main(String[] args) throws Exception{
        Serlization obj = new Serlization("Shreyash", 45);

        String name = "SerFile.ser";

        FileOutputStream out = new FileOutputStream(name);
        ObjectOutputStream obj1 = new ObjectOutputStream(out);
        obj1.writeObject(obj);
        obj1.close();

        FileInputStream in = new FileInputStream(name);
        ObjectInputStream obj2 = new ObjectInputStream(in);

        Serlization demo = (Serlization) obj2.readObject();
        obj2.close();

        System.out.println("Name: " + demo.str);
        System.out.println("Number: " + demo.num);


    }
}
