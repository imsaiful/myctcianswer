import java.util.*;
class ArrayEqual{
	public static void main(String[] args) {
		int[] a={1,3,5,7,9,11,11};
		int[] b={1,11,9,7,5,3};
		int m=a.length;
		int n=b.length;
		if(m!=n){
			System.out.println("Not Equal");
			return;
		}

		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<m;i++){
			if (hm.containsKey(a[i])){
				hm.put(a[i],hm.get(a[i])+1);
			}else{
				hm.put(a[i],1);
			}

		}
		for(int i=0;i<n;i++){
			System.out.println(b[i]);
			if(!hm.containsKey(b[i])){
				System.out.println("Not equal");
				return;
			}
			
   
			else if(hm.get(b[i])==0){
				System.out.println("Not equal");	
				return;
			}
			else{
				int count=hm.get(b[i]);
				--count;
				hm.put(b[i],count); 

			}
		}
		System.out.println("Arrays are Equal");
	}
}