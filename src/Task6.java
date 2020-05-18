import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter the string of words.");

        System.out.println("Length of shortest word: "+shortStringLen());

    }

    static int shortStringLen(){
        //Write a JAVA program that takes given String of words and return the length of the shortest word.

        Scanner in = new Scanner(System.in);

        String myText = in.nextLine();

        String[] myWords = myText.split(" ");

        int shortestLength,shortestLocation;

        shortestLength=(myWords[0]).length();

        shortestLocation=0;

        for (int i=1;i<myWords.length;i++) {
            if ((myWords[i]).length() < shortestLength) {
                shortestLength=(myWords[i]).length();
                shortestLocation=i;
            }
        }

        System.out.println(myWords[shortestLocation]);

        return myWords[shortestLocation].length();
    }
}
