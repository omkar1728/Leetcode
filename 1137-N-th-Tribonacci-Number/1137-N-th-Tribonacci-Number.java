class Solution {
    public int tribonacci(int n) {
        HashMap<Integer,Integer> cache = new HashMap<>();
        for(int i = 0; i <= n;i++){
            cache.put(i, tribo(i, cache));
        }
        return cache.get(n);
    }
    private static int tribo(int n, HashMap<Integer,Integer> cache){
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        else if(n<=0){
            return 0;
        }
        else if(n==2 || n==1){
            return 1;
        }
        else{
            return tribo(n-3,cache) + tribo(n-2,cache) + tribo(n-1,cache);
        }
    }
}