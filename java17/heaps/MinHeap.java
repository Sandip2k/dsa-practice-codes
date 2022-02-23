package java17.heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinHeap {
    private static void heapify(List<Integer> arr, int index) {

    }

    public static void heapify(List<Integer> arr) {
        int n = arr.size();
        for (int i = n/2 - 1; i >= 0; --i) {
            heapify(arr, i);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            List<Integer> arr = Arrays.stream(br.readLine().trim().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
            heapify(arr);
            System.out.println(arr);
        }
    }
}