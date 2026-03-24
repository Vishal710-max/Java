package Threading.ShortHand;

import java.io.File;

public class Short_Hand_Thread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            // Count from 1 to 10 with 1-second delay
            for (int i = 1; i <= 10; i++) {
                System.out.println("Counting: " + i);
                try {
                    Thread.sleep(1000); // Pause for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted!");
                }
            }
            System.out.println("Count completed!");
        });
        t.start();

        // File Processing Thread
        Thread t1 = new Thread(() -> {
            // Process files in a directory
            File folder = new File("D:/All Data");
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    System.out.println("Processing: " + file.getName());
                    // Add your file processing logic here
                }
            }
            System.out.println("File processing complete!");
        });
        t1.start();

        // Background Calculation Thread
        Thread t2 = new Thread(() -> {
            // Calculate factorial in background
            int number = 10;
            long factorial = 1;

            for(int i = 1; i <= number; i++) {
                factorial *= i;
                System.out.println("Intermediate result: " + factorial);
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        });
        t2.start();
    }
}


// Output =>
// Processing: Assignments
// Processing: PDF
// Processing: Syllabus
// File processing complete!
// Intermediate result: 1
// Intermediate result: 2
// Intermediate result: 6
// Intermediate result: 24
// Intermediate result: 120
// Intermediate result: 720
// Intermediate result: 5040
// Intermediate result: 40320
// Intermediate result: 362880
// Intermediate result: 3628800
// Counting: 1
// Factorial of 10 is: 3628800
// Counting: 2
// Counting: 3
// Counting: 4
// Counting: 5
// Counting: 6
// Counting: 7
// Counting: 8
// Counting: 9
// Counting: 10
// Count completed!
