import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {

       // duplicate(new int[] {0, 3, -2, 4, 3, 2});
       // secondLargest(new int[]{97,90,326,895,19,3,1000});
       // secondSmallest(new int[]{97,90,326,895,19,3,1000});
       /* int[] arr1= {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int [] result = add(arr1, arr2);
        System.out.println("Addition of two arrays: ");
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(result[i]+"\t");
        }*/

        /*int[] arr3= {1,0,2,3,0,4,5,0};
        int[] removedZero= removeZero(arr3);
        System.out.println("Removed zero at the end of array: ");
        for (int i = 0; i < removedZero.length; i++)
        {
            System.out.print(removedZero[i]+"\t");
        }*/

        /*int[] arr4={1,2,52,68,24,89,9,46,199,46};
        System.out.println("Difference between smallest and largest number is: " +difference(arr4));*/

        /*int[] arr5={1673, 86, 3, 9099, 3, 86, 1, 9099};
        System.out.println("Length of non duplicate array is: " +newLength(arr5));*/

        /*ArrayList<Integer> arr6 = new ArrayList<Integer>();
        arr6.add(1);
        arr6.add(2);
        arr6.add(4);
        arr6.add(5);
        arr6.add(6);
        int target = 6;
        ArrayList<Integer> result = sumOfElement(arr6, target);
        System.out.println("Following elements has sum as target number:");
        for(int i : result)
            System.out.println("Element: "+arr6.get(i) + " ");*/

        /*int[] arr7 = {9,8,-9,-1,3,5,6,-4,7};
        System.out.println("Difference between two elements :"+ closeToZero(arr7));*/

        int arr8[] = {10, 30, 80, 90, 60, 100, 20, 40, 70, 50};
        int result[];

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr8));

        result = maxMinSort(arr8);

        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));



    }

    static void duplicate(int[] arr){
    //Write a Java program to remove duplicate elements from an array.

        System.out.println("Original Array : ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }

        //Assuming all elements in input array are unique

        int arr_len = arr.length;

        //Comparing each element with all other elements

        for (int i = 0; i < arr_len; i++)
        {
            for (int j = i+1; j < arr_len; j++)
            {
                //If any two elements are found equal

                if(arr[i] == arr[j])
                {
                    //Replace duplicate element with last unique element

                    arr[j] = arr[arr_len-1];

                    arr_len--;

                    j--;
                }
            }
        }

        //Copying only unique elements of arr into arr1

        int[] arr1 = Arrays.copyOf(arr, arr_len);

        //Printing arrayWithoutDuplicates

        System.out.println();

        System.out.println("Array with unique values : ");

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println("---------------------------");
    }

    static void secondLargest(int[] arr){
        //Write a Java program to find the second largest element in an array.

        System.out.println("Original Array : ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }

        int arr_len = arr.length;

        Arrays.sort(arr);

        System.out.println("\nSorted Array : ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println(" \nSecond largest element: \n" +arr[arr_len-2]);

    }

    static void secondSmallest(int[] arr){
        //Write a Java program to find the second largest element in an array.

        System.out.println("Original Array : ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }

        int arr_len = arr.length;

        Arrays.sort(arr);

        System.out.println("\nSorted Array : ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println(" \nSecond smallest element: \n" +arr[1]);
    }

    static int[] add(int[] arr1, int[] arr2){
        //Write a Java program to add two matrices of the same size
        int len= arr1.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    static int[] removeZero(int[] arr1){
        //Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
        int len= arr1.length;

        int count = 0;  // Count of non-zero elements

        for (int i = 0; i < len; i++)
            if (arr1[i] != 0)
                arr1[count++] = arr1[i];

        while (count < len)
            arr1[count++] = 0;

        return arr1;

    }

    static int[] replaceDuplicateByZero(int[] arr1){
       // Write a program to remove the duplicates from a sorted array change them into 0 and add 0 in the end.
                //input: [2,2,3,3,4,4,4,11,11,11,11]
                //output:[2,3,4,11,0,0,0,0,0,0,0]

        int len = arr1.length;
        int[] result = new int[len];

        return result;
    }

    static int difference(int [] arr){
    //Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.

        int len = arr.length;
        Arrays.sort(arr);

        int result = arr[len-1] - arr[0];

        return result;
    }

    static int newLength(int [] arr){
       // Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
        int len = arr.length;
        int result;

        for (int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++)
            {
                //If any two elements are found equal

                if(arr[i] == arr[j])
                {
                    //Replace duplicate element with last unique element

                    arr[j] = arr[len-1];

                    len--;

                    j--;
                }
            }
        }

        //Copying only unique elements of arr into arr1

        int[] arr1 = Arrays.copyOf(arr, len);
        result = arr1.length;

        return result;
    }

    static ArrayList<Integer> sumOfElement(ArrayList<Integer> arr, int b){

        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i = 0; i < arr.size(); i++){
            if(my_map.containsKey(arr.get(i))){
                int index = my_map.get(arr.get(i));
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                my_map.put(b - arr.get(i), i);
            }
        }

        return result;
    }

    static int closeToZero(int[] arr){
        //Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.
        int n, min1 = 0, min2 = 1, sum, minimum;
        n = arr.length;
        minimum=Math.abs(arr[0] + arr[1]);
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                sum = Math.abs(arr[i] + arr[j]);
                if(sum < minimum)
                {
                    min1 = i;
                    min2 = j;
                    minimum = sum;
                }
            }
        }
        System.out.println("Element 1:"+arr[min1]);
        System.out.println("Element 2:"+arr[min2]);
        return Math.abs(arr[min1]+arr[min2]);
    }

    static int[] maxMinSort(int [] arr){

        int len = arr.length;
        Arrays.sort(arr);
        int temp[] = new int[len];

        int small_num = 0, large_num = len-1;
        boolean flag = true;

        for (int i=0; i < len; i++)
        {
            if (flag)
                temp[i] = arr[large_num--];
            else
                temp[i] = arr[small_num++];

            flag = !flag;
        }

        return temp;
    }

}

