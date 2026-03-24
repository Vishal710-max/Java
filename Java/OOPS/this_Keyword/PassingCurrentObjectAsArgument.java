package OOPS.this_Keyword;

class Logger {
    void logThisObject(Logger obj) {
        System.out.println("Logging object: " + obj);
    }

    void log() {
        this.logThisObject(this);  // Passing current object
    }
}

public class PassingCurrentObjectAsArgument {
    public static void main(String[] args) {
        new Logger().log();  // Output: Logging object: OOPS.this_Keyword.Logger@6acbcfc0
    }
}
