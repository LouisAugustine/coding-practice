package jdk.Codility;

import java.util.stream.IntStream;

public class CountDiv {
    public static void main (String[] args) throws Exception {

        int a = 6, b = 11, k = 2;
        System.out.println(getCountDivNumberLambda(a,b,k));
    }

    public static int getCountDivNumberLambda(int a, int b, int k) {
        return (int) IntStream.rangeClosed(a,b).filter(i -> i % k == 0).count();
    }

    public static int getCountDivNumber(int a, int b, int k) {
        int count = 0;
        for(int i = a; i <= b; i ++){
            if(i % k == 0)
                count ++;
        }

        return count;
    }

}

/****
 * CountDiv Compute number of integers divisible by k in range [a..b].
 *  Write a function:
 *
 * class Solution { public int solution(int A, int B, int K); }
 *
 * that, given three integers A, B and K, returns the number of integers within the range [A..B]
 * that are divisible by K, i.e.:
 *
 * { i : A ≤ i ≤ B, i mod K = 0 }
 *
 * For example, for A = 6, B = 11 and K = 2, your function should return 3,
 * because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 *
 */