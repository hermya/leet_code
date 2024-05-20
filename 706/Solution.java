class KthLargest {
    MinHeap heap;
    public KthLargest(int k, int[] nums) {
        heap = new MinHeap(k);
        for (int ele : nums) {
            heap.add(ele);
        }
    }
    
    public int add(int val) {
        heap.add(val);
        return heap.heap[0];
    }
}

class MinHeap {
    int heap[];
    int size;
    int maxSize;

    MinHeap(int k){
        maxSize = k;
        heap = new int[k];
    }

    void add(int ele) {
        if (size == 0) {
            heap[size] = ele;
            size++;
        } else if (size < maxSize) {
            heap[size] = ele;
            size++;
            heapifyFromBottom(size - 1);
        } else {
            if (ele > heap[0]) {
                removeTop();
                heap[size] = ele;
                size++;
                heapifyFromBottom(size - 1);
            }
        }
    }

    int removeTop() {
        var top = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifyFromTop(0);
        return top;
    }

    void heapifyFromTop(int parent) {
        var lc = 2*parent + 1;
        var rc = 2*parent + 2;
        var temp = heap[parent];
        temp = Math.min(temp, lc < size ? heap[lc] : temp);
        temp = Math.min(temp, rc < size ? heap[rc] : temp);
        if (lc < size && temp == heap[lc]) {
            var rep = heap[parent];
            heap[parent] = temp;
            heap[lc] = rep;
            heapifyFromTop(lc);
        } else if (rc < size && temp == heap[rc]) {
            var rep = heap[parent];
            heap[parent] = temp;
            heap[rc] = rep;
            heapifyFromTop(rc);
        }
    } 
    
    void heapifyFromBottom(int child) {
        if (child == 0) {
            return;
        }
        var parent = (child - 1)/2;
        if (heap[parent] > heap[child]) {
            var temp = heap[parent];
            heap[parent] = heap[child];
            heap[child] = temp;
            heapifyFromBottom(parent);
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */