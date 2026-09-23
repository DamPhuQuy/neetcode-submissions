class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1); 
        return nums; 
    }

    public static void mergeSort(int[] nums, int left, int right) { 
        if (left < right) {
            int mid = left + (right - left) / 2; 
            mergeSort(nums, left, mid); 
            mergeSort(nums, mid + 1, right); 
            merge(nums, left, mid, right); 
        }
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid - left + 1; 
        int n2 = right - mid; 
    
        int[] l = new int[n1]; 
        int[] r = new int[n2]; 

        for (int i = 0; i < n1; i++)
            l[i] = nums[left + i]; 
        for (int i = 0; i < n2; i++)
            r[i] = nums[mid + 1 + i]; 

        int i = 0, j = 0; 

        int k = left; 
        while (i < n1 && j < n2) {
            if (l[i] < r[j]) {
                nums[k] = l[i];
                i += 1;  
            } else {
                nums[k] = r[j]; 
                j += 1;
            }
            k += 1; 
        }

        while (i < n1) {
            nums[k] = l[i]; 
            i += 1; 
            k += 1;            
        }

        while (j < n2) {
            nums[k] = r[j]; 
            j += 1; 
            k += 1; 
        }   
    }
}