class Solution:
    def checkStatus(self, a, b, flag):
        # Either one is non-negative (not both) and flag is false
        condition1 = ((a >= 0 and b < 0) or (a < 0 and b >= 0)) and not flag
        # Both are negative and flag is true
        condition2 = (a < 0 and b < 0) and flag
        
        return condition1 or condition2