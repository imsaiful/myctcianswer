import java.util.*;
class EvaluateExpression{
	public static void main(String[] args) {
		String str="100 * ( 2 + 12 ) / 14";
		System.out.println(help(str));
	}
	public static int help(String str){
		Char[] c=str.toCharArray();
		Stack<Integer> sv=new Stack<Integer>();
		Stack<Character> so=new Stack<Character>();
		for(int i=0;i<exp.length;i++){
			if(c[i]==' '){
				continue;
			}
			if(c[i]=='('){
				so.push(c);
			}
			else if(c[i]==')'){
				while(so.peek()!='('){
					sv.push(opr(so.pop(),sv.pop(),sv.pop()))
				}
				so.pop();
			}
			else if(c[i]>='0' && c[i]<='9'){
				StringBuilder sb=new StringBuilder();
				while(i < c.length && c[i] >= '0' && c[i] <= '9'){
					sb.append(c[i++]);
				}

				sv.push(Integer.parseInt(sb.toString()));
			}
			else if(c[i]=='+' || c[i]=='-' || c[i]=='*' || c[i]=='/'){
				while (!so.empty() && hasPrecedence(c[i], so.peek())){
					sv.push(opr(so.pop(), sv.pop(), sv.pop())); 	
				} 
				so.push(c[i]); 
			}
		}
		public static int opr(char c,int x,int y){
			if(c=='+'){
				return x+y;
			}
			else if(c=='-'){
				return x-y;
			}

			else if(c=='*'){
				return x*y;
			}

			else if(c=='/'){
				return x/y;
			}
		}
		public static boolean hasPrecedence(char c1,char c2){
			if(c1=='(' && c1==')'){
				return false;
			}
			else if(c1=='*' || c1=='/' && c2=='+' || c2=='-'){
				return false;
			}
			return true;
		}





	}


}