class Solution {
    public int findKthLargest(int[] nums, int k) {
        var heap = new MinHeap(k);
        for (int num : nums) {
            heap.insert(num);
        }
        return heap.heap[0];
    }
}

class MinHeap {
    int[] heap;
    int capacity;
    int size;
    
    MinHeap(int n) {
        size = 0;
        heap = new int[n+1];
        capacity = n;
    }

    void insert(int ele) {
        if (size == 0) {
            heap[size] = ele;
            size++; 
        } else {
            if (size >= capacity && ele > heap[0]) {
                removeFirst();
            } 
            if (size < capacity) {
                heap[size] = ele;
                heapifyFromBottom(size);
                size++;
            }
        }
    }

    void heapifyFromBottom(int child) {
        var parent = (child - 1)/2;
        if (heap[parent] > heap[child]) {
            var temp = heap[parent];
            heap[parent] = heap[child];
            heap[child] = temp;
            heapifyFromBottom(parent);
        }
    }

    void removeFirst() {
        heap[0] = heap[size - 1];
        size--;
        heapifyFromTop(0);
    }

    void heapifyFromTop(int parent){
        var l = 2*parent + 1;
        var r = 2*parent + 2;
        var lc = l < size ? heap[l] : 10001;
        var rc = r < size ? heap[r] : 10001;
        var min = Math.min(heap[parent], Math.min(lc, rc));
        if (l < size && min == lc) {
            heap[l] = heap[parent];
            heap[parent] = lc;
            heapifyFromTop(l);
        } else if (r < size && min == rc) {
            heap[r] = heap[parent];
            heap[parent] = rc;
            heapifyFromTop(r);
        }
    }

}