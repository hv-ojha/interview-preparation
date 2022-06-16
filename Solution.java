import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int[] list = readIntegerArray();
        System.out.println(list[1]);
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