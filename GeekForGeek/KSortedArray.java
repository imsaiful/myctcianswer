import java.util.*;

class ArrayContainer implements Comparable<ArrayContainer> {
	int[] arr;
	int index;
 
	public ArrayContainer(int[] arr, int index) {
		this.arr = arr;
		this.index = index;
	}
 
	@Override
	public int compareTo(ArrayContainer o) {
		return this.arr[this.index] - o.arr[o.index];
	}
}

public class KSortedArray {
	public static int[] mergeKSortedArray(int[][] arr) {
		//PriorityQueue is heap in Java 
		PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>();
		int total=0;
 
		//add arrays to heap
		for (int i = 0; i < arr.length; i++) {
			queue.add(new ArrayContainer(arr[i], 0));
			total = total + arr[i].length;
		}
		int m=0;
		int result[] = new int[total];
 
		//while heap is not empty
		while(!queue.isEmpty()){
			ArrayContainer ac = queue.poll();
			result[m++]=ac.arr[ac.index];
 
			if(ac.index < ac.arr.length-1){
				queue.add(new ArrayContainer(ac.arr, ac.index+1));
			}
		}
 
		return result;
	}
 
	public static void main(String[] args) {
		int[] a={1,3,5,7,9};
		int[] b={2,4,5,6,8};
		int[] c={11,22,33,44,0};
 
		int[] result = mergeKSortedArray(new int[][] { a, b, c });
		System.out.println(Arrays.toString(result));
	}
}