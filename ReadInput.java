import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.security.PublicKey;
import java.io.IOException;
import java.util.Arrays;

public class ReadInput{
    public static String read() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input Expression (for eg: 4+5*3/2)");
        String inputLine = scanner.nextLine();

        scanner.close();
        return inputLine;
    }
}