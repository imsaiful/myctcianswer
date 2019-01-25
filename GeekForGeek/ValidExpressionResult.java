/*Second question was of moderate level in which input is an expression string and you have to evaluate that given string is valid. If yes return the value of the expression, else return -1.
Input : 5+7*2
Output : 19

Input : 5++4
Output : -1 */

class ValidExpressionResult{
	public static void main(String[] args) {
		String s="5+7*2";
		Stack<Inetger> st1=new Stack<Integer>();
		Stack<Inetger> st2=new Stack<Integer>();
		for(int i=0;i<s.length;i++){
			if(s.charAt(i)>='0' && s.charAt(i)<='9'){
				st1.push(s.charAt(i));
			}
		}


	}
	

}