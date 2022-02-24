package heaps;

public class MaxHeap {
    private int size;
    private int maxsize;
    private int [] heap;

    public MaxHeap(int maxsize) {
        this.maxsize=maxsize+1;
        size=0;
        heap= new int[this.maxsize];
        heap[0]=Integer.MAX_VALUE;
    }

    public void insert(int element) {
        heap[++size]=element;
    }

    public void swap(int i,int largest){

        int temp = heap[i];
        heap[i] = heap[largest];
        heap[largest] = temp;

    }

    public boolean isLeaf(int pos){
        if(pos>size/2 && pos<=size)
            return true;
        else
            return false;
    }
    public void maxHeapify(int []heap,int i){
        if(isLeaf(i)){
            return;
        }

        int rightChild = 2*i + 1;
        int leftChild = 2*i;

        if(rightChild<=size){
            if (heap[i] >= heap[rightChild] && heap[i] >= heap[leftChild]) {
                return;
            }
        }
        else{
                if(heap[i]>=heap[leftChild]){
                    return;
                }
        }

        int largest;
        if(leftChild<=size && heap[i]<heap[leftChild]){
            largest=leftChild;
        }
        else{
            largest=i;
        }

        if(rightChild<=size && heap[largest]<heap[rightChild]){
            largest=rightChild;
        }

        if(largest!=i){
            swap(i,largest);
        }
        maxHeapify(heap,largest);
    }

    public void buildHeap(){
        int j = (int)Math.floor(size/2.0);
        for(int i=j;i>=1;i--){
            maxHeapify(heap,i);
        }
    }

    public void printHeap(){
        for(int i=1;i<=size;i++){
            System.out.print(heap[i]+ " " );
        }
    }

    public int extractMax(){
        if(size<1){
            System.out.println("Error: underflow");
        }
        int max = heap[1];
        heap[1]=heap[size];
        size--;
        maxHeapify(heap,1);
        return max;
    }

    public void increaseKey(int i, int key ){
        if(key<heap[i]){
            System.out.println("Key to be updated is already larger!!! ");
            return;
        }
        heap[i]=key;
        while(i>1 && heap[i/2]<heap[i]){
            swap(i,i/2);
            i/=2;
        }
    }

    public void heapSort() {
        buildHeap();
        int length=size;
        for(int i=size;i>=2;i--){
            swap(1,i);
            size--;
        maxHeapify(heap,1);
        }
        size=length;
    }
}
