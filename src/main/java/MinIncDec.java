import java.util.Arrays;

class MinIncDec{

    // memoize the value recursive call
    static int [][]dp = new int[1000][1000];

    static int minimumIncDec(int arr[], int N, int maxE, int minE) {

        // If only one element is present,
        // then arr[] is sorted
        if (N == 0) {
            return 0;
        }

        // If dp[N][maxE] is precalculated,
        // then return the result
        if (dp[N][maxE] != 0)
            return dp[N][maxE];

        int ans = Integer.MAX_VALUE;

        // Iterate from minE to maxE which placed at previous index
        for(int k = minE; k <= maxE; k++) {

            // Update the answer according to
            // recurrence relation
            int x = minimumIncDec(arr, N - 1, k, minE);
            ans = Math.min(ans,
                    x + Math.abs(arr[N - 1] - k));
        }

        // Memoized the value
        // for dp[N][maxE]
        dp[N][maxE] = ans;

        // Return the final result
        return dp[N][maxE];
    }


    public static int solution(int[] arr) {

        int N = arr.length;

        // Find the minimum and maximum
        // element from the arr[]
        int minE = Arrays.stream(arr).min().getAsInt();
        int maxE = Arrays.stream(arr).max().getAsInt();

        // do it
        return minimumIncDec(arr, N, maxE, minE);
    }
}
