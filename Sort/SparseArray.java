class SparseArray{
	public static void main(String[] args){
		String[] s={"abc","abu","","eisa","god","","","","musa","","saif","zia"};
		int x=Find(s,"abu",0,s.length);
		System.out.println(x);
	}
	public static int Find(String a[],String s,int first,int last){
		if(first>last){
			return -1;
		}
		int mid=(first+last)/2;
		if(a[mid].isEmpty()){
			int left=mid-1;
			int right=mid+1;
			boolean flag=true;
			while(flag){
				if(left<first && right>last){
					flag=false;
				}
				else if(!a[right].isEmpty() && right<=last){
					mid=right;
					break;
				}
				else if(!a[left].isEmpty() && left>=first){
					mid=left;
					break;
				}
				left--;
				right++;

			}
		}
		if(s.equals(a[mid])){
			return mid;
		}
		else if(s.compareTo(a[mid])>0){
			return Find(a,s,mid+1,last);
		}
		else
			return Find(a,s,first,mid-1);
	


	}







}