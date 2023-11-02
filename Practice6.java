package PracticeCodes;
import java.util.*;


class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class Practice6 {
    
    public static void checkAndThrowException(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("number is odd ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        try {
            int number = sc.nextInt(); 
            checkAndThrowException(number);
            System.out.println("Number is even.");
        } catch (OddNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
