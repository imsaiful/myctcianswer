/*Rearrange characters in a string such that no two adjacent are same*/

import java.util.*;
import java.io.*;

class CharFrequency{
	char ch;
	int fq;
	CharFrequency(char c,int f){
		ch=c;
		fq=f;
	}
}


class KeyComparator implements Comparator<CharFrequency>{
	public int compare(CharFrequency c1,CharFrequency c2){
		if(c1.fq<c2.fq){
			return 1;
		}
		else if(c1.fq>c2.fq){
			return -1;
		}
		return 0;
	}
}



class ReArrangeString{
	public static void main(String[] args) {
		String s="aaabc";
		System.out.println(help(s));	
	}

	public static String help(String s){
		String str="";
		char[] ca=new char[256];

		PriorityQueue<CharFrequency> pq = new PriorityQueue<CharFrequency>(new KeyComparator());
		
              
		for(int i=0;i<s.length();i++){
			ca[(int)s.charAt(i)]++;
		}
		for(char c='a';c<='z';c++){
			int val=ca[(int)c];
			if(val>0){
				pq.add(new CharFrequency(c,val));
			}
		}

		CharFrequency prev=new CharFrequency('#',-1);
		while(pq.size()>0){
			CharFrequency k=pq.peek();
			pq.poll();
			str+=k.ch;
			if(prev.fq>0){
				pq.add(prev);
			}

			(k.fq)--;
			prev=k;
		}
		return str;
	}
}