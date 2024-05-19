import java.util.Arrays;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        var heap = new MaxHeap(k);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                heap.add(new Element((float)arr[i]/arr[j], new int[]{arr[i], arr[j]}));
            }
        }
        return heap.heap[0].pair;
    }
}

class MaxHeap {
    Element[] heap;
    int size = 0;
    int maxSize = 0;
    MaxHeap (int k) { // O(k)
        heap = new Element[k];
        maxSize = k;
    }

    void add(Element ele) {
        if (size == 0) {
            heap[size] = ele;
            size++;
        } else if (size < maxSize) {
            heap[size] = ele;
            size++;
            heapifyFromBottom(size - 1);
        } else {
            if (ele.val < heap[0].val) {
                if (maxSize == 1) {
                    heap[0] = ele;
                } else {
                    removeTop();
                    heap[size] = ele;
                    size++;
                    heapifyFromBottom(size - 1);
                }

            }
        }
    }

    Element removeTop(){
        var ele = heap[0];
        heap[0] = heap[size - 1];
        heapifyFromTop(0);
        size--;
        return ele;
    }

    void heapifyFromBottom(int child) {
        if (child == 0) {
            return;
        }
        var parent = (child - 1)/2;
        if (heap[parent].val < heap[child].val) {
            var temp = heap[parent];
            heap[parent] = heap[child];
            heap[child] = temp;
            heapifyFromBottom(parent);
        }
    }

    void heapifyFromTop(int parent) {
        int lc = 2*parent + 1;
        int rc = 2*parent + 2;
        var temp = heap[parent].val;
        if (lc < size) {
            temp = Math.max(temp, heap[lc].val);
        }
        if (rc < size) {
            temp = Math.max(temp, heap[rc].val);
        }
        if (lc < size && temp == heap[lc].val) {
            var rep = heap[parent];
            heap[parent] = heap[lc];
            heap[lc] = rep;
            heapifyFromTop(lc);
        }
        if (rc < size && temp == heap[rc].val) {
            var rep = heap[parent];
            heap[parent] = heap[rc];
            heap[rc] = rep;
            heapifyFromTop(rc);
        }
    }
    
}

class Element {
    float val;
    int[] pair;
    Element(float val, int[] pair) {
        this.val = val;
        this.pair = pair;
    }
    public String toString() {
        return Arrays.toString(pair);
    }
}
