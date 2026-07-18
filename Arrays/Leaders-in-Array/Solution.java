import java.util.*;
class Solution {
    public static void leadersInArray(int[] arr) {
        // Code here
        List<Integer> ans = new ArrayList<>();
        int max = arr[arr.length - 1];
        ans.add(arr[arr.length - 1]);
        for(int i = arr.length - 2; i >= 0; i --){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
    }
}
