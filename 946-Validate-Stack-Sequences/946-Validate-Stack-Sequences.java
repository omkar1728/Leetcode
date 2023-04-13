class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int p = 0;
        for(int i = 0; i < pushed.length; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[p]){
                stack.pop();
                p += 1;
            }
        }
        while(!stack.isEmpty()){
            if(stack.pop() != popped[p]){
                return false;
            }
            p += 1;
        }
        return true;
    }   
}