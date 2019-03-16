/*Next Greater Element
Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.

Examples:
a) For any array, rightmost element always has next greater element as -1.
b) For an array which is sorted in decreasing order, all elements have next greater element as -1.
c) For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.

Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1*/

   class FindNexrGreatesUsingPrevious{
   			public static void main(String[] args) {
   				int[] a={4,5,33,2,25};
   				help(a);
   			}
   			public static void help(int[] a){
   				int[] index=new int[a.length];
   				index[a.length-1]=-1;
   				for(int i=a.length-2;i>=0;i--){
   					int j=i+1;
   				
   					while(j!=-1){
   						if(a[j]>a[i]){
   							index[i]=j;
   							break;
   						}
   						j=index[j];
   					}
   					if(j==-1){
   						index[i]=-1;
   					}
   					
   				}
   				for(int i=0;i<a.length;i++){
   					if(index[i]!=-1){
   						System.out.print(a[index[i]]+" ");
   					}
   					else{
   						System.out.print("-1 ");	
   					}
   				}




   			}
   }
