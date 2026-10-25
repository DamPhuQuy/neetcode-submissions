class Solution: 
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None: 
        q: list[int] = [] 
        i: int = 0 
        j: int = 0
        while i < m and j < n:
            if nums1[i] < nums2[j]: 
                q.append(nums1[i]) 
                i += 1
            else: 
                q.append(nums2[j]) 
                j += 1

        while i < m:
            q.append(nums1[i]) 
            i += 1

        while j < n:
            q.append(nums2[j]) 
            j += 1


        for i in range(m + n): 
            nums1[i] = q.pop(0)
            