import java.util.Scanner;

public class ScannerDemo2 {

     public static void main(String[] args)
        {
            // Declare an object and initialize with
            // predefined standard input object
            Scanner sc = new Scanner(System.in);

            // Initialize sum and count of input elements
          //  int sum = 0, count = 0;

            // Check if an int value is available
            while (sc.hasNextLine())
            {
                String ss = sc.nextLine();
                // Read an int value
             //   int num = sc.nextInt();
             //   sum = sum + num;
             //   count++;
                System.out.println(ss);
            }
            //int mean = sum / count;

        }
    }

