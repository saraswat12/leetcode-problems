class RandomizedSet {

        HashMap<Integer, Integer> map;  
        ArrayList<Integer> arr;
    public RandomizedSet() {
        map = new HashMap<>();
        arr = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        arr.add(val);
        map.put(val, arr.size()-1);
        return true;
        
        
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int idx = map.get(val);
        Collections.swap(arr, idx, arr.size()-1);
        int swappedwith = arr.get(idx);
        map.put(swappedwith, idx);
        arr.remove(arr.size()-1);
        map.remove(val);
        return true;
        
        
        
        
    }
    
    public int getRandom() {
        Random random = new Random();
        int n = random.nextInt(arr.size());
        return arr.get(n);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */