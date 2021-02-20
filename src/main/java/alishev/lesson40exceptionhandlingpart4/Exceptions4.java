package alishev.lesson40exceptionhandlingpart4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args)  {                   //throws IOException     OR   throw exception in method
        try {
            run();
        } catch (Exception e) {

        }
    }
    // OR
        // } catch (IOException | ParseException e) {
        //     e.printStackTrace();
        // }


    // OR
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } catch (ParseException e) {
        //     e.printStackTrace();
        // }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
