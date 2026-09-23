class MyHashMap {

    private static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int NUM_BUCKETS = 2069; 
    private LinkedList<Entry>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[NUM_BUCKETS];
        for (int i = 0; i < NUM_BUCKETS; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % NUM_BUCKETS;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        for (Entry entry : buckets[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        buckets[index].add(new Entry(key, value));
    }
    
    public int get(int key) {
        int index = hash(key);
        for (Entry entry : buckets[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1; // Not found per LeetCode spec
    }
    
    public void remove(int key) {
        int index = hash(key);
        for (Entry entry : buckets[index]) {
            if (entry.key == key) {
                buckets[index].remove(entry);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */