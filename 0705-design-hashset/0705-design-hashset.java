import java.util.Vector;

class MyHashSet {
    int[] v;

    public MyHashSet() {
        v = new int [1000000+10];
    }
    
    public void add(int key) {
        v[key] = 1;
    }
    
    public void remove(int key) {
        v[key] = 0;
    }
    
    public boolean contains(int key) {
        if (v[key] == 1) return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */