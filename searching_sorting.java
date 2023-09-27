********************************************************* Linear Search   *******************************************************************
import java.util.*;
public class LinearSearch{
    public static void main (String args[])
    {
        Scanner a = new Scanner (System.in);
        System.out.println("Enter the number of element:");
        int n = a.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=a.nextInt();
        }
        System.out.println("Enter the target element");
        int target = a.nextInt();
        int result= linear_search(arr,target);
        if(result ==-1)
        {
            System.out.println("The element "  + target + " is not found");
        }
        else
        {
            System.out.println("The element" +target+ "is found at "+result);
        }
    }
    public static int linear_search(int[]arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                
                return i;
            }
        }
        return -1;
    }
    
}




************************************************\\\\\\\\\ Binary  Search //////////////**************************************************************

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }

        scanner.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

******************************************************************** Insertion Sort****************************************************************************************

  import java.util.*;
public class Main{
    public static void main(String args[])
    {
        int arr[] = {10,2,1,8,3};
        System.out.println("Original array:"+Arrays.toString(arr));
        for(int k=1;k<arr.length;k++)
        {
            int value = arr[k];
            int hole = k;
            while(hole>0 && arr[hole-1]>value)
            {
                arr[hole]=arr[hole-1];
                hole=hole-1;
            }
            arr[hole] = value;
        }
       
       System.out.println("Sorted Array:"+Arrays.toString(arr)); 
    }
    
}
