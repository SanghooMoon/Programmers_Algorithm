package leetCode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 */
public class _944_Delete_Columns_to_Make_Sorted {
	
	/**
	 *  a[0].0	a[0].1	a[0].2
	 *	a[1].0	a[1].1	a[1].2
	 *  a[2].0	a[2].1	a[2].2
	 */
	public static int minDeletionSize(String[] strs) {
		int result = 0;
        
        for(int i=0; i<strs[0].length(); i++) {
        	for(int j=0; j<strs.length-1; j++) {
        		if(strs[j].charAt(i) > strs[j+1].charAt(i)) {
        			result++; break;
        		}
        	}
        }
        
		return result;
    }
	
	public static void main(String[] args) {
//		String[] strs = {"cba","daf","ghi"};
		String[] strs = {"zyx","wvu","tsr"};
		System.out.println(minDeletionSize(strs));
	}

}
