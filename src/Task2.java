import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        divisibleBy3n5Both();

        useOfSwitchCase();

        flowDiagram();

        useOfBreakContinue();

        except3n6();

        loopConditions();

        floatNumber();

        random();
    }

    static void divisibleBy3n5Both() {
        //1.	Write a program in JAVA to perform the following operation:
        //•	If a number is divisible by 3 it should print “Consultadd” as a string
        //•	If a number is divisible by 5 it should print “JAVA Training” as a string
        //•	If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value:");
        int i = in.nextInt();

        if (i % 3 == 0 || i % 5 == 0) {
            if (i % 5 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Consultadd JAVA Training");
                } else
                    System.out.println("JAVA Training");
            } else
                System.out.println("Consultadd");
        } else
            System.out.println("Error");
    }

    static void useOfSwitchCase() {
        //2. Write a program in JAVA to perform the following operator based task:
        //•	Ask user to choose the following option first:
        //o	If User Enter 1 - Addition
        //o	If User Enter 2 - Subtraction
        //o	If User Enter 3 - Division
        //o	If User Enter 4 - Multiplication
        //o	If User Enter 5 - Average
        //•	Ask user to enter the 2 numbers in a variable for first and second(first and second are variable names) for the first 4 options mentioned above and print the result.
        //•	Ask user to enter two more numbers as first1 and second2 for calculating the average as soon as user choose an option 5.
        //•	At the end if the answer of any operation is Negative print a statement saying “Oops option X(1/2/3/4/5/) is returning the negative number”
        //•	NOTE: At a time user can perform one action at a time.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two values:");
        int first = in.nextInt();
        int second = in.nextInt();

        System.out.println("Enter 1 - Addition \nEnter 2 - Subtraction \nEnter 3 - Division \nEnter 4 - Multiplication \nEnter 5 - Average");
        int i1 = in.nextInt();

        switch (i1) {
            case 1:
                int add = first + second;
                if (add > 0)
                    System.out.println("Addition:  " + add);
                else
                    System.out.println("Oops option 1 is returning the negative number");
                break;

            case 2:
                int sub = first - second;
                if (sub > 0)
                    System.out.println("Subtraction:  " + sub);
                else
                    System.out.println("Oops option 2 is returning the negative number");
                break;

            case 3:
                if (second == 0)
                    System.out.println("arithmetic error");
                else {
                    int div = first / second;
                    if (div > 0)
                        System.out.println("Division:  " + div);
                    else
                        System.out.println("Oops option 3 is returning the negative number");
                }
                break;

            case 4:
                int mul = first * second;
                if (mul > 0)
                    System.out.println("Multiplication:  " + mul);
                else
                    System.out.println("Oops option 4 is returning the negative number");
                break;

            case 5:
                System.out.println("Enter two more values");
                int first1 = in.nextInt();
                int second2 = in.nextInt();
                int avg = (first + second + first1 + second2) / 4;
                if (avg > 0)
                    System.out.println("Average:  " + avg);
                else
                    System.out.println("Oops option 5 is returning the negative number");
                break;

            default:
                System.out.println("invalid choice");
        }
    }

    static void flowDiagram() {
        //4. Code for flow diagram

        int a =10, b=20, c=30;

        int avg = (a+b+c)/3;
        System.out.println("Average :"+avg);

        if(avg > a && avg > b && avg > c){
            System.out.println("Average is higher than a, b, c");
        }else if(avg > a && avg > b){
            System.out.println("Average is higher than a, b");
        }else if (avg > a && avg > c){
            System.out.println("Average is higher than a,c");
        }else if(avg > b && avg > c){
            System.out.println("Average is higher than b,c");
        }else if(avg > a ){
            System.out.println("Average is higher than a");
        }else if(avg > b ){
            System.out.println("Average is higher than b");
        }else if( avg > c){
            System.out.println("Average is higher than b,c");
        }

    }
    static void useOfBreakContinue() {
        //5. 	Write a program in JAVA to break and continue if the following cases occurs:
        //•	If user enters a negative number just break the loop and print “It’s Over”
        //•	If user enters a positive number just continue in the loop and print “Good Going”

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");

        for (int x = 0; ; x++) {
            int i3 = in.nextInt();
            if (i3 < 0) {
                System.out.println("It's over");
                break;
            } else if (i3 >= 0) {
                System.out.println("Good Going");
                continue;
            }
        }
    }

    static void except3n6(){
        //5.	 Write a program that prints all the numbers from 0 to 6 except 3 and 6.
        //       Expected output: 0 1 2 4 5
       // System.out.println("");
        for(int i=0;i<=6;i++){
            if(i==3 || i == 6)
                continue;
            else
                System.out.println(i);
        }

    }

    static void loopConditions(){
        //6.	Given an integer , perform the following conditional actions:
        //•	If  is odd, print NEW
        //•	If  is even and in the inclusive range of 2 to 5 , print OLD
        //•	If  is even and in the inclusive range of 6 to 30, print NEW
        //•	If  is even and greater than 30, print OLD

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any value");

        int i = in.nextInt();

        if(i%2 == 1){
            System.out.println("NEW");
        }else if(i%2==0 && 2<=i && i<=5){
            System.out.println("OLD");
        }else if(i%2==0 && 6<=i && i<=30){
            System.out.println("New");
        }else if(i<30) {
            System.out.println("OLD");
        }

    }

    static void floatNumber(){
        //7.	Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise,
        // print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any float number");
        float f = in.nextFloat();

        if(f == 0) {
            System.out.println("Zero");
        }else if(f<0){
            System.out.println("Negative");
        }else if(f>=0){
            System.out.println("Positive");
        }

        if(Math.abs(f)<1){
            System.out.println("Small");
        }else if(Math.abs(f)>1000000){
            System.out.println("Large");
        }
    }

    static void random(){
        //8.	Write a JAVA program which takes character input from the user,
        //•	If the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND.
        //•	Print NOT FOUND for all the other alphabets.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any character");

        char c = in.next().charAt(0);

        if(c == 'r' || c == 'a' ||c == 'n' ||c == 'd' ||c == 'o' ||c == 'm' ||c == 'R' || c == 'A' ||c == 'N' ||c == 'D' ||c == 'O' ||c == 'M'  ){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }

}
