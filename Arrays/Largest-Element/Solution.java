class Solution {
    public static int largest(int[] arr) {
        // code here
        int maxsum = arr[0];
        
        for(int i = 1; i < arr.length; i ++){
            maxsum = Math.max(maxsum , arr[i]);
        }
        return maxsum;
    }
}
