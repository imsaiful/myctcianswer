class ZeroCount{
	public static void main(String[] args) {
		int[] a={1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		int wl=0;
		int wr=0;
		int bl=0;
		int bw=0,zc=0;

		while(wr<a.length){
			if(zc<=1){
				if(a[wr]==0){
					zc++;
				}
				wr++;
			}
			if(zc>1){
				if(a[wl]==0){
					zc--;
				}
				wl++;
			}

			if(wr-wl>bw && zc<=1){
				//System.out.println(wr+"  "+wl);
				bw=wr-wl;
				bl=wl;
			}
		}

		for(int i=0;i<bw;i++){
			if(a[bl+i]==0){
				System.out.println((bl+i)+" ");
			}
		}
	}


}