package java17.heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinHeap {
    private static void heapify(List<Integer> arr, int index, int n) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int smallest = index;

        // left child is present, and smaller than smallest (index)
        if (leftChild < n && arr.get(leftChild) < arr.get(smallest)) {
            smallest = leftChild;
        }

        // right child is present and smaller than smallest (index or leftChild)
        if (rightChild < n && arr.get(rightChild) < arr.get(smallest)) {
            smallest = rightChild;
        }

        // swap and further recursion required.
        if (smallest != index) { 
            // swap positions
            int temp = arr.get(index);
            arr.set(index, arr.get(smallest));
            arr.set(smallest, temp);

            // recurse for smallest 
            heapify(arr, smallest, n);
        }
    }

    public static void heapify(List<Integer> arr, int n) {
        for (int i = n/2 - 1; i >= 0; --i) {
            heapify(arr, i, n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> arr = Arrays.stream(br.readLine().trim().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
            heapify(arr, n);
            System.out.println(arr);
        }
    }
}