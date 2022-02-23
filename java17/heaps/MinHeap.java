package java17.heaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinHeap {

    List<Integer> arr;

    public MinHeap() {
        this.arr = new ArrayList<>();
    }

    // O(log(n)) insert operation.
    public void insert(int element) {
        arr.add(element);
        siftUp(this.arr, this.arr.size() - 1, this.arr.size());
    }

    public void print() {
        for (int e: this.arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private static void siftDown(List<Integer> arr, int index, int n) {
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

        // if swap and further recursion required.
        if (smallest != index) { 
            // swap positions
            int temp = arr.get(index);
            arr.set(index, arr.get(smallest));
            arr.set(smallest, temp);

            // recurse for smallest 
            siftDown(arr, index, n);
        }
    }

    private static void siftUp(List<Integer> arr, int index, int n) {
        int parent = (index - 1) / 2;
        if (parent >= 0) { // valid parent
            if (arr.get(index) < arr.get(parent)) { // if swap and further recursion required
                int temp = arr.get(index);
                arr.set(index, arr.get(parent));
                arr.set(parent, temp);

                siftUp(arr, parent, n);
            }
        }
    }

    // O(n) solution for building a heap from a given array
    public static void buildHeap(List<Integer> arr, int n) {
        for (int i = n/2 - 1; i >= 0; --i) {
            siftDown(arr, i, n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinHeap h = new MinHeap();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            List<Integer> arr = Arrays.stream(br.readLine().trim().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
            for (int x: arr) {
                h.insert(x);
            }
            h.print();
        }
    }
}