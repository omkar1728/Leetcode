#User function Template for python3

import heapq
class Solution:
    def minimizeSum(self, N, arr):
        # Code here
        heapq.heapify(arr)
        ans = 0
        # Poll two smallest elements from the heap, add their sum to the heap
        while len(arr) > 1:
            first = heapq.heappop(arr)
            second = heapq.heappop(arr)
            sum = first + second
            ans += sum 
            heapq.heappush(arr, sum)
        return ans



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    
    for _ in range(t):
        n = int(input())
        A = [int(x) for x in input().split()]
        ob=Solution()
        print(ob.minimizeSum(n, A))
# } Driver Code Ends