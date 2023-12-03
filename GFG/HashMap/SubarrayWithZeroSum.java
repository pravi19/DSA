package GFG.HashMap;
import java.util.*;

/*Q)Sub array with zero sum.Return true or false for given array there exist a subarray sum such that it is equal to zero*/

public class SubarrayWithZeroSum {
    public static void main(String[] args){
       int[] arr={6 ,-2, -9, -5, -9, -6, 6, 2, 9, -8};
        int[] arr1={4 ,2, -3, 1, 6};

        System.out.println(findsum(arr,arr.length));
    }

    static boolean findsum(int[] arr,int n)
    {
       HashSet<Integer>hs=new HashSet<>();

       hs.add(0);

       int sum=0;

       for(int i=0;i<n;i++){
           sum+=arr[i];
           if(hs.contains(sum)){
               return true;
           }

           hs.add(sum);
       }

       return false;
    }
}
