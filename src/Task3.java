import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //multiplicationTable();
        //sum();
        //daysInMonth();
        //sumOfNNumbers();
        //sumOfDigits();
        //order();
        //noOfDays();
        leapYear();

    }
    static void multiplicationTable(){
    //1. Write a simple program to print multiplication table of a certain number taken from user,
    //For eg. 2 X 1 = 2
    //	2 X 2 = 4
    //	and so on.

        System.out.println("Enter the number to create table.");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        for(int x = 1; x <= 10; x++){
            int mul= i*x;
            System.out.println(i+" * "+x+" = "+mul );
        }
    }

    static void sum() {
        //2. Write a program in which:
        //Take 10 values input from user using loop.
        //Print sum of all the numbers provided
        //Print the Average of those 10 values

        System.out.println("Enter 10 number to add");
        Scanner in = new Scanner(System.in);
        int s=0;

        for (int x=0; x<10;x++){
            int i = in.nextInt();
            s += i;
        }
        System.out.println("Summation of 10 number: "+s);

    }

    static void daysInMonth(){
    //3.Write a JAVA program that takes user input from 1 to 12 for months, and display number of days of a particular month.
    // (Shows “Invalid Details“ if incorrect month number will be provided).
        System.out.println("Enter the number of month to see the days ");
        Scanner in = new Scanner(System.in);
        int month= in.nextInt();

        if (month == 1 || month==3 || month==5 || month==7 || month==8|| month==10|| month==12) {
            System.out.println("There are 31 days in month ");
        }else if (month == 4|| month==6 || month==9|| month==11){
            System.out.println("There are 30 days in month ");
        }else if (month ==2){
        System.out.println("There are 28 or 29 days in month depends if the year is leap year ");
         }else{
        System.out.println("invalid choice of month");
        }
    }

    static void sumOfNNumbers(){
    //4. Write a JAVA program that takes one integer input n from the user, and display all the so, print sum of n natural numbers.

        System.out.println("Enter N to find sum of n natural numbers");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = n/2*(n+1);
        System.out.println("sum of "+ n +" natural numbers is "+s);
    }

    static void sumOfDigits() {
        //5.Write a JAVA program that takes long type input from user, and
        //Calculate and display the number of digits.
        //Calculate the sum of all the digits of the input.

        System.out.println("Enter long number to find sum of it's digits");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum=0;
        int counter=0;

        while(n > 0)
        {
           long l = n % 10;
            sum = sum + l;
            n = n / 10;
            counter++;
        }
        System.out.println("length of Digits in the number:"+counter);
        System.out.println("Sum of Digits:"+sum);
    }

    static void order(){
    //6.Write a program that accepts three numbers from the user and prints "INCREASING" if the numbers are in increasing order, "DECREASING" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. FOR eg.
    //Input first number: 1524
    //Input second number: 2345
    //Input third number: 3321
    //Output :
    //INCREASING
        System.out.println("Enter three number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a<b){
            if(b<c){
                System.out.println("Increasing");
            }
        }else if(c<b){
            if(b<a){
                System.out.println("Decreasing");
            }
        }else{
            System.out.println("Neither increasing or decreasing order");
        }
    }

    static void noOfDays(){
    //7.Write a Java program to find the number of days in a month.
    //Test Data
    //Input a month number: 2
    //Input a year: 2016
    //Expected Output :
    //February 2016 has 29 days
        System.out.println("Enter month in number format(MM)");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        System.out.println("Enter year in number format(YYYY)");
        int year = in.nextInt();
        if (month == 1 || month==3 || month==5 || month==7 || month==8|| month==10|| month==12) {
            System.out.println("There are 31 days in month ");
        }else if (month == 4|| month==6 || month==9|| month==11){
            System.out.println("There are 30 days in month ");
        }else if (month ==2){
            if(year%4 == 0)
            System.out.println("February "+year+" has 29 days ");
            else
                System.out.println("February "+year+" has 28 days ");
        }else{
            System.out.println("invalid choice of month");
        }
    }
    static void leapYear(){
    //8.Write a Java program that takes a year from user and print whether that year is a leap year or not.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year in number format(YYYY)");
        int year = in.nextInt();

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is not a leap year.");
            }
            else
                System.out.println(year + " is a leap year.");
        }
        else
            System.out.println(year + " is not a leap year.");

    }
}
