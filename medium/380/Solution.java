import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {

    int[] set;
    int size = 0;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Random random = new Random();
    Integer lastNum = -1;
    public RandomizedSet() {
        set = new int[20001];
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            //System.out.println(false);
            return false;
        }
        set[size] = val;
        map.put(val, size);
        size++;
        //System.out.println(true);
        return true;
    }
    
    public boolean remove(int val) {
        var key = map.get(val);
        if (key == null) {
            //System.out.println(false);
            return false;
        }
        map.remove(val);
        if (size - 1 == 0 || key == size - 1) {
            size--;
            //System.out.println(true);
            return true;
        }
        set[key] = set[size - 1];
        map.put(set[key], key);
        size--;
        //System.out.println(true);
        return true;
    }
    
    public int getRandom() {
        var x = set[random.nextInt(size)];

        return x;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */