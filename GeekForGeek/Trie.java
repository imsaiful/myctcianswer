/* Trie Data Structure*/
import java.util.*;
class Trie{
	private static class TrieNode{
		Map<Character,TrieNode> children;
		boolean endOfWOrd;
		public TrieNode(){
			children=new HashMap<>();
			endOfWOrd=false;
		}
	}
	private static final TrieNode root=new TrieNode();

	public static void Insert(String s){
		TrieNode cur=root;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			TrieNode temp=cur.children.get(c);
			if(temp==null){
				temp=new TrieNode();
				cur.children.put(c,temp);
			}
			cur=temp;
		}
		cur.endOfWOrd=true;
	}


	public static boolean Search(String s){
		TrieNode cur=root;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			TrieNode temp=cur.children.get(ch);
			if(temp==null){
				return false;
			}
			cur=temp;
		}
		return cur.endOfWOrd;
	}

	public static void main(String[] args){
		Insert("saiful");
		System.out.println(Search("saifulhasan"));
	}
}

