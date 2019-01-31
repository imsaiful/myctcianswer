/*perm_identity
Sort elements by frequency | Set 1
Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

Examples:

Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}*/
import java.util.*;
class MaxFrequency{
	public static void main(String[] args) {
		int[] a={2, 5, 2, 1, 5, 6, 1, 1};
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(tm.containsKey(a[i])){
				tm.put(a[i],tm.get(a[i])+1);
			}
			else{
				tm.put(a[i],1);	
			}
		}
		Collections.sort(tm, new Comparator<TreeMap>(){
			public int compare(TreeMap a,TreeMap b){
				if(tm.get(a)>tm.get(b)){
					return 1;
				}
				else if(tm.get(a)==tm.get(b)){
					return a-b;
				}
				else{
					return 0;
				}
			}
		});
		for(Map.Entry m:tm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		} 
	}


}