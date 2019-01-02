class NextHighPermutation{
	public static void main(String[] args) {
		String s="4697557964"; 
		System.out.println(help(s));
	}
	public static String help(String s){
		char[] c=s.toCharArray();

		int n=c.length;
		int i,j,smallest;

		if(c.length<=3){
			return "Not Possible";
		}

		int mid=c.length/2-1;
		for(i=mid-1;i>=0;i--){
			if(c[i]<c[i+1]){
				break;
			}
		}
		if(i<=0){
			return "Not Possible";
		}

		smallest=i+1;

		for(j=i+2;j<=mid;j++){
			if(c[j]>c[i] && c[j]<c[smallest]){
				smallest=j;
			}

		}



		char t=c[i];
		c[i]=c[smallest];
		c[smallest]=t;

		t=c[n-i-1];
		c[n-i-1]=c[n-smallest-1];
		c[n-smallest-1]=t;

		reverse(c,i+1,mid);




		if(c.length%2==0){
			reverse(c,mid+1,n-i-2);
		}
		else{
			reverse(c,mid+2,n-i-2);	
		}


		StringBuilder sb=new StringBuilder();
		for(int k=0;k<c.length;k++){
			sb.append(c[k]);
		}

		return sb.toString();





	}

	public static void reverse(char[] a,int i,int j){
		while(i<j){
			char t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
		}
	}





















}