import java.util.*;
class Majority{
	public static void main(String[] args) {
		int[] a= {3, 3, 4, 2, 4, 4, 2, 4, 4};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i],hm.get(a[i])+1);
				if(hm.get(a[i])>a.length/2){
					System.out.println("Majority element is "+a[i]);
					break;
				}
			}
			else
			{
				hm.put(a[i],1);
			}



		}


	}
}