class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
     ArrayList<Integer> arr1 = new ArrayList<>();

        
       for(int i =0; i<nums1.length; i++){
           arr.add(nums1[i]);
       } 
        
        for(int j =0; j<nums2.length; j++){
            if(arr.contains(nums2[j])){
                arr1.add(nums2[j]);
                arr.remove(Integer.valueOf(nums2[j]));
            }
        }
        
        int a[]  = arr1.stream().mapToInt(Integer::intValue).toArray();
        return a;
        
        
    }
}