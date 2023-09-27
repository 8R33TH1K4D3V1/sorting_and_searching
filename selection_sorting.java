# sorting_and_searching
dsa
import java.util.*;
public class Main{
    public static void main(String args[])
    {
      int [] arr ={10,2,8,9,3,12};
      System.out.println("Original Array: "+Arrays.toString(arr));
      for(int step=0;step<arr.length-1;step++)
      {
          int min_element = step;
      for(int i =step+1;i<arr.length;i++)
      {
          if(arr[i]<arr[min_element])
          {
              min_element =i;
          }
          int temp = arr[step];
          arr[step] =arr[min_element];
          arr[min_element] =temp;
          
      }
       System.out.println("Sorted Array"+Arrays.toString(arr));
      
      }
      
    }
}
