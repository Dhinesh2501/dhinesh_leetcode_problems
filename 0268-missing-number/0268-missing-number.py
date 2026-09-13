class Solution(object):
    def missingNumber(self, nums):
        n = len(nums)
        act = n * (n+1)//2
        total = sum(nums)
        return act - total