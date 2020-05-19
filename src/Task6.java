import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

       // System.out.println("Length of shortest word: "+shortStringLen());

       /* int[] arr1 = {12,78,96,354,92,968,2636,55,1,6};
        System.out.println("Sum of the Array elements except small and Large element : "+sumExceptSmallLarge(arr1));*/

       //System.out.println("String of words without spaces: " +removeSpaces());

       /* String str1= "COVID";
        if(isogram(str1)==true)
            System.out.println(str1+" has unique alphabets in it.");
        else
            System.out.println(str1+" has non unique alphabets in it.");*/

      /* String  str = "Stay healthy stay safe";
       System.out.println("the original String: "+str);
       System.out.println("the reversed String: "+reverseOrder(str));*/

      int[] arr2= {23,25,75,87,47,1,91,51,2};
      evenOdd(arr2);
      System.out.println(" ");



    }

    static int shortStringLen(){
        //Write a JAVA program that takes given String of words and return the length of the shortest word.

        System.out.println("Enter the string of words.");

        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        String[] words = text.split(" ");

        int shortestLength,shortestLocation;

        shortestLength=(words[0]).length();

        shortestLocation=0;

        for (int i=0;i<words.length;i++) {
            if ((words[i]).length() < shortestLength) {
                shortestLength=(words[i]).length();
                shortestLocation=i;
            }
        }

        System.out.println(words[shortestLocation]);

        return words[shortestLocation].length();
    }

    static int sumExceptSmallLarge(int[] arr){
        //Write a JAVA program that gives sum of all the values of array except the highest and lowest values.

        int result = 0;
        int len = arr.length;

        Arrays.sort(arr);

        for(int i = 1; i <len-1;i++){
            result += arr[i];
        }
        return result;
    }

    static String removeSpaces(){
        //Write a JAVA method to remove all the spaces from the String and return the resultant
        System.out.println("Enter the string of words.");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String result="";
        String[] words = text.split(" ");
        int len = words.length;

        for (String word : words) {
            result += word;
        }
        return result;
    }

    static boolean isogram(String str){
        //Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or nonconsecutive
        // i.e. all the letters of the string be unique (isogram) else false.

        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    static String reverseOrder(String str) {
        //Write a JAVA program that reverse the words of a sentence.
        //For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM

        String result = "";

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            result = result + reverseWord + " ";
        }

        return result;
    }

    static void evenOdd(int[] arr) {
        //Write a JAVA program that takes out the even from the odds and odd from the list of even numbers,
        //For eg, => {23,25,75,87,47,1,91,51,2} //Output for this case =>2
        //=> {22,44,64,76,98,12,43,54,90} // Output for this case =>43

        int len = arr.length;
        int[] odd = new int[len];
        int[] even = new int[len];

        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 0)
                even[i] = arr[i];
        }

        for (int i = 0; i < len; i++) {
            if (arr[i] % 2 == 1)
                odd[i] = arr[i];
        }

        int lenOdd = 0;
        for (int i=0; i<odd.length; i++){
            if (odd[i] != 0)
                lenOdd++;
        }
        int [] newOdd = new int[lenOdd];
        for (int i=0, j=0; i<odd.length; i++){
            if (odd[i] != 0) {
                newOdd[j] = odd[i];
                j++;
            }
        }

        int lenEven = 0;
        for (int i=0; i<even.length; i++){
            if (even[i] != 0)
                lenEven++;
        }

        int [] newEven = new int[lenEven];
        for (int i=0, j=0; i<even.length; i++){
            if (even[i] != 0) {
                newEven[j] = even[i];
                j++;
            }
        }
        if(newOdd.length<newEven.length) {

            for (int i = 0; i < newOdd.length; i++) {
                System.out.print("\t" + newOdd[i]);
            }
            System.out.println();
        }else{
            for (int i = 0; i < newEven.length; i++) {
                System.out.print("\t" + newEven[i]);
            }
        }

    }
}
