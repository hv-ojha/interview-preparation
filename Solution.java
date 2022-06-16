import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Solution class can be used a main file to run algorithm. In case of any new input requirement.
 * Please raise PR for the same.
 * Don't raise PRs with input file changes or algorithm file calls.
 * 
 * @author Harshvardhan Ojha
 * @version 1.0
 */
class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        Long programStartTime, solutionStartTime, solutionEndTime;
        programStartTime = System.nanoTime();
        solutionStartTime = System.nanoTime();

        /**
         * Add your input calls here.
         * You can reuse below mentioned bufferedReader input calls to read input
         * readLine() - read string input
         * readInteger() - read integer input
         * readLong() - read long input
         * readStringArray() - read string array
         * readIntegerArray() - read integer array
         * readLongArray() - read long array
         * readDoubleArray() - read double array
         * 
         * Please raise PR if you want to add any new functions to read input
         */


        System.out.println("Solution executed in " + (solutionStartTime - programStartTime) + " nanoseconds");
        System.out.println("======= Solution Execution starts =======");

        /**
         * Please add your solution class call here. Try creating static class and static function for your solution
         * Example:- Array.binarySearch(arrayInput)
         */

        solutionEndTime = System.nanoTime();
        System.out.println("=======  Solution Execution done  =======");
        System.out.println("Solution took " + (solutionEndTime - solutionStartTime) + " nanoseconds");
    }

    static String readLine() throws Exception {
        return br.readLine().trim();
    }

    static Integer readInteger() throws Exception {
        return Integer.parseInt(br.readLine().trim());
    }

    static Long readLong() throws Exception {
        return Long.parseLong(br.readLine().trim());
    }

    static List<String> readStringArray() throws Exception {
        return Arrays.asList(br.readLine().trim().split(" "));
    }

    static int[] readIntegerArray() throws Exception {
        return Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static long[] readLongArray() throws Exception {
        return Arrays.stream(br.readLine().trim().split(" ")).mapToLong(Long::parseLong).toArray();
    }

    static double[] readDoubleArray() throws Exception {
        return Arrays.stream(br.readLine().trim().split(" ")).mapToDouble(Double::parseDouble).toArray();
    }
}