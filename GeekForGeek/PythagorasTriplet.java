/*Pythagorean Triplet in an array
Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
Example:

Input: arr[] = {3, 1, 4, 6, 5}
Output: True
There is a Pythagorean triplet (3, 4, 5).

Input: arr[] = {10, 4, 6, 12, 5}
Output: False
There is no Pythagorean triplet.*/

import java.util.*;

class PythagorasTriplet{
	public static void main(String[] args) {
		int[] a={3, 1, 4, 6, 5};
		int n=a.length;
		for(int i=0;i<a.length;i++){
			a[i]=a[i]*a[i];
		}

		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		boolean flag=true;
		for(int k=n-1;k>=2;k--){
			int l=0;
			int r=k-1;
			while(l!=r){
				if(a[l]+a[r]==a[k]){
					System.out.println("Pythagoras Triplet are :"+Math.sqrt(a[l])+","+Math.sqrt(a[r])+" "+Math.sqrt(a[k]));
					k=0;
					flag=false;
					break;
				}
				else if(a[l]+a[r]<a[k]){
					l++;
				}
				else{
					r--;
				}
			}
		}
		if(flag){
			System.out.println("No Triplet Exist");
		}

	}
}