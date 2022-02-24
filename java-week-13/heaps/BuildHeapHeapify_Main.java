//package heaps;
//
//import java.util.Scanner;
//
//public class BuildHeapHeapify_Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter max size of heap: ");
//        int maxsize = sc.nextInt();
//        MinHeap minHeap = new MinHeap(maxsize);
//        MaxHeap maxHeap = new MaxHeap(maxsize);
//
//        System.out.println("Input Elements! : -->");
//        for(int i=1;i<=maxsize;i++){
//            int element = sc.nextInt();
//            maxHeap.insert(element);
//            minHeap.insert(element);
//        }
//
//        System.out.println("//*****************  Max Heap  *************************");
//        System.out.println("Before build heap: ");
//        maxHeap.printHeap();
//        maxHeap.buildHeap();
//        System.out.println("\n");
//        System.out.println("After build heap: ");
//        maxHeap.printHeap();
//        maxHeap.extractMax();
//        System.out.println("\n");
//        System.out.println("After extract max: ");
//        maxHeap.printHeap();
//        maxHeap.increaseKey(3,20);
//        System.out.println("\n");
//        System.out.println("After increaseKey: ");
//        maxHeap.printHeap();
//        System.out.println("\n");
//        maxHeap.heapSort();
//        System.out.println("After heapSort: ");
//        maxHeap.printHeap();
//        System.out.println("\n");
//
//        System.out.println("//*****************  Min Heap  *************************");
////        MinHeap minHeap = new MinHeap(maxsize);
////        System.out.println("Input Elements! : -->");
////        for(int i=1;i<=maxsize;i++){
////            minHeap.insert(sc.nextInt());
////        }
//        System.out.println("Before build heap: ");
//        minHeap.printHeap();
//        minHeap.buildHeap();
//        System.out.println("\n");
//        System.out.println("After build heap: ");
//        minHeap.printHeap();
//        minHeap.extractMin();
//        System.out.println("\n");
//        System.out.println("After extract min: ");
//        minHeap.printHeap();
//        minHeap.decreaseKey(7,4);
//        System.out.println("\n");
//        System.out.println("After decreaseKey: ");
//        minHeap.printHeap();
//        System.out.println("\n");
//        minHeap.heapSort();
//        System.out.println("After heapSort: ");
//        minHeap.printHeap();
//        System.out.println("\n");
//    }
//}
