class Solution {
    int minRow(int mat[][]) {
        // code here
        int minCount = Integer.MAX_VALUE;
        int ans = 1;
        for(int i = 0; i < mat.length; i ++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j ++){
                if(mat[i][j] == 1){
                    count ++;
                }
                
            }
            if(count < minCount){
                minCount = count;
                ans = i + 1;
            }
        }
        return ans;
    }
};