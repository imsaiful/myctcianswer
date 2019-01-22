/*Leaders in an array
Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
Let the input array be arr[] and size of the array be size.*/
class LeadersInArray{
	public static void main(String[] args) {
		int[] a={16, 17, 4, 3, 5, 2}; 
		int n=a.length;
		int ll=a[n-1];
		String s=String.valueOf(a[n-1]+" ");
		for(int i=n-2;i>=0;i--){
			if(ll<a[i]){
				s=String.valueOf(a[i])+"  "+s;
				ll=a[i];
			}
		}
		System.out.println(s);
	}
}