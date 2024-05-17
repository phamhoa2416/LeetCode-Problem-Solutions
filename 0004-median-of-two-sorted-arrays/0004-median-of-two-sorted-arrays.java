class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] arr = new int[length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
       
        if (length % 2 == 0) {
            return (double) (arr[length/2] + arr[length/2 - 1]) / 2;
        } else {
            return (double) arr[length/2];
        }
    }
}