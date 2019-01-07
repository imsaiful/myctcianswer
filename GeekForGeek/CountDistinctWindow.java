import java.util.*;
class CountDistinctWindow{
	public static void main(String[] args) {
		int arr[] =  {1, 2, 1, 3, 4, 2, 3}; 
        int k = 4; 
        help(arr, k); 
	}
	public static void help(int[] a,int k){
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int flag=0;
		int dc=0;
		for(int i=0;i<k;i++){
			if(hm.get(a[i])!=null){
				hm.put(a[i],hm.get(a[i])+1);
			}
			else{
				hm.put(a[i],1);	
				dc++;
			}
		}
		System.out.println(dc);
		for(int i=k;i<a.length;i++){
			if(hm.get(a[i-k])==1){
				hm.remove(a[i-k]);
				dc--;
			}
			else{
				hm.put(a[i-k],hm.get(a[i-k])-1);	
			}
			if(hm.get(a[i])!=null){
				hm.put(a[i],hm.get(a[i])+1);
			}
			else{
				hm.put(a[i],1);	
				dc++;
			}
			System.out.println(dc);
		}
	}
}