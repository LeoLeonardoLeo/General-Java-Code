public class Main {
    public static void main(String[] args) {
        //variables
        //if.. if elses.. else
        //while
        //switch
        //for loops

        //variables
        int a =  10;
        int b = 20;
        int add = a + b;
        int multi = a * b;
        int sub = a - b;
        int divide = b / a;

        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + multi);
        System.out.println(b + " / " + a + " = " + divide);

        //integer types
        int i = 1;
        short s = 2;
        long l = 5; //huge number
        //floating types
        double d = 10.1;
        float f = 10F;
        //extra ones
        String str = "hello";
        char c = 5;
        boolean bool = true; //or false
        byte by = 1;

        //if, else if, else
        //many ways to do it but heres a simple way
        int num1 = 10;
        int num2 = 20;
        if(num1 < num2){
            System.out.println(num1 + " is less than " + num2);
            // essentially write anything
            num1 += 20;
            if(num1 < num2){
                System.out.println(num1 + " is less than " + num2);
            }
            else{
                System.out.println(num1 + " is greater than " + num2);
            }
        }
        else {
            System.out.println(num1 + " is greater than " + num2);
        }

        //we can also do if within an in

        //very simple way
        int initial = 4;
        if(initial == 1) {
            System.out.println(initial);
        }
        else if (initial == 2) {
            System.out.println(2);
        }
        else if (initial == 3) {
            System.out.println(initial);
        }
        else if (initial == 4){
            System.out.println(initial);
        }
        else{
            System.out.println(initial);
        }

        //while is mainly used for infinite loops
        while (true){
            System.out.println("this is an infinite loop");
            //we use continue and/or break
            break; //exits the loop
            //used for applications that use a lot of user input for menu options
            //such as a calculator as example and many other things
        }

        //switch
        //another basic implementation
        int menuOption = 2;
        switch (menuOption){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hello the second");
                break;
            case 3:
                System.out.println("Hello three");
                break;
            default:
                System.out.println("No number");
        }

        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }
        System.out.println();
        int loop = 10;
        for (int j = 0; j < loop ; j++) {
            System.out.println(j);
        }
        System.out.println();
        //for loop in for loop
        for (int m = 0; m <= 2 ; m++) {
            System.out.println(m);
            for (int n = 0; n <= 2 ; n++) {
                System.out.println(n);
            }
        }
    }
}