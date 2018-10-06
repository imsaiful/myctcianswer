import java.util.*;
import java.io.*;

class Remove_repeated{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("Enter the string");
		String s=br.readLine();
		String ans=Operation(s);
		System.out.println(ans);
	}
	public static String Operation(String s){
		int n=s.length();
		char count[]=new char[26];
		for(int i=0;i<n;i++){
			count[s.charAt(i)-'a']++;
		}


	

	Comparator<Data> comparator=new PQComparator();
	PriorityQueue<Data> pq=new PriorityQueue<Data>(26,comparator);

	for(char cc='a';cc<='z';cc++)
	{

		if(count[cc-'a']!=0){
			Data x=new Data();
			x.character=cc;
			x.freq=count[cc-'a'];
			pq.add(x);

		}
	}


	StringBuilder sb=new StringBuilder();
	Data prev=new Data();
	prev.character='#';
	prev.freq=-1;

	while(pq.size()!=0){
		Data d=pq.poll();
		sb.append(d.character);
		if(prev.freq>0){
			pq.add(prev);
		}
		d.freq-=1;
		prev=d;
	}

	return sb.toString();


}
}


class Data{
	char character;
	int freq;
}

class PQComparator implements Comparator<Data>{
	@Override
	public int compare(Data a, Data b){
		if(a.freq>b.freq){
			return -1;
		}
		else if(a.freq<b.freq){
			return 1;
		}
		return 0;
	}
}




