import java.util.*;
class ProductofTwo{

	public static void main(String[] args) {
		int[] a={10, 20, 9, 40};
		int x=400;
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			if(x%a[i]==0){
				if(hs.contains(x/a[i])){
					System.out.println("Pair Exist:"+a[i]+"*"+x/a[i]+"="+x);
					break;
				}
				hs.add(a[i]);
			}
		}
	}
	
}