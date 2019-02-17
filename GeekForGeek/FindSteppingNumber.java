/*  find the stepping number */

import java.util.*;
class FindSteppingNumber{
	public static void main(String[] args) {
		int m=0,n=23;
		for(int i=0;i<=9;i++){
			step(m,n,i);
		}
	}
	public static void step(int m,int n,int num){
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(num);
		while(!q.isEmpty()){
			int t=q.poll();
			if(t>=m && t<=n){
				System.out.println(t+" ");
			}
			
			if(t==0 || t>n){
				continue;
			}
			
  

			int ld=t%10;
			
			int stepA=t*10+(ld+1);
			int stepB=t*10+(ld-1);

			if(ld==0){
				q.add(stepA);
			}


			else if(ld==9){
				q.add(stepB);
			}

			else{
				q.add(stepA);
				q.add(stepB);
			}
		}
	}
}