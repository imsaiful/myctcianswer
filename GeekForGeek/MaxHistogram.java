/*Largest Rectangular Area in a Histogram | Set 1
Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.
For example, consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 2, 6}. The largest possible rectangle possible is 12 (see the below figure, the max area rectangle is highlighted in red)

histogram*/
import java.util.*;
class MaxHistogram{
	public static void main(String[] args) {
		int[] a={6, 1, 5, 4, 5, 2, 6};
		System.out.println(MaxHistoGram(a));


	}
	public static int MaxHistoGram(int[] a){
		Stack<Integer> st=new Stack<Integer>();
		int i=0;
		int max=0,area=0;
		while(i<a.length){
			if(st.isEmpty() || a[st.peek()]<=a[i]){
				st.push(i++);
			}
			else{
				int top=st.peek();
				st.pop();
				if(st.isEmpty()){
					area=a[top]*i;
				}
				else{
					area=a[top]*(i-st.peek()-1);
				}
				if(area>max){
					max=area;
				}
			}
			System.out.println(area);
		}
		while(st.isEmpty()){
			int top=st.peek();
				st.pop();
				if(st.isEmpty()){
					area=a[top]*i;
				}
				else{
					area=a[top]*(i-st.peek()-1);
				}
				if(area>max){
					max=area;
				}
				System.out.println(area);
		}
		return max;
	}


}