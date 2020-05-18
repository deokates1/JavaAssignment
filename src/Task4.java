import java.util.Scanner;

public class Task4 {
    //TASK FOUR : PATTERNS

    public static void main(String[] args) {

        //triangle();
        //pascal();
        sameFloat();
    }

    static void triangle(){
    //Write a program in Java to display the pattern like right angle triangle with a number.
    //Test Data
    //Input number of rows : 10
    //Expected Output :
    //1
    //12
    //123
    //1234
    //12345
    //123456
    //1234567
    //12345678
    //123456789
    //12345678910
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }

    static void pascal() {
        // Write a Java program to display Pascal's triangle.
        //Test Data
        //Input number of rows: 5
        //Expected Output :
        //Input number of rows: 5
        //      1
        //     1 1
        //    1 2 1
        //   1 3 3 1
        //  1 4 6 4 1

        int no_row,c=1,blk,i,j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_row = in.nextInt();
        for(i=0;i<no_row;i++)
        {
            for(blk=1;blk<=no_row-i;blk++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }

    //Write a Java program that accepts two floating­ point numbers and checks whether they are the same up to two decimal places.
    static void sameFloat(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two float numbers: ");
        float n1 = in.nextFloat();
        float n2 = in.nextFloat();

        if (Math.abs(n1 - n2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }

}
