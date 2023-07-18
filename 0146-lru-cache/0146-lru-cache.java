class LRUCache {
    LinkedHashMap <Integer, Integer> cache;
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        cache = new LinkedHashMap <Integer, Integer>();
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            int i = (int) cache.get(key);
            cache.remove(key);
            cache.put(key, i);
            return i;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.remove(key);
            cache.put(key,value);
        }
        else{
            cache.put(key,value);
            int size = cache.size();
            if(size>cap){
                 int oldest = cache.keySet().iterator().next();
                cache.remove(oldest);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */