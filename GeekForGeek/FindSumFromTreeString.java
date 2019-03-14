/*it was quite simple, the question was similar to , given a level K , you have to
find out the sum of data of all the nodes at level K in a binary tree.
it was bit tricky the input is in the form
(P(C()())(C()()))
P is for Parent, C is for child.
if parent has one child : (P(C()())())
if parent has no child : (P()())*/

class FindSumFromTreeString{
	public static void main(String[] args) {
		String s="(0(5(6()())(4()(9()())))(7(1()())(3()())))";
		System.out.println(help(s,2));
	}
	public static int help(String s,int k){
		int flag=-1;
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				flag++;
			}
			else if(s.charAt(i)==')'){
				flag--;
			}
			else{
				if(flag==k){
					sum+=s.charAt(i)-'0';
				}
			}
		}
		return sum;



	}



}