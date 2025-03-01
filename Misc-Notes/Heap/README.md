<h2 style="color:#F40;">Heap implementation and important points</h2>

Referred from **[here](https://www.programiz.com/dsa/heap-data-structure)**

**Use this code for Min-heap implementation**
```java
public class MinHeap {

    public static void main(String[] args) {
        var heap = new MinHeap(7);
        var input = new int[]{7, 9, 11, 4, 3, 1, 0};
        for (int ele : input) {
            heap.add((float)ele);
        }
        heap.print();
        System.out.println();
        heap.removeFirst();
        heap.print();
        System.out.println();
        heap.removeFirst();
        heap.print();
        System.out.println();
        heap.removeFirst();
        heap.print();
        System.out.println();
        heap.removeFirst();
        heap.print();
        System.out.println();
        heap.removeFirst();
        heap.print();
        System.out.println();
        heap.removeFirst();
        heap.print();
        System.out.println();

    }

    float[] heap;
    int size = 0;
    int maxSize;
    MinHeap(int k) { // create an array of elements that holds the heap
        this.maxSize = k;
        heap = new float[k];
        while (k > 0) {
            heap[k - 1] = 1000000007;
            k--;
        }
    }

    void add(float ele) {
        if (this.size == 0) { // if it is the first element, there's no shifting of elements
            heap[size] = ele;
            size++;
        } else { // if there are more than 1 elements in the heap, add new element as last and heapify from the last element
            heap[size] = ele;
            redoHeap(size);
            size++;
        }
    }

    /**
     * from a certain 'index' of the heap, do the following operation ->
     * for element with index 'i', it's parent's index is int((i - 1)/2)
     * eg :         2(0)
     *            /     \
     *          10(1)    4(2)
     *         /    \
     *       11(3)  14(4)
     * parent of 4 is at index (2-1)/2 => 0, similar to 10 => 0
     * but parent of 14 is at index (4-1)/2 => 1
     * 
     * redoHeap:
     * for a new element added, if it is smaller(min-heap) than it's parent,
     * swap it with it's parent and if swap happened, do the same for parent
     * with parent's parent and so on
     */ 
    void redoHeap(int index) {
        if (index == 0) {
            return;
        }
        int parent = (index - 1)/ 2;
        if ( heap[parent] > heap[index] ) {
            var temp = heap[parent];
            heap[parent] = heap[index];
            heap[index] = temp;
            redoHeap(parent);
        }
    }

    float removeFirst() {
        var first = this.heap[0];
        this.heap[0] = this.heap[size - 1];
        size--;
        redoHeapFromTop(0);
        return first;
    }

    /**
     * lc -> left child of current top, rc = right child
     * In redoHeapFromTop, you have to redo the heap from top
     * i.e., for a given parent, it's children may not be heapified, 
     * so heapify them.
     * 
     * How do you heapify?
     * for min-heap, a bad top-lc-rc pair would be the one with top 
     * greater than either lc or rc. How to fix this?
     * set top as min(lc and rc)
     * if new value of top is lc, lc = old top, redo heap from lc
     * - || - rc, rc = old top, redo heap from rc
     */ 
    void redoHeapFromTop(int top) {
        int lc = 2*top + 1;
        int rc = 2*top + 2;
        float temp = heap[top];
        if (lc < size) {
            temp = Math.min(heap[lc], temp);
        }
        if (rc < size) {
            temp = Math.min(heap[rc], temp);
        }
        if (lc < size && temp == heap[lc]) {
            heap[lc] = heap[top];
            heap[top] = temp;
            redoHeapFromTop(lc);
        }
        if (rc < size && temp == heap[rc]) {
            heap[rc] = heap[top];
            heap[top] = temp;
            redoHeapFromTop(rc);
        }
    }

    void print() {
        var next = 2;
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + ", ");
            if (i == next - 2) {
                System.out.println();
                next = next * 2;
            }
        }
        System.out.println();
    }
}
```
```c++
// With c++
class PriorityQueue{
    private:
    int* pq;
    int size;
    int capacity;
    
    public:
    PriorityQueue(int n) {
        cout<<"Created PQ with size "<<n<<std::endl;
        this -> capacity = n;
        this -> size = 0;
        this -> pq = new int[n];
    }
    
    void tbHeapify(int p){
        int leftChild = 2*p + 1;
        int rightChild = 2*p + 2;
        int parent = pq[p];
        int left, right;
        if (leftChild < size) {
            left = pq[leftChild];
        } else {
            left = INT_MAX;
        }
        if (rightChild < size) {
            right = pq[rightChild];
        } else {
            right = INT_MAX;
        }
        
        if (parent > left && parent > right) {
            if (left > right) {
                int temp = parent;
                pq[p] = right;
                pq[rightChild] = temp;
                tbHeapify(rightChild);
            } else {
                int temp = parent;
                pq[p] = left;
                pq[leftChild] = temp;
                tbHeapify(leftChild);
            }
        } else if (parent > left) {
            int temp = parent;
            pq[p] = left;
            pq[leftChild] = temp;    
            tbHeapify(leftChild);
        } else if (parent > right) {
            int temp = parent;
            pq[p] = right;
            pq[rightChild] = temp;     
            tbHeapify(rightChild);
        }
    }
    
    void btHeapify(int child) {
        int parent = (child - 1)/2;
        if (parent < 0) {
            return;
        }
        int parEle = pq[parent];
        int childEle = pq[child];
        
        if (parEle > childEle) {
            int temp = parEle;
            pq[parent] = childEle;
            pq[child] = parEle;
            btHeapify(parent);
        }
    }
    
    void add(int ele) {
        pq[size] = ele;
        size++;
        btHeapify(size - 1);
        print();
    }
    
    int pop() {
        int val = pq[0];
        size--;
        pq[0] = pq[size];
        tbHeapify(0);
        return val;
    }
    
    int sizeX() {
        return size;
    }
    
    void print() {
        for (int i = 0; i < this -> sizeX(); i++) {
            cout << this -> pq[i] << " "; 
        }
        cout << std::endl;
    }
    
};

int main() {
    std::cout << "Hello World!\n";
    PriorityQueue pq(10);
    pq.add(1);    
    pq.add(6);
    pq.add(2);
    pq.add(0);
    pq.add(8);
    
    int m = 5;
    
    while (m > 0) {
        m --;
        cout << pq.pop() << " ";
    }
    cout << std::endl;
}
```

**IMPORTANT**
* Replace the condition that top should be smaller than both it's childs to top should be greater, makes it a max heap
<ol>
If you want to use heap as a priority queue (with fixed size)
<li>Getting top k smallest elements can be implemented as a <b>MAX-HEAP</b> where top element is the k'th smallest element and rest are smaller than k
</li>
<li>
Getting top k biggest elements can be implement using a <b>MIN-HEAP</b> where the top is the k'th biggest element and rest are bigger than k
</li>
</ol>

