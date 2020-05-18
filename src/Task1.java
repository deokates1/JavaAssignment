import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        swap();

        useOfScanner();

        simpleArithmetic();

        isFloat();

        divisibleBy3n5();

        outputPattern();
    }

    public static void swap(){
        //1.   Swap two numbers using third variable as result name and do the same task without using any third variable.
        int a = 10, b = 20, temp;

        System.out.println(" Value of a =" + a + " value of b =" + b + " before swapping");

        temp = a;
        a = b;
        b = temp;

        System.out.println(" Value of a =" + a + " value of b =" + b + " after swapping");}

    public static void useOfScanner() {
        //2.   Write a program to print the value given by the user.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value");
        int enteredValue = in.nextInt();
        System.out.println("Entered the value: " + enteredValue);
    }

    public static void simpleArithmetic() {
        /*3.    Write a program to complete the task given below:
                •	Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.
                •	Use z for adding 30 into it and print the final result by using variable results.
        */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two values in between 1-10");

        int i1 = in.nextInt();
        int i2 = in.nextInt();
        System.out.println("Entered the value: " + i1 + " and: " + i2);

        int z = i1 + i2;
        z += 30;
        System.out.println("The final result: " + z);
    }

    public static void isFloat() {
        //4.	Write a program to print values if the user enters a Floating point number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any float value");

        if (in.hasNextFloat()) {
            System.out.println("Entered  float value :" + in.nextFloat());
        } else {
            System.out.println("Entered value is not of float type ");
        }
    }

    public static void divisibleBy3n5() {
        Scanner in = new Scanner(System.in);
        //5. 	Write a program to take input from user and check if it is divisible by 3 and 5 or not.
        System.out.println("Enter the value");
        int i3 = in.nextInt();
        if (i3 % 3 == 0 && i3 % 5 == 0) {
            System.out.println("Entered value is completely divisible by 3 and 5");
        } else {
            System.out.println("Entered value is not completely divisible by 3 and 5");
        }
    }

    public static void outputPattern(){
        /*6.	Write a program for String formatting of the input data: (Hint: System.out.printf will be used), justify with 15 spaces and add 0 in front if the number is 2-digit.
                Input:
                java 100
                cpp 65
                python 50

                Output:
                ================================
                java                100
                cpp                 065
                python              050
                ================================
                Output Format
                In each line of output there should be two columns:
                    •	The first column contains the String and is left justified using exactly  characters.
                       •	The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
        */
        Scanner in = new Scanner(System.in);

        System.out.println(" ================================");
        for (int i = 0; i <=2; i++) {
            String str = in.next();
            int i4 = in.nextInt();
            System.out.printf("%-14s %03d %n", str, i4);
            System.out.println(" ================================");
        }
    }
}
