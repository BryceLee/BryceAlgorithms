import javax.swing.tree.TreeNode;

/**
 *https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class T69 {
    public static void main(String[] a) {
        

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        return hashMethod(nums1, nums2);
   }
 
   private static int[] hashMethod(int[] nums1, int[] nums2) {
     HashSet<Integer> set1 = new HashSet<Integer>();
     for (int i = 0; i < nums1.length; i++) {
       set1.add(nums1[i]);
     }
     
     HashSet<Integer> set2 = new HashSet<Integer>();
     for (int i = 0; i < nums2.length; i++) {
       set2.add(nums2[i]);
     }
     
     if (set1.size() <= set2.size()) {
       return getInts(set1, set2);
     } else {
       return getInts(set2, set1);
     }
   }
 
   private static int[] getInts(HashSet<Integer> smallset, HashSet<Integer> bigset) {
        int[] ints = new int[smallset.size()];
     int s = 0;
     for (Integer i : smallset) {
       if (bigset.contains(i)) {
         ints[s++] = i;
       }
     }
     return Arrays.copyOf(ints,s);
   }
}
