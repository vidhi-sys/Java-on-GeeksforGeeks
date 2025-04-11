#User function Template for python3

class Solution:
    # Function to find uncommon characters between two strings.
    def uncommonChars(self, s1, s2):
        set1=set(s1)
        set2=set(s2)
        unique=set1.symmetric_difference(set2)
        sorted_unique=sorted(unique)
        return ''.join(sorted_unique)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())

    for tcs in range(T):
        A = input()
        B = input()
        ob = Solution()
        print(ob.uncommonChars(A, B))

        print("~")
# } Driver Code Ends