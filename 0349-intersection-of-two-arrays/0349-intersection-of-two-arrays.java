class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length ; i++){
            if(!ans.contains(nums1[i])){
                
                for(int j = 0; j < nums2.length ; j++){
                    if (nums1[i] == nums2[j]){
                        ans.add(nums2[j]);
                        break;
                    }
                }
                // int start = 0;
                // int end = nums2.length - 1;
                // while(start <= end){
                //     int mid = (start + end )/2;
                //     if( nums1[i] > nums2[mid]){
                //         start = mid + 1;
                //     }
                //     else if (nums1[i] < nums2[mid]){
                //         end = mid - 1;
                //     }
                //     else{
                //         ans.add(nums2[mid]);
                //         break;
                //     }
                // }
            
            }
        }
        
        int[] result = new int[ans.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = ans.get(i);
        }
        
        return result;
    }
}