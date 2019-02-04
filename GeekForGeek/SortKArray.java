/*1) Given input as k sorted arrays, generate a single sorted list as output.
Eg:
Array1: 1 5 8 9 11 ….
Array2: 2 12 24 44 …..
.
.
Arrayk: 3 15 79 115 ….
Output: Array1: 1 2 3 5 8 9 11 12 15 ….
Discussed the approach, and complexity, then wrote the code for the same.*/
import java.util.*;
class ArrayContainer implements Comparable<ArrayContainer>{
	int[] ar;
	int index;
	ArrayContainer(int[] ar,int index){
		this.ar=ar;
		this.index=index;
	}
	@Override
	public int compareTo(ArrayContainer o){
		return this.ar[this.index]-o.ar[o.index];

	}
}
class SortKArray{
	public static void main(String[] args) {
		int[] a={1,3,5,7,9};
		int[] b={2,4,5,6,8};
		int[] c={11,22,33,44,0};

		int[] result=MergeElement(new int[][] {a,b,c});

		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+"  ");
		}
	}

	public static int[] MergeElement(int[][] a){
		PriorityQueue<ArrayContainer> pq=new PriorityQueue<ArrayContainer>();
		int total=0;
		for(int i=0;i<a.length;i++){
			pq.add(new ArrayContainer(a[i],0));
			total+=a[i].length;
		}
		int m=0;
		int[] result=new int[total];
		while(!pq.isEmpty()){
			ArrayContainer temp=pq.poll();
			result[m++]=temp.ar[temp.index];
			if(temp.index < temp.ar.length-1){
				pq.add(new ArrayContainer(temp.ar, temp.index+1));
			}
		}
		return result;
	}
}