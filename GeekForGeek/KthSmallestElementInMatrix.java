/*Kth smallest element in a row-wise and column-wise sorted 2D array | Set 1
Given an n x n matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the given 2D array.
For example, consider the following 2D array.

        10, 20, 30, 40
        15, 25, 35, 45
        24, 29, 37, 48
        32, 33, 39, 50
The 3rd smallest element is 20 and 7th smallest element is 30*/

import java.util.*;

class Element implements Comparable<Element>{
	int x;
	int y;
	int val;
	Element(int x,int y, int val){
		this.x=x;
		this.y=y;
		this.val=val;
	}

	@Override
	public int compareTo(Element e){
		return this.val-e.val;
	}
}


class KthSmallestElementInMatrix{
	public static void main(String[] args) {
		int[][] a = { {10, 20, 30, 40}, 
                    {15, 25, 35, 45}, 
                    {25, 29, 37, 48}, 
                    {32, 33, 39, 50}, 
                  }; 
		System.out.println(help(a,7));
	}
	public static int help(int[][] a,int k){
		PriorityQueue<Element> pq=new PriorityQueue<Element>();
		for(int i=0;i<a[0].length;i++){
			pq.add(new Element(0,i,a[0][i]));
		}
		for(int i=0;i<k-1;i++){
			Element e=pq.poll();
			if(e.x==a.length-1){
				continue;
			}
			pq.offer(new Element(e.x+1,e.y,a[e.x+1][e.y]));
		}
		return pq.poll().val;
	}
}