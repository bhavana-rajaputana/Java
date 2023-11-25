package com.bhavana;

/* A Naive recursive implementation of 0-1 Knapsack problem */
class billboards {

    // A utility function that returns maximum of two integers
    static int max(int a, int b) { return (a > b) ? a : b; }

    // Returns the maximum value that can
    // be put in a knapsack of capacity W
    static int knapSack(int W, int wt[], int val[], int n)
    {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

        else
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
                    knapSack(W, wt, val, n - 1));
    }

    // Driver program to test above function
    public static void main(String args[])
    {
        int val[] = new int[] { 6,7,12,13,14 };
        int wt[] = new int[] { 5,6,5,3,1 };
        int W = 5;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
/*This code is contributed by Rajat Mishra */
