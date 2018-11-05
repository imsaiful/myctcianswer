//Find the element that appears once
class FindbwThree{
	public static void main(String[] args) {
		int[]  a = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
		int f=0;
		int s=0;
		for(int i=0;i<a.length;i++){
			s=s|(f&a[i]);
			f=f^a[i];
			int n=~(f&s);
			f=f&n;
			s=s&n;
		}	
		System.out.println(f);
	}
}