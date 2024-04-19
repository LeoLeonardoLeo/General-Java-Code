import java.util.Scanner;

public class Main {
    static Scanner functionScanner = new Scanner(System.in);
    //static allows all instances to be used

    //functions
    //mainly used for re-usability
    //a block of code that does something

    public static void number(){
        System.out.println("Enter a number");
        int number = functionScanner.nextInt(); //reads user input
        System.out.println("Your number is " + number);
    }
    public static int add(int a, int b){
        return a + b;
    }

    public static boolean posOrNeg(){
        System.out.println("Enter a number");
        int number = functionScanner.nextInt();
        System.out.println("Checking if number is less than 0");
        if (number < 0){
            System.out.println(number + " is less than 0");
            return false;
        }
        else if (number > 0){
            System.out.println(number + " is greater than 0");
            return true;
        }
        else{
            System.out.println("Not a number");
        }
        return true;
    }
    public static void main(String[] args) {
        number();

        System.out.println(add(5, 7)); //12

        posOrNeg();

        //user input is used by called the scanner class and the import
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        functionScanner.close();

    }
}