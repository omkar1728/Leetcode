class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == minDiff){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}