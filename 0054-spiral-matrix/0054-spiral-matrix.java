// class Solution {
//     public List<Integer> spiralOrder(int[][] arr) {
//         List<Integer> res = new ArrayList<>();
//         int minr = 0, minc = 0;
//         int maxr = arr.length , maxc = arr[0].length-1;
//         int n = maxr*maxc;
//         int cnt = 0;
//         while(cnt<n){
//             //top wall
//             for(int i = minc , j = minr ; i<maxc && cnt<n ; i++){
//                 res.add(arr[i][j]);
//                 cnt++;
//             }
//             minr++;

//             //right wall
//             for(int i = minr , j = maxc ; i < maxr && cnt<n ; i++){
//                 res.add(arr[i][j]);
//                 cnt++;
//             }
//             maxc--;

//             //bottom wall
//             for(int i = maxc , j = maxr ; i>=minc && cnt<n; i--){
//                 res.add(arr[i][j]);
//                 cnt++;
//             }
//             maxr--;


//             //left wall
//             for(int i = maxr , j = minc ; i>=minr && cnt<n ; i--){
//                 res.add(arr[i][j]);
//                 cnt++;
//             }
//             minc++;

//         }
//         return res;
//     }
// }
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return res;
        }
        
        int minr = 0, minc = 0;
        int maxr = arr.length - 1, maxc = arr[0].length - 1; // Corrected index calculation
        int n = (maxr + 1) * (maxc + 1); // Corrected calculation of total elements
        int cnt = 0;
        
        while (cnt < n) {
            // Top wall
            for (int i = minc, j = minr; i <= maxc && cnt < n; i++) { // Changed the condition i<maxc to i<=maxc
                res.add(arr[j][i]); // Fixed the indices
                cnt++;
            }
            minr++;

            // Right wall
            for (int i = minr, j = maxc; i <= maxr && cnt < n; i++) {
                res.add(arr[i][j]);
                cnt++;
            }
            maxc--;

            // Bottom wall
            for (int i = maxc, j = maxr; i >= minc && cnt < n; i--) {
                res.add(arr[j][i]); // Fixed the indices
                cnt++;
            }
            maxr--;

            // Left wall
            for (int i = maxr, j = minc; i >= minr && cnt < n; i--) {
                res.add(arr[i][j]);
                cnt++;
            }
            minc++;
        }
        
        return res;
    }
}
