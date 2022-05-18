public class Problem1 {
    //TC : O(n)
    //SC : O(1)
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) return 0;

        int n = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }

    // binary search
    // TC : O (log n)
    // SC : O (1)
    public int hIndex2(int[] citations) {
        if (citations == null || citations.length == 0) return 0;

        int n = citations.length;
        int high = citations.length - 1;
        int low = 0;
        while (low <= high){
            int mid = low + (high-low)/2;

            if (citations[mid] == n - mid){
                return n - mid;
            }
            else if (citations[mid] > n - mid){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return n-low ;
    }
}
