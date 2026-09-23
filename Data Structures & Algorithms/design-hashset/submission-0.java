class MyHashSet {

    private static final int NUM_BUCKETS = 769; 
    private LinkedList<Integer>[] buckets; 

    public MyHashSet() {
        buckets = new LinkedList[NUM_BUCKETS];  
    
        for (int i = 0; i < NUM_BUCKETS; i++) {
            buckets[i] = new LinkedList<>(); 
        }
    }
    
    private int hash(int key) {
        return key % NUM_BUCKETS; 
    }

    public void add(int key) {
        int index = hash(key);
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = hash(key);
        buckets[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */