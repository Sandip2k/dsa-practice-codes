package heaps;
/*
Min Heap-Prepbytes
Given an array containing N integers, your task is to create a min-heap using the elements
of the given array and print the heap array. Elements needs to be inserted one by one in the heap.

Note: Use heap concepts to solve the problem.

Input Format
The first line contains an integer T denoting the number of test cases.
For each of the next T lines,The first line contains an integer
N denoting the number of elements in the array.The second line contains N space-separated integers.
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t>0){
            int maxsize = obj.nextInt();
            MinHeap minHeap = new MinHeap(maxsize);

            for(int i=1;i<=maxsize;i++){
                minHeap.insert(obj.nextInt());
            }

            minHeap.printHeap();
            System.out.println();
            t--;
        }
    }
}

class MinHeap {
    private int size;
    private int maxsize;
    private int [] heap;

    public MinHeap(int maxsize) {
        this.maxsize=maxsize+1;
        size=0;
        heap= new int[this.maxsize];
        heap[0]=Integer.MIN_VALUE;
    }

    public void insert(int element) {
        heap[++size]=element;
        minHeapify(heap,size);
    }

    public void swap(int i,int parent){

        int temp = heap[i];
        heap[i] = heap[parent];
        heap[parent] = temp;

    }

    public void minHeapify(int []heap,int i){
        int parent=i/2;//its always going to be true
        if(isValidParent(parent)){
            if (heap[i] < heap[parent]) {
                swap(i,parent);
                minHeapify(heap,parent);
            }
        }
    }

    private boolean isValidParent(int parent) {
        if(parent>=0)
            return true;
        return false;
    }

    public void printHeap(){
        for(int i=1;i<=size;i++){
            System.out.print(heap[i]+ " " );
        }
    }
}
