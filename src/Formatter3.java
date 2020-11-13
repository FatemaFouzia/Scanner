import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatter3 {
    // Java program to demonstrate working of SimpleDateFormat
        public static void main(String args[]) throws ParseException
        {
            // Formatting as per given pattern in the argument 
           // SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat ft = new SimpleDateFormat("MM.dd.yyyy");
            String str = ft.format(new Date());
            System.out.println("Formatted Date : " + str);

            // parsing a given String 
            str = "11/12/2020";
            ft = new SimpleDateFormat("MM/dd/yyyy");
           // Date date = ft.parse(str);
            Date da = ft.parse(str);
            // this will print the date as per parsed string 
            System.out.println("Parsed Date : " + da);
        }
    }


